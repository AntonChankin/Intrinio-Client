package com.intrinio;

import com.intrinio.common.Constants;
import com.intrinio.common.Extractor;
import com.intrinio.master.Company;
import com.intrinio.usage.CurrentLimit;
import com.intrinio.usage.HistoricalCell;
import com.intrinio.common.PagedResponse;
import com.intrinio.master.Security;
import com.intrinio.usage.AccessLimits;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

/**
 * Main class
 * @author Anton Chankin
 * @version 0.0.1
 */
public class IntrinioClient {
    private static final Logger LOGGER = LogManager.getLogger(IntrinioClient.class);
    private final String USERNAME;
    private final String PASSWORD;
    private Extractor extractor;

    /**
     * Only constructor.
     * @param USERNAME Intrinio Access Key's username
     * @param PASSWORD Intrinio Access Key's password
     */
    public IntrinioClient(String USERNAME, String PASSWORD) {
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.extractor = new Extractor(USERNAME, PASSWORD);
    }

    /**
     * Return today’s current usage and limit information for the given access code.
     * @param access_code the access code
     * @return pairs date and usage
     */
    public List<HistoricalCell> getHistoricalUsage(String access_code){
        LOGGER.info("Requesting Historical Usage for access code " + access_code);
        List<HistoricalCell> cells = new ArrayList<HistoricalCell>();
        Map<String,String> param = new HashMap<String, String>(1);
        if (access_code != null && !access_code.isEmpty()) {
            param.put("access_code",access_code);
        }
        PagedResponse<HistoricalCell> pagedResult = extractor.getPagedResult(Constants.getHistoricalPath(),param,HistoricalCell.class);
        if (pagedResult.getResult_count() != null && pagedResult.getResult_count().intValue() > 0) {
            cells.addAll(pagedResult.getData());
            int totalPages = pagedResult.getTotal_pages().intValue();
            for (int page = 2; page < totalPages; page++) {
                param.put("page_number", String.valueOf(page));
                pagedResult = extractor.getPagedResult(Constants.getHistoricalPath(),param,HistoricalCell.class);
                cells.addAll(pagedResult.getData());
            }
        }
        return cells;
    }

    /**
     * Returns a list of your authorized access codes and their daily limits.
     * @return limits per access code
     */
    public List<AccessLimits> getAccessLimits(){
        LOGGER.info("Requesting Access Limits");
        return extractor.getAccessLimits();
    }

    /**
     * Return today’s current usage and limit information for the given access code.
     * @param access_code the access code
     * @return limits per access code
     */
    public List<CurrentLimit> getCurrentUsage(String access_code) {
        LOGGER.info("Requesting Current usage");
        return extractor.getCurrentUsage(access_code);
    }

    /**
     * Returns the master list of all companies covered by the Intrinio Data Marketplace.
     * @param query (optional, returns full list of companies with compacted response values, if no query specified) - a string query search of company name or ticker symbol with the returned results being the relevant companies in compacted list format.
     * @param latest_filing_date a date value that returns the list of companies whose latest SEC filing was filed on or after this date: YYYY-MM-DD
     * @return list of companies
     */
    public List<Company> getCompanies(String query, String latest_filing_date ){
        LOGGER.info("Requesting list of companies for query " + query + " and date " + latest_filing_date);
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
            companies.addAll(pagedResult.getData());
            int totalPages = pagedResult.getTotal_pages().intValue();
            for (int page = 2; page < totalPages; page++) {
                param.put("page_number", String.valueOf(page));
                pagedResult = extractor.getPagedResult(Constants.getCompanyMasterPath(),param,Company.class);
                companies.addAll(pagedResult.getData());
            }
        }
        return companies;
    }

    /**
     * Returns the master list of all securities covered by the Intrinio Data Marketplace.
     * @param query (optional, returns list of securities with compacted response values, if no query specified) - a string query search of security name or ticker symbol with the returned results being the relevant securities in compacted list format.
     * @param identifier (optional, returns list of securities with compacted response values, if no identifier specified) - the identifier for the legal entity or a security associated with the company: TICKER SYMBOL | FIGI | OTHER IDENTIFIER
     * @param exch_symbol (optional, returns list of all securities with compacted response values, if no query specified) - the Intrinio Stock Market Symbol, to specify the exchange for the list of securities: STOCK EXCHANGE IDENTIFIER
     * @param us_only (optional, returns list of all US securities if true)
     * @return list of all securities
     */
    public List<Security> getSecurities(String query, String identifier, String exch_symbol, boolean us_only ){
        LOGGER.info("Requesting list of companies for query " + query + ", identifier " + identifier + " on exchange " + exch_symbol + " US Only = " + us_only);
        List<Security> securities = new ArrayList<Security>();
        Map<String,String> param = new HashMap<String, String>(1);
        if (query != null && !query.isEmpty()) {
            param.put("query",query);
        }
        if (identifier != null && !identifier.isEmpty()) {
            param.put("latest_filing_date",identifier);
        }
        if (exch_symbol != null && !exch_symbol.isEmpty()) {
            param.put("exch_symbol",identifier);
        }
        if (us_only){
            param.put("us_only","true");
        }
        PagedResponse<Security> pagedResult = extractor.getPagedResult(Constants.getSecurityMasterPath(),param,Security.class);
        if (pagedResult.getResult_count() != null && pagedResult.getResult_count().intValue() > 0) {
            securities.addAll(pagedResult.getData());
            int totalPages = pagedResult.getTotal_pages().intValue();
            for (int page = 2; page < totalPages; page++) {
                param.put("page_number", String.valueOf(page));
                pagedResult = extractor.getPagedResult(Constants.getSecurityMasterPath(),param,Security.class);
                securities.addAll(pagedResult.getData());
            }
        }
        return securities;
    }

    public static void main(String[] args) {
        String USERNAME = "cf1f59ad6b2a2438715016d5ae886361";
        String PASSWORD = "6c4577f27878943afb8d6bf938fef791";
        IntrinioClient client = new IntrinioClient(USERNAME,PASSWORD);
        for (Security security :
                client.getSecurities(null, null, null, true)) {
            System.out.println(security.toString());
        }
    }
}
