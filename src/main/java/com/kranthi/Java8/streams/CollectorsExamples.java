package com.kranthi.Java8.streams;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExamples {

    @Test
    public void test1(){
        List<Person> personList = new ArrayList<>();

        try(
            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(CollectorsExamples.class.getClassLoader().getResourceAsStream("people.txt")));

            Stream<String> stream = reader.lines();
            ){
            stream.map(line->{
                String[] s = line.split(" ");
                Person p = new Person(s[0].trim(),Integer.parseInt(s[1]));
                personList.add(p);
                return p;
            }).forEach(System.out::println);

        } catch (IOException ioe) {
            System.out.println(ioe);
        }

        Stream<Person> stream2 = personList.stream();


        //Find the minimum age of person from persons whose ages are > 20
        Optional<Person> minimumAgeGreaterThen20 =
                stream2.filter(p->p.getAge()>20).min(Comparator.comparing(Person::getAge));
        System.out.println(minimumAgeGreaterThen20);


        //use of collectors, group the persons with same age
        Map<Integer, List<Person>> map = personList.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(map.get(33));

        //use of collectors, group the persons with same age- return n number of person per age
        Map<Integer, Long> map2 = personList.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));
        System.out.println(map2);

        //use of collectors, group the persons with same age- return n number of person per age
        Map<Integer, List<String>> map3 = personList.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toList())));
        System.out.println(map3);

        List<Person> list = personList.stream().filter(p->p.getAge()>98).collect(Collectors.toList());
        System.out.println(list);
    }
}
