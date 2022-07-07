package com.example.demoscfunc.functions;

import java.util.function.Function;

/**
 * @Author minmin
 */
public class MinMin implements Function<String, Integer> {

@Override
public Integer apply(String word) {
        return word.length();
        }

}
