package com.tom.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        /*int i = 0;
        do{
            System.out.println(i);
            i++;
        }while (i < 3);*/

        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret){
            System.out.print("Please enter your number:");
            number = scanner.nextInt();
            if (number > secret){
                System.out.println("lower");
            } else if (number < secret) {
                System.out.println("higher");
            }else {
                System.out.println("Great, the number is "+number);
            }
        }
    }
}
