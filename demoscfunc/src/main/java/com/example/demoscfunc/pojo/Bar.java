package com.example.demoscfunc.pojo;

/**
 * @Author minmin
 */
public class Bar {

    private String value;

    Bar() {
    }

    public static Bar valueOf(String value) {
        return new Bar(value);
    }

    Bar(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}