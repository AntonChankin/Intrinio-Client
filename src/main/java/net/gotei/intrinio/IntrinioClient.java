package net.gotei.intrinio;

import net.gotei.intrinio.common.Connector;
import net.gotei.intrinio.common.Constants;
import net.gotei.intrinio.common.Extractor;
import net.gotei.intrinio.common.PagedResponse;
import net.gotei.intrinio.master.Company;
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
        if (access_code != null && !access_code.isEmpty()) {
            param.put("access_code",access_code);
        }
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

    public List<Company> getCompanies(String query, String latest_filing_date ){
        List<Company> companies = new ArrayList<Company>();
        Map<String,String> param = new HashMap<String, String>(1);
        if (query != null && !query.isEmpty()) {
            param.put("query",query);
        }
        if (latest_filing_date != null && !latest_filing_date.isEmpty()) {
            param.put("latest_filing_date",latest_filing_date);
        }
        PagedResponse<Company> pagedResult = extractor.getPagedResult(Constants.getCompanyMasterPath(),param,Company.class);
        if (pagedResult.getResult_count() != null && pagedResult.getResult_count().intValue() > 0) {
            Collections.addAll(companies, pagedResult.getData());
            int totalPages = pagedResult.getTotal_pages().intValue();
            for (int page = 2; page < totalPages; page++) {
                param.put("page_number", String.valueOf(page));
                pagedResult = extractor.getPagedResult(Constants.getHistoricalPath(),param,Company.class);
                Collections.addAll(companies, pagedResult.getData());
            }
        }
    }
}
