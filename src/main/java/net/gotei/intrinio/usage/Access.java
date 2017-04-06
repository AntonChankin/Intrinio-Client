package net.gotei.intrinio.usage;

import java.math.BigDecimal;

/**
 * A list of your authorized access codes and their daily limits.
 */
public class Access {
    /**- Global Public Company Security Master Data Feed */
    private BigDecimal com_sec_master_data;
    /**- US Public Company Financials Data Feed */
    private BigDecimal com_fin_data;
    /**- US Sector & Industry Data Feed */
    private BigDecimal industry_data;
    /**- US Bank & Bank Holding Company Data Feed */
    private BigDecimal fdic_data;
    /**- US & Global Economic Data Feed */
    private BigDecimal econ_data;
    /**- US Insider Transactions & Ownership Data Feed */
    private BigDecimal insider_trans;
    /**- US Institutional Holdings Data Feed */
    private BigDecimal inst_hold;

    public Access() {
    }

    public BigDecimal getCom_sec_master_data() {
        return com_sec_master_data;
    }

    public void setCom_sec_master_data(BigDecimal com_sec_master_data) {
        this.com_sec_master_data = com_sec_master_data;
    }

    public BigDecimal getCom_fin_data() {
        return com_fin_data;
    }

    public void setCom_fin_data(BigDecimal com_fin_data) {
        this.com_fin_data = com_fin_data;
    }

    public BigDecimal getIndustry_data() {
        return industry_data;
    }

    public void setIndustry_data(BigDecimal industry_data) {
        this.industry_data = industry_data;
    }

    public BigDecimal getFdic_data() {
        return fdic_data;
    }

    public void setFdic_data(BigDecimal fdic_data) {
        this.fdic_data = fdic_data;
    }

    public BigDecimal getEcon_data() {
        return econ_data;
    }

    public void setEcon_data(BigDecimal econ_data) {
        this.econ_data = econ_data;
    }

    public BigDecimal getInsider_trans() {
        return insider_trans;
    }

    public void setInsider_trans(BigDecimal insider_trans) {
        this.insider_trans = insider_trans;
    }

    public BigDecimal getInst_hold() {
        return inst_hold;
    }

    public void setInst_hold(BigDecimal inst_hold) {
        this.inst_hold = inst_hold;
    }
}
