package com.intrinio.us.company;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * http://docs.intrinio.com/#companies
 */
public class Company {
    /** - the stock market ticker symbol associated with the companies common stock securities */
    private String ticker;
    /** - the Central Index Key issued by the SEC, which is the unique identifier all company filings are issued under */
    private String cik;
    /** - the company name in shorter form */
    private String name;
    /** - the company’s official legal name */
    private String legal_name;
    /** - the Legal Entity Identifier for the company */
    private String lei;
    /** - the company’s headquarters address line 1 */
    private String hq_address1;
    /** - the company’s headquarters address line 2 */
    private String hq_address2;
    /** - the company’s headquarters city */
    private String hq_address_city;
    /** - the company’s headquarters postal code */
    private String hq_address_postal_code;
    /** - the company’s legal organization form */
    private String entity_legal_form;
    /** - the state (US & Canada Only) where the company headquarters is located */
    private String state;
    /** - the country where the company headquarters is located */
    private String country;
    /** - the state (US & Canada Only) where the company is incorporated */
    private String inc_state;
    /** - the country where the company is incorporated */
    private String inc_country;
    /** - the Standard Industrial Classification (SIC) determined by the company filed with the SEC */
    private BigDecimal sic;
    /** - the Stock Exchange where the company’s common stock is primarily traded */
    private String stock_exchange;
    /** - the financial statement template used by Intrinio to standardize the as reported data */
    private String template;
    /** - a one or two sentence description of the company’s operations */
    private String short_description;
    /** - a one paragraph description of the company’s operations and other corporate actions */
    private String long_description;
    /** - the Chief Executive Officer of the company */
    private String ceo;
    /** - the url to the company’s primary corporate website or primary internet property */
    private String company_url;
    /** - the company’s headquarters address */
    private String business_address;
    /** - the mailing address reported by the company */
    private String mailing_address;
    /** - the phone number reported by the company */
    private String business_phone_no;
    /** - the number of employees working for the company */
    private BigDecimal employees;
    /** - the company’s operating sector */
    private String sector;
    /** - the company’s operating industry category */
    private String industry_category;
    /** - the company’s operating industry group */
    private String industry_group;
    /** - if true, the company has standardized and as reported fundamental data via the Intrinio API; if false, the company has as reported data only.*/
    private Boolean standardized_active;
    /** List of Securities*/
    private List<Security> securities;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegal_name() {
        return legal_name;
    }

    public void setLegal_name(String legal_name) {
        this.legal_name = legal_name;
    }

    public String getLei() {
        return lei;
    }

    public void setLei(String lei) {
        this.lei = lei;
    }

    public String getHq_address1() {
        return hq_address1;
    }

    public void setHq_address1(String hq_address1) {
        this.hq_address1 = hq_address1;
    }

    public String getHq_address2() {
        return hq_address2;
    }

    public void setHq_address2(String hq_address2) {
        this.hq_address2 = hq_address2;
    }

    public String getHq_address_city() {
        return hq_address_city;
    }

    public void setHq_address_city(String hq_address_city) {
        this.hq_address_city = hq_address_city;
    }

    public String getHq_address_postal_code() {
        return hq_address_postal_code;
    }

    public void setHq_address_postal_code(String hq_address_postal_code) {
        this.hq_address_postal_code = hq_address_postal_code;
    }

    public String getEntity_legal_form() {
        return entity_legal_form;
    }

    public void setEntity_legal_form(String entity_legal_form) {
        this.entity_legal_form = entity_legal_form;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getInc_state() {
        return inc_state;
    }

    public void setInc_state(String inc_state) {
        this.inc_state = inc_state;
    }

    public String getInc_country() {
        return inc_country;
    }

    public void setInc_country(String inc_country) {
        this.inc_country = inc_country;
    }

    public BigDecimal getSic() {
        return sic;
    }

    public void setSic(BigDecimal sic) {
        this.sic = sic;
    }

    public String getStock_exchange() {
        return stock_exchange;
    }

    public void setStock_exchange(String stock_exchange) {
        this.stock_exchange = stock_exchange;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getLong_description() {
        return long_description;
    }

    public void setLong_description(String long_description) {
        this.long_description = long_description;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getCompany_url() {
        return company_url;
    }

    public void setCompany_url(String company_url) {
        this.company_url = company_url;
    }

    public String getBusiness_address() {
        return business_address;
    }

    public void setBusiness_address(String business_address) {
        this.business_address = business_address;
    }

    public String getMailing_address() {
        return mailing_address;
    }

    public void setMailing_address(String mailing_address) {
        this.mailing_address = mailing_address;
    }

    public String getBusiness_phone_no() {
        return business_phone_no;
    }

    public void setBusiness_phone_no(String business_phone_no) {
        this.business_phone_no = business_phone_no;
    }

    public BigDecimal getEmployees() {
        return employees;
    }

    public void setEmployees(BigDecimal employees) {
        this.employees = employees;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry_category() {
        return industry_category;
    }

    public void setIndustry_category(String industry_category) {
        this.industry_category = industry_category;
    }

    public String getIndustry_group() {
        return industry_group;
    }

    public void setIndustry_group(String industry_group) {
        this.industry_group = industry_group;
    }

    public Boolean getStandardized_active() {
        return standardized_active;
    }

    public void setStandardized_active(Boolean standardized_active) {
        this.standardized_active = standardized_active;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals(ticker, company.ticker) &&
                Objects.equals(cik, company.cik) &&
                Objects.equals(name, company.name) &&
                Objects.equals(legal_name, company.legal_name) &&
                Objects.equals(lei, company.lei) &&
                Objects.equals(hq_address1, company.hq_address1) &&
                Objects.equals(hq_address2, company.hq_address2) &&
                Objects.equals(hq_address_city, company.hq_address_city) &&
                Objects.equals(hq_address_postal_code, company.hq_address_postal_code) &&
                Objects.equals(entity_legal_form, company.entity_legal_form) &&
                Objects.equals(state, company.state) &&
                Objects.equals(country, company.country) &&
                Objects.equals(inc_state, company.inc_state) &&
                Objects.equals(inc_country, company.inc_country) &&
                Objects.equals(sic, company.sic) &&
                Objects.equals(stock_exchange, company.stock_exchange) &&
                Objects.equals(template, company.template) &&
                Objects.equals(short_description, company.short_description) &&
                Objects.equals(long_description, company.long_description) &&
                Objects.equals(ceo, company.ceo) &&
                Objects.equals(company_url, company.company_url) &&
                Objects.equals(business_address, company.business_address) &&
                Objects.equals(mailing_address, company.mailing_address) &&
                Objects.equals(business_phone_no, company.business_phone_no) &&
                Objects.equals(employees, company.employees) &&
                Objects.equals(sector, company.sector) &&
                Objects.equals(industry_category, company.industry_category) &&
                Objects.equals(industry_group, company.industry_group) &&
                Objects.equals(standardized_active, company.standardized_active) &&
                Objects.equals(securities, company.securities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker, cik, name, legal_name, lei, hq_address1, hq_address2, hq_address_city, hq_address_postal_code, entity_legal_form, state, country, inc_state, inc_country, sic, stock_exchange, template, short_description, long_description, ceo, company_url, business_address, mailing_address, business_phone_no, employees, sector, industry_category, industry_group, standardized_active, securities);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Company{");
        sb.append("ticker='").append(ticker).append('\'');
        sb.append(", cik='").append(cik).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", legal_name='").append(legal_name).append('\'');
        sb.append(", lei='").append(lei).append('\'');
        sb.append(", hq_address1='").append(hq_address1).append('\'');
        sb.append(", hq_address2='").append(hq_address2).append('\'');
        sb.append(", hq_address_city='").append(hq_address_city).append('\'');
        sb.append(", hq_address_postal_code='").append(hq_address_postal_code).append('\'');
        sb.append(", entity_legal_form='").append(entity_legal_form).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", inc_state='").append(inc_state).append('\'');
        sb.append(", inc_country='").append(inc_country).append('\'');
        sb.append(", sic=").append(sic);
        sb.append(", stock_exchange='").append(stock_exchange).append('\'');
        sb.append(", template='").append(template).append('\'');
        sb.append(", short_description='").append(short_description).append('\'');
        sb.append(", long_description='").append(long_description).append('\'');
        sb.append(", ceo='").append(ceo).append('\'');
        sb.append(", company_url='").append(company_url).append('\'');
        sb.append(", business_address='").append(business_address).append('\'');
        sb.append(", mailing_address='").append(mailing_address).append('\'');
        sb.append(", business_phone_no='").append(business_phone_no).append('\'');
        sb.append(", employees=").append(employees);
        sb.append(", sector='").append(sector).append('\'');
        sb.append(", industry_category='").append(industry_category).append('\'');
        sb.append(", industry_group='").append(industry_group).append('\'');
        sb.append(", standardized_active=").append(standardized_active);
        sb.append(", securities=").append(securities);
        sb.append('}');
        return sb.toString();
    }
}
