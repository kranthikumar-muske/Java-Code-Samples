package com.kranthi.Java8.lambdaexpressions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerInterfaceExamples {

    @Test
    public void test1() throws InterruptedException{

        List<String> strings = Arrays.asList("one","two","three");

        List<String> result = new ArrayList<>();

        Consumer<String> c1 = System.out::println;
        //Consumer<String> c2 = s->result.add(s);
        Consumer<String> c2 = result::add;

        strings.forEach(c1.andThen(c2));

        System.out.println(result);

    }
}
