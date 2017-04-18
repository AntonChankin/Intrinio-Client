package com.intrinio.usage;

/**
 * Access codes represent the data you are allowed to access. Each API call counts against a particular access code. The access codes correspond to data feeds.
 */
public enum Codes {
    /**- Global Public Company Security Master Data Feed */
    com_sec_master_data,
    /**- US Public Company Financials Data Feed */
    com_fin_data,
    /**- US Sector & Industry Data Feed */
    industry_data,
    /**- US Bank & Bank Holding Company Data Feed */
    fdic_data,
    /**- US & Global Economic Data Feed */
    econ_data,
    /**- US Insider Transactions & Ownership Data Feed */
    insider_trans,
    /**- US Institutional Holdings Data Feed */
    inst_hold;
}
