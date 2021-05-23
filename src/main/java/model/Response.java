
package model;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Response {

    @Expose
    private Long currentPage;
    @Expose
    private String orderBy;
    @Expose
    private Long pageSize;
    @Expose
    private Long pages;
    @Expose
    private List<Result> results;
    @Expose
    private Long startIndex;
    @Expose
    private String status;
    @Expose
    private Long total;
    @Expose
    private String userTier;

    public Long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Long getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Response{" +
                "currentPage=" + currentPage +
                ", orderBy='" + orderBy + '\'' +
                ", pageSize=" + pageSize +
                ", pages=" + pages +
                ", results=" + results +
                ", startIndex=" + startIndex +
                ", status='" + status + '\'' +
                ", total=" + total +
                ", userTier='" + userTier + '\'' +
                '}';
    }

    public String getUserTier() {
        return userTier;
    }

    public void setUserTier(String userTier) {
        this.userTier = userTier;
    }

}
