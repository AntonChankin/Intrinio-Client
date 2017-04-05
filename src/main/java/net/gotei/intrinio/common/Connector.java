package net.gotei.intrinio.common;

import com.google.gson.*;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * HTTP Connection Helper Class.
 */
public class Connector {
    private HttpClient httpclient;

    public Connector(String USERNAME, String PASSWORD) {
        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials(USERNAME, PASSWORD);
        provider.setCredentials(AuthScope.ANY, credentials);
        httpclient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
    }

    public <T extends Result> PagedResponse<T> getPagedResult(String path, Map<String, String> queryParams, Class<T> type) {
        URIBuilder builder = new URIBuilder();
        List<T> answer = new ArrayList<T>();
        PagedResponse<T> pagedResponse = new PagedResponse<T>();
        builder.setScheme("https").setHost(Constants.getBaseUrl()).setPath(path);
        for (String name : queryParams.keySet()){
            builder.addParameter(name,queryParams.get(name));
        }
        try {
            HttpGet request = new HttpGet(builder.build());
            HttpResponse response = httpclient.execute(request);
            if (response.getStatusLine().getStatusCode() == ResponseCodes.OK.getCode()){
                Gson gson = new Gson();
                JsonObject root = getJsonFromStream(response.getEntity().getContent());
                pagedResponse.setCurrent_page(root.get("current_page").getAsBigDecimal());
                pagedResponse.setResult_count(root.get("result_count").getAsBigDecimal());
                pagedResponse.setPage_size(root.get("page_size").getAsBigDecimal());
                pagedResponse.setTotal_pages(root.get("total_pages").getAsBigDecimal());
                JsonArray data = root.getAsJsonArray("data");
                for (JsonElement object : data){
                    answer.add(gson.fromJson(object, type));
                }
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pagedResponse;
    }

    private static JsonObject getJsonFromStream(InputStream stream) throws IOException {
        BufferedReader streamReader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
        StringBuilder responseStrBuilder = new StringBuilder();

        String inputStr;
        while ((inputStr = streamReader.readLine()) != null)
            responseStrBuilder.append(inputStr);
        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(responseStrBuilder.toString());
        JsonObject object = element.getAsJsonObject();
        return object;
    }
}
