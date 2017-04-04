package net.gotei.intrinio.usage;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Today’s current usage and limit information for the given access code.
 */
public class Current {
    /** - the access code*/
    private Codes access_code;
    /** - your current API call count*/
    private BigDecimal current;
    /** - your daily API call limit*/
    private BigDecimal limit;
    /** - the percentage of your API call limit that you have used today*/
    private BigDecimal percent;

    public Current() {
    }

    public Codes getAccess_code() {
        return access_code;
    }

    public void setAccess_code(Codes access_code) {
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
        if (!(o instanceof Current)) return false;
        Current current1 = (Current) o;
        return Objects.equals(access_code, current1.access_code) &&
                Objects.equals(current, current1.current) &&
                Objects.equals(limit, current1.limit) &&
                Objects.equals(percent, current1.percent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(access_code, current, limit, percent);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Current{");
        sb.append("access_code='").append(access_code).append('\'');
        sb.append(", current=").append(current);
        sb.append(", limit=").append(limit);
        sb.append(", percent=").append(percent);
        sb.append('}');
        return sb.toString();
    }
}
