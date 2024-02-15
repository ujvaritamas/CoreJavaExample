package com.example.SpringDemo0.ws.obj;

public class Quote {

    private String value;
    private String by;

    public Quote(String value, String by) {
        this.value = value;
        this.by = by;
    }

    public String getValue() {
        return value;
    }

    public String getBy() {
        return by;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setBy(String by) {
        this.by = by;
    }
}
