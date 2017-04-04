package net.gotei.intrinio.usage;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * GET: /usage/access response element
 */
public class AccessCode {
    private String access_code;
    private BigDecimal daily_limit;

    public AccessCode() {
    }

    public String getAccess_code() {
        return access_code;
    }

    public void setAccess_code(String access_code) {
        this.access_code = access_code;
    }

    public BigDecimal getDaily_limit() {
        return daily_limit;
    }

    public void setDaily_limit(BigDecimal daily_limit) {
        this.daily_limit = daily_limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccessCode)) return false;
        AccessCode that = (AccessCode) o;
        return Objects.equals(access_code, that.access_code) &&
                Objects.equals(daily_limit, that.daily_limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(access_code, daily_limit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccessCode{");
        sb.append("access_code='").append(access_code).append('\'');
        sb.append(", daily_limit=").append(daily_limit);
        sb.append('}');
        return sb.toString();
    }
}
