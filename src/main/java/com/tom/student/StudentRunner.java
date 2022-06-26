package com.tom.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userIntput();

        Student stu = new Student("Billy", 85, 92);
        stu.print();
        System.out.println("High score: " + stu.hightest());

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
