package com.tom;

public class Hello {
    public static void main(String[] args) {
        /* System.out.println("Hello World"); */

        String s = "abcdef";
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));

        Person p = new Person("Mike",73.8f, 1.694f);
        p.hello();
        p.weight = 55.2f;
        p.height = 1.6f;
        System.out.println(p.bmi());

        int score = 87;
        System.out.println(score<80 || score>90);
        char c = 'A';
        System.out.println(c>'a');

        /*int age = 21;
        Integer age2 = 22;
        char c = '我';
        Character c2 = 'A';
        byte b = 100;
        float weight = 55.2f;
        double height = 163.4;
        boolean adult = true;
        boolean entroll = false;
        String name = "Nancy";*/
    }
}
