package com.kranthi.Java8.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapsExamples {

    @Test
    public void test1(){

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(2,4,6);
        List<Integer> list3 = Arrays.asList(3,5,7);

        List<List<Integer>> list = Arrays.asList(list1,list2,list3);
        System.out.println(list);

        //list.stream().map(l->l.size()).forEach(System.out::println);
        //Function<List<?>,Integer> function = List::size;
        //list.stream().map(function).forEach(System.out::println);

        Function<List<Integer>, Stream<Integer>> flatMapper = l->l.stream();

        list.stream().flatMap(flatMapper).forEach(System.out::println);

    }
}
