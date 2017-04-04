package net.gotei.intrinio.common;

/**
 * Constant values common for all API calls.
 */
public class Constants {
    private static final String BASE_URL = "https://api.intrinio.com";

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

}
