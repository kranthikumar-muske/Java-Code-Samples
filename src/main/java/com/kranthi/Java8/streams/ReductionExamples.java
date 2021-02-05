package com.kranthi.Java8.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExamples {

    @Test
    public void test1(){
        List<String> persons = new ArrayList<>(Arrays.asList("kranthi", "muske"));
        boolean p1= persons.stream().map(s->s.toUpperCase()).allMatch(p->p.length()>6);
        Optional<String> p2= persons.stream().map(s->s.toUpperCase()).filter(p->p.length()>15).findFirst();
        System.out.println(p1);
        //System.out.println(p2.get());
        System.out.println(p2.orElseThrow(()->new RuntimeException()));
    }

    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        Integer red = list.stream().reduce(0,Integer::sum);

        System.out.println(red);
    }

    @Test
    public void testOneElement(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1));
        Integer red1 = list.stream().reduce(0,Integer::sum);
        System.out.println(red1);
        Integer red2 = list.stream().reduce(150,Integer::sum);
        System.out.println(red2);

        //empty element, returns zero(identity value
        List<Integer> list2 = new ArrayList<>(Arrays.asList());
        Integer red3 = list.stream().reduce(0,Integer::sum);
        System.out.println(red3);
    }


    @Test
    public void testWithoutIdentityElement(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1));
        Optional<Integer> red1 = list.stream().reduce(Integer::max);
        System.out.println(red1);

        List<Integer> list2 = new ArrayList<>(Arrays.asList());
        Optional<Integer> red2 = list2.stream().reduce(Integer::max);
        System.out.println(red2);
    }
}
