package com.intrinio.common;

import java.math.BigDecimal;
import java.util.List;

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
    /** Total number of pages in response*/
    private BigDecimal total_pages;
    /** */
    private BigDecimal api_call_credits;
    /** Payload */
    private List<T> data;

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

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public BigDecimal getApi_call_credits() {
        return api_call_credits;
    }

    public void setApi_call_credits(BigDecimal api_call_credits) {
        this.api_call_credits = api_call_credits;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PagedResponse{");
        sb.append("result_count=").append(result_count);
        sb.append(", page_size=").append(page_size);
        sb.append(", current_page=").append(current_page);
        sb.append(", total_pages=").append(total_pages);
        sb.append(", api_call_credits=").append(api_call_credits);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
