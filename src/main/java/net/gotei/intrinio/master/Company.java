package net.gotei.intrinio.master;

import net.gotei.intrinio.common.Result;

import java.util.Objects;

/**
 * Company covered by the Intrinio Data Marketplace.
 */
public class Company implements Result {
    /**  - the stock market ticker symbol associated with the companies common stock securities */
    private String ticker;
    /**  - the Central Index Key issued by the SEC, which is the unique identifier all company filings are issued under */
    private String cik;
    /**  - the Legal Entity Identifier for the company */
    private String lei;
    /**  - the company name in shorter form */
    private String name;
    /**  - the filing date of the latest available SEC filing for the company */
    private String latest_filing_date;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCik() {
        return cik;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public String getLei() {
        return lei;
    }

    public void setLei(String lei) {
        this.lei = lei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatest_filing_date() {
        return latest_filing_date;
    }

    public void setLatest_filing_date(String latest_filing_date) {
        this.latest_filing_date = latest_filing_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(ticker, company.ticker) &&
                Objects.equals(cik, company.cik) &&
                Objects.equals(lei, company.lei) &&
                Objects.equals(name, company.name) &&
                Objects.equals(latest_filing_date, company.latest_filing_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker, cik, lei, name, latest_filing_date);
    }

    @Override
    public String toString() {
        return "Company{" +
                "ticker='" + ticker + '\'' +
                ", cik='" + cik + '\'' +
                ", lei='" + lei + '\'' +
                ", name='" + name + '\'' +
                ", latest_filing_date='" + latest_filing_date + '\'' +
                '}';
    }
}
