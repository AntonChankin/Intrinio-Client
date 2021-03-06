package net.gotei.intrinio.common;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.gotei.intrinio.usage.AccessLimits;
import net.gotei.intrinio.usage.CurrentLimit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Extracts entities from JSON.
 */
public class Extractor {
    private Connector connector;

    public Extractor(String USERNAME, String PASSWORD) {
        this.connector = new Connector(USERNAME, PASSWORD);
    }

    public <T extends Result> PagedResponse<T> getPagedResult(String path, Map<String, String> queryParams, Class<T> type) {
        List<T> answer = new ArrayList<T>();
        PagedResponse<T> pagedResponse = new PagedResponse<T>();

        Gson gson = new Gson();
        JsonObject root = connector.getContent(path, queryParams).getAsJsonObject();
        pagedResponse.setCurrent_page(root.get("current_page").getAsBigDecimal());
        pagedResponse.setResult_count(root.get("result_count").getAsBigDecimal());
        pagedResponse.setPage_size(root.get("page_size").getAsBigDecimal());
        pagedResponse.setTotal_pages(root.get("total_pages").getAsBigDecimal());
        JsonArray data = root.getAsJsonArray("data");
        for (JsonElement object : data){
            answer.add(gson.fromJson(object, type));
        }
        return pagedResponse;
    }

    public List<AccessLimits> getAccessLimits(){
        List<AccessLimits> limits = new ArrayList<AccessLimits>();
        Gson gson = new Gson();
        JsonArray array = connector.getContent(Constants.getAccessLimitsPath(), new HashMap<String, String>(0)).getAsJsonArray();
        for (JsonElement element : array) {
            AccessLimits limit = gson.fromJson(element,AccessLimits.class);
            limits.add(limit);
        }
        return limits;
    }

    public List<CurrentLimit> getCurrentUsage(String access_code) {
        List<CurrentLimit> limits = new ArrayList<CurrentLimit>();
        Gson gson = new Gson();
        Map<String, String> params = new HashMap<String, String>(1);
        params.put("access_code",access_code);
        JsonArray array = connector.getContent(Constants.getCurrentLimitsPath(), params).getAsJsonArray();
        for (JsonElement element : array) {
            CurrentLimit limit = gson.fromJson(element,CurrentLimit.class);
            limits.add(limit);
        }
        return limits;
    }
}
