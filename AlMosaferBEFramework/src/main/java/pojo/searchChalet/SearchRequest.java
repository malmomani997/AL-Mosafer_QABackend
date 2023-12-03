package pojo.searchChalet;

import java.util.ArrayList;

public class SearchRequest {
    private ArrayList<SearchCriterion> searchCriteria;
    private String checkIn;
    private String checkOut;
    private String sortBy;
    private String sortOrder;
    private String rankType;
    private int pageNo;
    private int pageSize;

    public SearchRequest(ArrayList<SearchCriterion> searchCriteria, String checkIn, String checkOut, String sortBy, String sortOrder, String rankType, int pageNo, int pageSize) {
        this.searchCriteria = searchCriteria;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.rankType = rankType;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public ArrayList<SearchCriterion> getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(ArrayList<SearchCriterion> searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getRankType() {
        return rankType;
    }

    public void setRankType(String rankType) {
        this.rankType = rankType;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
