package com.tom.student;
public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int hightest(){
        /*int max = ;
        if (english > math){
            max = english;
        } else {
            max = math;
        }*/
        return (english > math)? english : math;
    }

    public void print(){
        System.out.print(name +"\t"+ english +"\t"+ math
                +"\t"+ getAversge());
        if (getAversge() >= 60){
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }
    }

    public int getAversge (){
        return (english+math)/2;
    }
}
