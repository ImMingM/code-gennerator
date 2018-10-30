package com.yqwoe.codegenerator.model.param;

import java.io.Serializable;
import java.util.Set;

public class Item implements Serializable {
    final String IN = "in";
    String fieldName;
    String value;
    String type;
    String[] values = null;

    public Item() {
    }

    public Item(String fieldName, String value, String type) {
        this.fieldName = fieldName;
        this.value = value;
        this.type = type;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFieldName() {
        return fieldName;

    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public String[] getValues() {
        if (IN.equals(this.type)) {
            return value.split(",");
        }
        return values;
    }
}
