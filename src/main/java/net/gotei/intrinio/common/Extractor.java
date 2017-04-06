package net.gotei.intrinio.common;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
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
        JsonObject root = connector.getContent(path, queryParams);
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


}
