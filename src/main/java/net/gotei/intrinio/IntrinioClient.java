package net.gotei.intrinio;

import net.gotei.intrinio.common.Connector;
import net.gotei.intrinio.common.Constants;
import net.gotei.intrinio.common.Extractor;
import net.gotei.intrinio.common.PagedResponse;
import net.gotei.intrinio.usage.AccessLimits;
import net.gotei.intrinio.usage.CurrentLimit;
import net.gotei.intrinio.usage.HistoricalCell;

import java.util.*;

/**
 * Main class
 */
public class IntrinioClient {
    private final String USERNAME;
    private final String PASSWORD;
    private Extractor extractor;

    public IntrinioClient(String USERNAME, String PASSWORD) {
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.extractor = new Extractor(USERNAME, PASSWORD);
    }

    public List<HistoricalCell> getHistoricalUsage(String access_code){
        List<HistoricalCell> cells = new ArrayList<HistoricalCell>();
        Map<String,String> param = new HashMap<String, String>(1);
        param.put("access_code",access_code);
        PagedResponse<HistoricalCell> pagedResult = extractor.getPagedResult(Constants.getHistoricalPath(),param,HistoricalCell.class);
        if (pagedResult.getResult_count() != null && pagedResult.getResult_count().intValue() > 0) {
            Collections.addAll(cells, pagedResult.getData());
            int totalPages = pagedResult.getTotal_pages().intValue();
            for (int page = 2; page < totalPages; page++) {
                param.put("page_number", String.valueOf(page));
                pagedResult = extractor.getPagedResult(Constants.getHistoricalPath(),param,HistoricalCell.class);
                Collections.addAll(cells, pagedResult.getData());
            }
        }
        return cells;
    }

    public List<AccessLimits> getAccessLimits(){
        return extractor.getAccessLimits();
    }

    public List<CurrentLimit> getCurrentUsage(String access_code) {
        return extractor.getCurrentUsage(access_code);
    }
}
