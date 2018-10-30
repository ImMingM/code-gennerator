package com.yqwoe.codegenerator.model.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QueryParam implements Serializable {

    List<Item> items = null;
    List<Order> orders = null;

    int pageNum = 1;
    int pageSize = 10;


    public QueryParam() {
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
