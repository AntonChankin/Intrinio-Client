package net.gotei.intrinio.common;

import java.math.BigDecimal;

/**
 * Response to the most of queries. Doc @see http://docs.intrinio.com/#paging
 */
public class PagedResponse<T> {
    /** Total number of results.*/
    private BigDecimal result_count;
    /** Number of results on the page*/
    private BigDecimal page_size;
    /** Current page number*/
    private BigDecimal current_page;
    /** Total number of pages in responce*/
    private BigDecimal total_pages;
    /** Payload */
    private T[] data;

    public PagedResponse() {
    }

    public BigDecimal getResult_count() {
        return result_count;
    }

    public void setResult_count(BigDecimal result_count) {
        this.result_count = result_count;
    }

    public BigDecimal getPage_size() {
        return page_size;
    }

    public void setPage_size(BigDecimal page_size) {
        this.page_size = page_size;
    }

    public BigDecimal getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(BigDecimal current_page) {
        this.current_page = current_page;
    }

    public BigDecimal getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(BigDecimal total_pages) {
        this.total_pages = total_pages;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }
}
