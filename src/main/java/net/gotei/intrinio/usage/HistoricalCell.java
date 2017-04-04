package net.gotei.intrinio.usage;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Element of data array for Today’s current usage and limit information for the given access code request.
 */
public class HistoricalCell {
    private String date;
    private BigDecimal calls;

    public HistoricalCell() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getCalls() {
        return calls;
    }

    public void setCalls(BigDecimal calls) {
        this.calls = calls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HistoricalCell)) return false;
        HistoricalCell that = (HistoricalCell) o;
        return Objects.equals(date, that.date) &&
                Objects.equals(calls, that.calls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, calls);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HistoricalCell{");
        sb.append("date='").append(date).append('\'');
        sb.append(", calls=").append(calls);
        sb.append('}');
        return sb.toString();
    }
}
