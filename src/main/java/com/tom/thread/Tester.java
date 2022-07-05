package com.tom.thread;

public class Tester {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("main:" + i);
        }

        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() +":"+ i);
                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread.start();

        //Mythread
        Mythread mythread = new Mythread();
        mythread.start();

        //Runnable介面
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Runnable:" + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread r = new Thread(runnable);
        r.start();

        //Runnable - lambda
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable lambda:" + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        System.out.println("main: end");
    }
}

class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() +":"+ i);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
