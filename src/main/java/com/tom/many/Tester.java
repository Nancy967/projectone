package com.tom.many;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
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
