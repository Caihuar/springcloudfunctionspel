package com.example.demoscfunc;
import java.util.function.Function;
import java.util.function.Supplier;

import reactor.core.publisher.Flux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;


@SpringBootApplication
public class DemoscfuncApplication {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoscfuncApplication.class, args);
	}
//	@Bean
//	public Function<String, String> reverseString() {
//		return value -> new StringBuilder(value).reverse().toString();
//	}
//	@Bean
//	public Function<String, String> uppercase() {
//		return value -> value.toUpperCase();
//	}
//
//	@Bean
//	public Function<Message<String>, Integer> uppercaseMessage() {
//		return value -> value.getPayload().toUpperCase().length();
//	}
//
//	@Bean
//	public Function<Flux<String>, Flux<String>> lowercase() {
//		return flux -> flux.map(value -> value.toLowerCase());
//	}
//
//	@Bean
//	public Supplier<String> hello() {
//		return () -> "hello";
//	}
//
//	@Bean
//	public Supplier<Flux<String>> words() {
//		return () -> Flux.fromArray(new String[] {"foo","mmm", "bar"});
//	}
}
