package com.cd.insight.common.response;

import java.util.List;

public class GridResponse<T> extends Response {

    private List<T> rows;

    private Integer total;

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
