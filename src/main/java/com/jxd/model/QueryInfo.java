package com.jxd.model;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-11 20:21
 */
public class QueryInfo {
    String ename;
    Integer pageNum;
    Integer pageSize;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public QueryInfo() {
    }

    public QueryInfo(String ename, Integer pageNum, Integer pageSize) {
        this.ename = ename;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }
}
