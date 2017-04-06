package net.gotei.intrinio.master;

import net.gotei.intrinio.common.Result;

import java.util.Objects;

/**
 *  Information on index covered by Intrinio. There are three distinct types of indices: Stock Market, SIC (Sector & Industry), and Economic.
 */
public class Index implements Result {
    /** - the Intrinio symbol associated with the index */
    private String symbol;
    /** - the index name */
    private String index_name;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getIndex_name() {
        return index_name;
    }

    public void setIndex_name(String index_name) {
        this.index_name = index_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Index index = (Index) o;
        return Objects.equals(symbol, index.symbol) &&
                Objects.equals(index_name, index.index_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, index_name);
    }

    @Override
    public String toString() {
        return "Index{" +
                "symbol='" + symbol + '\'' +
                ", index_name='" + index_name + '\'' +
                '}';
    }
}
