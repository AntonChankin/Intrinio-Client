package com.intrinio.usage;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Current usage and limit information for the given access code.
 */
public class CurrentLimit {
    /**  - the access code*/
    private String access_code;
    /**  - your current API call count*/
    private BigDecimal current;
    /**  - your daily API call limit*/
    private BigDecimal limit;
    /**  - the percentage of your API call limit that you have used today*/
    private BigDecimal percent;

    public CurrentLimit() {
    }

    public String getAccess_code() {
        return access_code;
    }

    public void setAccess_code(String access_code) {
        this.access_code = access_code;
    }

    public BigDecimal getCurrent() {
        return current;
    }

    public void setCurrent(BigDecimal current) {
        this.current = current;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentLimit that = (CurrentLimit) o;
        return Objects.equals(access_code, that.access_code) &&
                Objects.equals(current, that.current) &&
                Objects.equals(limit, that.limit) &&
                Objects.equals(percent, that.percent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(access_code, current, limit, percent);
    }

    @Override
    public String toString() {
        return "CurrentLimit{" +
                "access_code='" + access_code + '\'' +
                ", current=" + current +
                ", limit=" + limit +
                ", percent=" + percent +
                '}';
    }
}
