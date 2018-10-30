package com.yqwoe.codegenerator.model.param;

public class Order {
    String fieldName;
    String type="asc";

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Order() {
    }

    public Order(String fieldName, String type) {
        this.fieldName = fieldName;
        this.type = type;
    }
}
