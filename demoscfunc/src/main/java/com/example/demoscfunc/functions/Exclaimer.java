package com.example.demoscfunc.functions;

import java.util.function.Function;

import reactor.core.publisher.Flux;

/**
 * @Author minmin
 */
public class Exclaimer implements Function<Flux<String>, Flux<String>> {

    @Override
    public Flux<String> apply(Flux<String> words) {
        return words.map(word -> word + "!!!");
    }

}