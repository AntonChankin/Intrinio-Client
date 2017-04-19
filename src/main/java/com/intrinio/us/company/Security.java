package com.intrinio.us.company;

import java.util.Objects;

/**
 * Returns security list and information for all securities covered by Intrinio.
 * http://docs.intrinio.com/#securities
 */
public class Security {
    /** - the stock market ticker symbol associated with the companies common stock securities */
    private String ticker;
    /** - the OpenFIGI ticker symbol */
    private String figi_ticker;
    /** - the OpenFIGI identifier */
    private String figi;
    /** - the security description as provided by the exchange */
    private String security_name;
    /** - the type of market for the security */
    private String market_sector;
    /** - the type of security, such as Common Stock, Preferred Stock, Warrants, Limited Partnership Interests, etc. */
    private String security_type;
    /** - the Stock Exchange (and market category) where the company’s common stock is primarily traded */
    private String stock_exchange;
    /** - the last recorded date (“YYYY-MM-DD”) of an CRSP adjustment made to prior prices due to a stock split or dividend event.*/
    private String last_crsp_adj_date;
    /** - the security’s composite FIGI identifier */
    private String composite_figi;
    /** - the security’s unique FIGI identifier */
    private String figi_uniqueid;
    /** - the security’s share class FIGI identifier */
    private String share_class_figi;
    /** - the security’s FIGI country of the exchange */
    private String figi_exch_cntry;
    /** - the security’s traded currency on the listed exchange */
    private String currency;
    /** - the Market Identification Code for the Stock Exchange where the security is listed. */
    private String mic;
    /** - the Intrinio Stock Exchange Symbol used as an identifier on the Intrinio API. */
    private String exch_symbol;
    /** - a boolean to represent whether the security is an ETF or otherwise */
    private Boolean etf;
    /**- if the security is no longer traded on public exchanges, the security will be considered delisted and the security no longer will report pricing data.*/
    private Boolean delisted_security;
    /** - a boolean to represent whether the security is the primary issue or a secondary issue of the security on a different stock exchange. */
    private Boolean primary_listing;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getFigi_ticker() {
        return figi_ticker;
    }

    public void setFigi_ticker(String figi_ticker) {
        this.figi_ticker = figi_ticker;
    }

    public String getFigi() {
        return figi;
    }

    public void setFigi(String figi) {
        this.figi = figi;
    }

    public String getSecurity_name() {
        return security_name;
    }

    public void setSecurity_name(String security_name) {
        this.security_name = security_name;
    }

    public String getMarket_sector() {
        return market_sector;
    }

    public void setMarket_sector(String market_sector) {
        this.market_sector = market_sector;
    }

    public String getSecurity_type() {
        return security_type;
    }

    public void setSecurity_type(String security_type) {
        this.security_type = security_type;
    }

    public String getStock_exchange() {
        return stock_exchange;
    }

    public void setStock_exchange(String stock_exchange) {
        this.stock_exchange = stock_exchange;
    }

    public String getLast_crsp_adj_date() {
        return last_crsp_adj_date;
    }

    public void setLast_crsp_adj_date(String last_crsp_adj_date) {
        this.last_crsp_adj_date = last_crsp_adj_date;
    }

    public String getComposite_figi() {
        return composite_figi;
    }

    public void setComposite_figi(String composite_figi) {
        this.composite_figi = composite_figi;
    }

    public String getFigi_uniqueid() {
        return figi_uniqueid;
    }

    public void setFigi_uniqueid(String figi_uniqueid) {
        this.figi_uniqueid = figi_uniqueid;
    }

    public String getShare_class_figi() {
        return share_class_figi;
    }

    public void setShare_class_figi(String share_class_figi) {
        this.share_class_figi = share_class_figi;
    }

    public String getFigi_exch_cntry() {
        return figi_exch_cntry;
    }

    public void setFigi_exch_cntry(String figi_exch_cntry) {
        this.figi_exch_cntry = figi_exch_cntry;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getMic() {
        return mic;
    }

    public void setMic(String mic) {
        this.mic = mic;
    }

    public String getExch_symbol() {
        return exch_symbol;
    }

    public void setExch_symbol(String exch_symbol) {
        this.exch_symbol = exch_symbol;
    }

    public Boolean getEtf() {
        return etf;
    }

    public void setEtf(Boolean etf) {
        this.etf = etf;
    }

    public Boolean getDelisted_security() {
        return delisted_security;
    }

    public void setDelisted_security(Boolean delisted_security) {
        this.delisted_security = delisted_security;
    }

    public Boolean getPrimary_listing() {
        return primary_listing;
    }

    public void setPrimary_listing(Boolean primary_listing) {
        this.primary_listing = primary_listing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Security)) return false;
        Security security = (Security) o;
        return Objects.equals(ticker, security.ticker) &&
                Objects.equals(figi_ticker, security.figi_ticker) &&
                Objects.equals(figi, security.figi) &&
                Objects.equals(security_name, security.security_name) &&
                Objects.equals(market_sector, security.market_sector) &&
                Objects.equals(security_type, security.security_type) &&
                Objects.equals(stock_exchange, security.stock_exchange) &&
                Objects.equals(last_crsp_adj_date, security.last_crsp_adj_date) &&
                Objects.equals(composite_figi, security.composite_figi) &&
                Objects.equals(figi_uniqueid, security.figi_uniqueid) &&
                Objects.equals(share_class_figi, security.share_class_figi) &&
                Objects.equals(figi_exch_cntry, security.figi_exch_cntry) &&
                Objects.equals(currency, security.currency) &&
                Objects.equals(mic, security.mic) &&
                Objects.equals(exch_symbol, security.exch_symbol) &&
                Objects.equals(etf, security.etf) &&
                Objects.equals(delisted_security, security.delisted_security) &&
                Objects.equals(primary_listing, security.primary_listing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker, figi_ticker, figi, security_name, market_sector, security_type, stock_exchange, last_crsp_adj_date, composite_figi, figi_uniqueid, share_class_figi, figi_exch_cntry, currency, mic, exch_symbol, etf, delisted_security, primary_listing);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Security{");
        sb.append("ticker='").append(ticker).append('\'');
        sb.append(", figi_ticker='").append(figi_ticker).append('\'');
        sb.append(", figi='").append(figi).append('\'');
        sb.append(", security_name='").append(security_name).append('\'');
        sb.append(", market_sector='").append(market_sector).append('\'');
        sb.append(", security_type='").append(security_type).append('\'');
        sb.append(", stock_exchange='").append(stock_exchange).append('\'');
        sb.append(", last_crsp_adj_date='").append(last_crsp_adj_date).append('\'');
        sb.append(", composite_figi='").append(composite_figi).append('\'');
        sb.append(", figi_uniqueid='").append(figi_uniqueid).append('\'');
        sb.append(", share_class_figi='").append(share_class_figi).append('\'');
        sb.append(", figi_exch_cntry='").append(figi_exch_cntry).append('\'');
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", mic='").append(mic).append('\'');
        sb.append(", exch_symbol='").append(exch_symbol).append('\'');
        sb.append(", etf=").append(etf);
        sb.append(", delisted_security=").append(delisted_security);
        sb.append(", primary_listing=").append(primary_listing);
        sb.append('}');
        return sb.toString();
    }
}
