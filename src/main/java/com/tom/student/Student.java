package com.tom.student;
public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;

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
        int average = getAverage();
        System.out.print(name +"\t"+ english +"\t"+ math
                +"\t"+ getAverage()+"\t"
                + ((getAverage() >= com.kotlin.Student.getPass())? "PASS" : "FAILED"));
        char grading = 'F';
        switch (average/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            /*default:
                grading = 'F';*/
        }
        System.out.println("\t"+grading);

        /*if (getAverage() >= 60){
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }*/
    }

    public int getAverage (){
        return (english+math)/2;
    }
}
