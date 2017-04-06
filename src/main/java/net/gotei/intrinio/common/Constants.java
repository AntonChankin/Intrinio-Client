package net.gotei.intrinio.common;

/**
 * Constant values common for all API calls.
 */
public class Constants {
    private static final String BASE_URL = "api.intrinio.com";
    private static final String HISTORICAL_PATH = "/usage/historical";
    private static final String ACCESS_LIMITS_PATH = "/usage/access";
    private static final String CURRENT_LIMITS_PATH = "/usage/current";
    private static final String COMPANY_MASTER_PATH = "/companies";


    // Paging Limits
    private static final int pricesEndpointLimit = 50000;
    private static final int historical_dataEndpointLimit = 50000;
    private static final int tagsStandardizedEndpointLimit = 5000;
    private static final int tagsReportedEndpointLimit = 5000;
    private static final int tagsBanksEndpointLimit = 5000;
    private static final int financialsStandardizedEndpointLimit = 5000;
    private static final int financialsReportedEndpointLimit = 5000;
    private static final int financialsBanksEndpointLimit = 5000;
    private static final int analyst_ratingsEndpointLimit = 100;
    private static final int blogger_ratingsEndpointLimit = 100;
    private static final int news_sentimentsEndpointLimit = 100;
    private static final int news_sector_sentimentsEndpointLimit = 100;
    private static final int fileDownloadEndpointLimit = 10000;
    private static final int othersEndpointLimit = 250;

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getHistoricalPath() {
        return HISTORICAL_PATH;
    }

    public static String getAccessLimitsPath() {
        return ACCESS_LIMITS_PATH;
    }

    public static String getCurrentLimitsPath() {
        return CURRENT_LIMITS_PATH;
    }

    public static String getCompanyMasterPath() {
        return COMPANY_MASTER_PATH;
    }
}
