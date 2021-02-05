package com.kranthi.Java8.lambdaexpressions;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.util.*;

public class FirstLambda {

    @Test
    public void testOneArgument(){

//        FileFilter fileFilter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };

        FileFilter fileFilterLambda = (File p)->p.getName().endsWith(".java");

        File dir = new File("c:/test");
        File[] files = dir.listFiles(fileFilterLambda);

        for(File f: files){
            System.out.println(f);
        }
    }

    @Test
    public void testZeroArgument() throws InterruptedException{

//        Runnable runnable = new Runnable() {
//
//            @Override
//            public void run() {
//                    for(int i=0;i<3;i++){
//                            System.out.println("hi from Thread"+Thread.currentThread().getName());
//                        }
//            }
//        };

        Runnable runnable = ()->{
            for(int i=0;i<3;i++){
                System.out.println("hi from Thread"+Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(runnable);
        t.start();
        t.join();
    }


    @Test
    public void testTwoArguments(){

//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return Integer.compare(s2.length(),s1.length());
//            }
//        };

        Comparator<String> comparator = (s1,s2)->Integer.compare(s2.length(),s1.length());

        List<String> list = Arrays.asList("**","*","****","***");
        Collections.sort(list,comparator);
        for(String s:list) {
            System.out.println(s);
        }
    }

    @Test
    public void test4(){
//        List<String> list = Arrays.asList("a","b");
//        list.forEach(a-> System.out.println(a));

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2));
        list.forEach(System.out::println);
        list.forEach(a->{
            int c = a;
            if(a>0) {
                c = a + 1;
                System.out.println(c);
            }
        });
    }
}
