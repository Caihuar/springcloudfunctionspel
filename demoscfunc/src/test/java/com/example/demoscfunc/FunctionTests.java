//package com.example.demoscfunc;
//
//import java.util.List;
//
//import com.example.demoscfunc.functions.Exclaimer;
//import com.example.demoscfunc.functions.Greeter;
//import com.example.demoscfunc.functions.mmm;
//import org.junit.jupiter.api.Test;
//import reactor.core.publisher.Flux;
//
//import static org.assertj.core.api.Assertions.assertThat;
///**
// * @Author minmin
// */
//public class FunctionTests {
//
//    private final DemoscfuncApplication functions = new DemoscfuncApplication();
//    @Test
//    public void testUppercase() {
//        String output = this.functions.uppercase().apply("foobar");
//        assertThat(output).isEqualTo("FOOBAR");
//    }
//
//    @Test
//    public void testLowercase() {
//        Flux<String> output = this.functions.lowercase().apply(Flux.just("FOO", "BAR"));
//        List<String> results = output.collectList().block();
//        assertThat(results.size()).isEqualTo(2);
//        assertThat(results.get(0)).isEqualTo("foo");
//        assertThat(results.get(1)).isEqualTo("bar");
//    }
//
//    @Test
//    public void testHello() {
//        String output = this.functions.hello().get();
//        assertThat(output).isEqualTo("hello");
//    }
//
//    @Test
//    public void testWords() {
//        Flux<String> output = this.functions.words().get();
//        List<String> results = output.collectList().block();
//        assertThat(results.size()).isEqualTo(2);
//        assertThat(results.get(0)).isEqualTo("foo");
//        assertThat(results.get(1)).isEqualTo("bar");
//    }
//
//    @Test
//    public void testGreeter() {
//        assertThat(new Greeter().apply("World")).isEqualTo("Hello World");
//    }
//
//    @Test
//    public void testExclaimer() {
//        Flux<String> input = Flux.just("foo", "bar");
//        Flux<String> output = new Exclaimer().apply(input);
//        List<String> results = output.collectList().block();
//        assertThat(results.size()).isEqualTo(2);
//        assertThat(results.get(0)).isEqualTo("foo!!!");
//        assertThat(results.get(1)).isEqualTo("bar!!!");
//    }
//
//    @Test
//    public void testCharCounter() {
//        assertThat(new mmm().apply("this is 21 chars long"))
//                .isEqualTo((Integer) 21);
//    }
//}
