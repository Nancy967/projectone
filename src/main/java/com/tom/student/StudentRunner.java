package com.tom.student;

import com.kotlin.StudentKt;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userIntput();
//        com.kotlin.Student.setPass(75);
        Student.pass = 75;
        Student stu = new Student("Billy", 65, 92);
        Student stu1 = new Student("Rose", 75, 62);
        Student stu2 = new Student("Cindy", 75, 88);
        GraduateStudent gstu = new GraduateStudent("Emily", 77,80,72);
        gstu.print();
//        System.out.println("本次及格分數為 "+Student.pass);
        stu.print();
        stu1.print();
        stu2.print();
        System.out.println("High score:"+ stu.hightest());

        /*Student stu = new Student("Belly",91,62);
        stu.print();*/
    }

    private static void userIntput() {
        System.out.print("Please enter student's name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please enter student's english:");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math:");
        int math = scanner.nextInt();

        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println(stu.hightest());
    }
}
