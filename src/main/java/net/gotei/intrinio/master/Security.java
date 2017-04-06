package net.gotei.intrinio.master;

import java.util.Objects;

/**
 * Security covered by the Intrinio Data Marketplace
 */
public class Security {
    /**  - the stock market ticker symbol associated with the companies common stock securities */
    private String ticker;
    /**  - the security description as provided by the exchange */
    private String security_name;
    /**  - the type of security, such as Common Stock, Preferred Stock, Warrants, Limited Partnership Interests, etc. */
    private String security_type;
    /**  - the stock exchange mic code */
    private String mic;
    /**  - the Stock Exchange (and market category) where the company’s common stock is primarily traded */
    private String stock_exchange;
    /**  - the Country where the stock exchange is located where the security primarily trades */
    private String exchg_cntry;
    /**  - a boolean to represent whether the security is an ETF or otherwise */
    private String etf;
    /**  - true if the subject security is the primary security for the company. If a security is the default, the ticker symbol for the security is the same as the ticker for the company (see /Companies endpoint). */
    private String primary_security;
    /**  - if the security is no longer traded on public exchanges, the security will be considered delisted and the security no longer will report pricing data. */
    private String delisted_security;
    /**  - the last recorded date (“YYYY-MM-DD”) of an CRSP adjustment made to prior prices due to a stock split or dividend event. */
    private String last_crsp_adj_date;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getSecurity_name() {
        return security_name;
    }

    public void setSecurity_name(String security_name) {
        this.security_name = security_name;
    }

    public String getSecurity_type() {
        return security_type;
    }

    public void setSecurity_type(String security_type) {
        this.security_type = security_type;
    }

    public String getMic() {
        return mic;
    }

    public void setMic(String mic) {
        this.mic = mic;
    }

    public String getStock_exchange() {
        return stock_exchange;
    }

    public void setStock_exchange(String stock_exchange) {
        this.stock_exchange = stock_exchange;
    }

    public String getExchg_cntry() {
        return exchg_cntry;
    }

    public void setExchg_cntry(String exchg_cntry) {
        this.exchg_cntry = exchg_cntry;
    }

    public String getEtf() {
        return etf;
    }

    public void setEtf(String etf) {
        this.etf = etf;
    }

    public String getPrimary_security() {
        return primary_security;
    }

    public void setPrimary_security(String primary_security) {
        this.primary_security = primary_security;
    }

    public String getDelisted_security() {
        return delisted_security;
    }

    public void setDelisted_security(String delisted_security) {
        this.delisted_security = delisted_security;
    }

    public String getLast_crsp_adj_date() {
        return last_crsp_adj_date;
    }

    public void setLast_crsp_adj_date(String last_crsp_adj_date) {
        this.last_crsp_adj_date = last_crsp_adj_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Security security = (Security) o;
        return Objects.equals(ticker, security.ticker) &&
                Objects.equals(security_name, security.security_name) &&
                Objects.equals(security_type, security.security_type) &&
                Objects.equals(mic, security.mic) &&
                Objects.equals(stock_exchange, security.stock_exchange) &&
                Objects.equals(exchg_cntry, security.exchg_cntry) &&
                Objects.equals(etf, security.etf) &&
                Objects.equals(primary_security, security.primary_security) &&
                Objects.equals(delisted_security, security.delisted_security) &&
                Objects.equals(last_crsp_adj_date, security.last_crsp_adj_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker, security_name, security_type, mic, stock_exchange, exchg_cntry, etf, primary_security, delisted_security, last_crsp_adj_date);
    }

    @Override
    public String toString() {
        return "Security{" +
                "ticker='" + ticker + '\'' +
                ", security_name='" + security_name + '\'' +
                ", security_type='" + security_type + '\'' +
                ", mic='" + mic + '\'' +
                ", stock_exchange='" + stock_exchange + '\'' +
                ", exchg_cntry='" + exchg_cntry + '\'' +
                ", etf='" + etf + '\'' +
                ", primary_security='" + primary_security + '\'' +
                ", delisted_security='" + delisted_security + '\'' +
                ", last_crsp_adj_date='" + last_crsp_adj_date + '\'' +
                '}';
    }
}
