package com.example.demoscfunc.functions;
import java.util.function.Function;
/**
 * @Author minmin
 */
public class Greeter implements Function<String, String> {

    @Override
    public String apply(String name) {
        return "Hello " + name;
    }

}
