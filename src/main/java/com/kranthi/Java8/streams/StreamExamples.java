package com.kranthi.Java8.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExamples {

    @Test
    public void filterWithPredicate() {
        Stream<String> stringStream = Stream.of("one", "two", "three");

        Predicate<String> p1 = s->s.length()>3;
        Predicate<String> p2 = Predicate.isEqual("three");
        Predicate<String> p3 = Predicate.isEqual("two");

        //stringStream.filter(p1).forEach(System.out::println);
        stringStream.filter(p2.or(p3)).forEach(System.out::println);

        System.out.println(stringStream);
    }


    @Test
    public void filter2WithArrayList() {
        List<String> list = new ArrayList<>(Arrays.asList("one","two","three"));

        Predicate<String> p1 = s->s.length()>3;
        Stream<String> streamList = list.stream().filter(p1);

        Object a[] = list.stream().filter(p1).toArray();

        streamList.forEach(System.out::println);
        System.out.println(list);
        System.out.println(a);
    }

    @Test
    public void filter3() {
        Stream<String> stringStream = Stream.of("one", "two", "three","four","five");

        Predicate<String> p1 = s->s.length()>3;
        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");

        List<String> list = new ArrayList<>();

        stringStream.peek(System.out::println).filter(p2.or(p3)).forEach(list::add);

        System.out.println(list);
    }

}
