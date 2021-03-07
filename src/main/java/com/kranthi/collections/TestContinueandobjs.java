package com.kranthi.collections;

import org.junit.Test;

import java.util.*;

public class TestContinueandobjs {

    @Test
    public void testContinue() {
        boolean tracer = true;
        boolean restrictDuplicateActions = true;
        List<String> translatedActions = new ArrayList<String>();
        translatedActions.add("hi");
        translatedActions.add("bye");

        String actionToCheck = "hi2";
        int actionTypeCdId = 1;

        int size = 1;

        for (int z = 0; z<size; z++) {
            if (restrictDuplicateActions && translatedActions != null) {
                boolean found = false;
                for (String translatedAction : translatedActions) {
                    if (actionTypeCdId > 0) {
                        if (translatedAction.equals(actionToCheck)) {
                            found = true;
                            if (tracer) {
                                System.out.println("translatedAction    : " +translatedAction);
                                System.out.println("actionTocheck : " +actionToCheck);
                                System.out.println("hi will not translate:  " + translatedAction);
                            }
                            break;
                        }
                    }
                }
                if (found == true) {
                    continue;
                }
            }
            System.out.println("actionTo check will be trnslated");
        }
    }
    
    @Test
    public void testOptionsl(){
//        Optional<String> a = Optional.empty();
//        String b = "hi";
//
//        a.ifPresent(System.out.println("hello"));
//        if(a.get().equals(b)){
//            System.out.println("they are equal");
//        }
    }

    @Test
    public void givenOptional_whenIfPresentWorks_thenCorrect() {
        Optional<String> opt = Optional.of("baeldung");
        opt.ifPresent(name -> System.out.println(name.length()));
    }

    @Test
    public void testOptionsl234(){
        KranthiPOJO pojo1 = new KranthiPOJO();
        pojo1.setFirstName("kranthi1");
        pojo1.setLastName("muske1");

        KranthiPOJO pojo2 = new KranthiPOJO();
        pojo1.setFirstName("kranthi2");
        pojo1.setLastName("muske2");

        KranthiPOJO pojo3 = new KranthiPOJO();
        pojo1.setFirstName("kranthi1");
        pojo1.setLastName("muske1");

        Set<KranthiPOJO> kranthiSet = new HashSet<>();
        kranthiSet.add(pojo1);
        kranthiSet.add(pojo2);
        kranthiSet.add(pojo2);
        kranthiSet.add(pojo3);

        System.out.println(kranthiSet);

    }

}