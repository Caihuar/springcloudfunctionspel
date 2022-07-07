package com.example.demoscfunc.pojo;

/**
 * @Author minmin
 */
public class Foo {
    public Foo() {
    }
    public static String sayBye(String userName){
        return userName+"say: Bye";
    }

    private String value;



    public String lowercase() {
        return value.toLowerCase();
    }

    public Foo(String value) {
        this.value = value;
    }

    public String uppercase() {
        return value.toUpperCase();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
