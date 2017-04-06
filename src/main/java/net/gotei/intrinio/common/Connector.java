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
import java.util.Objects;

/**
 * HTTP Connection Helper Class.
 */
public class Connector {
    private HttpClient httpclient;

    public Connector(String USERNAME, String PASSWORD) {
        if (Objects.isNull(USERNAME) || USERNAME.isEmpty()){
            throw new IllegalArgumentException("USERNAME cannot be empty");
        }
        if (Objects.isNull(PASSWORD) || PASSWORD.isEmpty()){
            throw new IllegalArgumentException("PASSWORD cannot be empty");
        }
        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials
                = new UsernamePasswordCredentials(USERNAME, PASSWORD);
        provider.setCredentials(AuthScope.ANY, credentials);
        httpclient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
    }

    public JsonElement getContent(String path, Map<String, String> queryParams){
        JsonElement object = null;
        URIBuilder builder = new URIBuilder();

        builder.setScheme("https").setHost(Constants.getBaseUrl()).setPath(path);
        for (String name : queryParams.keySet()){
            builder.addParameter(name,queryParams.get(name));
        }
        try {
            HttpGet request = new HttpGet(builder.build());
            HttpResponse response = httpclient.execute(request);
            if (response.getStatusLine().getStatusCode() == ResponseCodes.OK.getCode()){
                object = getJsonFromStream(response.getEntity().getContent());
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }

    private static JsonElement getJsonFromStream(InputStream stream) throws IOException {
        BufferedReader streamReader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
        StringBuilder responseStrBuilder = new StringBuilder();

        String inputStr;
        while ((inputStr = streamReader.readLine()) != null)
            responseStrBuilder.append(inputStr);
        JsonElement object = new JsonParser().parse(responseStrBuilder.toString());
        return object;
    }
}
