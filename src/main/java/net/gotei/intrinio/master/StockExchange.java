package net.gotei.intrinio.master;

import java.util.Objects;

/**
 * Information on stock exchange covered by Intrinio.
 */
public class StockExchange {
    /**  - the Intrinio symbol associated with the stock exchange */
    private String symbol;
    /**  - the MIC identifier for the stock exchange */
    private String mic;
    /**  - the name of the stock exchange */
    private String institution_name;
    /**  - the stock exchanges short form identifier */
    private String acronym;
    /**  - the city where the stock exchange is located */
    private String city;
    /**  - the country where the stock exchange is located */
    private String country;
    /**  - the country code for the country where the stock exchange is located */
    private String country_code;
    /**  - the website for the stock exchange */
    private String website;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getMic() {
        return mic;
    }

    public void setMic(String mic) {
        this.mic = mic;
    }

    public String getInstitution_name() {
        return institution_name;
    }

    public void setInstitution_name(String institution_name) {
        this.institution_name = institution_name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockExchange that = (StockExchange) o;
        return Objects.equals(symbol, that.symbol) &&
                Objects.equals(mic, that.mic) &&
                Objects.equals(institution_name, that.institution_name) &&
                Objects.equals(acronym, that.acronym) &&
                Objects.equals(city, that.city) &&
                Objects.equals(country, that.country) &&
                Objects.equals(country_code, that.country_code) &&
                Objects.equals(website, that.website);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, mic, institution_name, acronym, city, country, country_code, website);
    }

    @Override
    public String toString() {
        return "StockExchange{" +
                "symbol='" + symbol + '\'' +
                ", mic='" + mic + '\'' +
                ", institution_name='" + institution_name + '\'' +
                ", acronym='" + acronym + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", country_code='" + country_code + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
