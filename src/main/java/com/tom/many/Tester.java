package com.tom.many;

import java.lang.reflect.Array;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks.get("2330"));
        System.out.println(stocks);
        for (String key:stocks.keySet()){
            System.out.println(stocks.get(key));
        }
//        set();
//        arrayTest();
//        list();
    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        System.out.println(set);
        for (int n:set){
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(7);
        list.add(4);
        System.out.println(list);
        int n1 = list.get(1);
        int n2 = list.get(2);
        System.out.println(list.size());

        List<Integer> scores = Arrays.asList(77,52,95,88,60);
        for (int score:scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[2] = 7;

        int[] scores = {97,42,61,55,80};
        System.out.println(scores);
        for (int i=0; i<5; i++){
            System.out.println(scores[i]);
        }
        for (int n : scores){
            System.out.println(n);
        }
    }
}
