package com.kranthi.collections.lists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 *
 *
 *
 */
public class ListExamples {

    @Test
    public void arrayListExample(){

        List<String> a = new ArrayList<>();
        a.add("hi");
        try{
            System.out.println(a.get(0));
            System.out.println(a.get(1));
        }catch(Exception e){
            System.out.println(e.toString());
        }
        System.out.println("after try catch");
    }

    @Test
    public void linkedListExample(){

    }
}
