package com.tom.io;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        bufferedReader();
//        fileReader();
//        inputStream();
    }

    private static void bufferedReader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileReader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n != -1){
                System.out.print((char) n);
                n = fr.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void inputStream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            InputStream is = new  FileInputStream(file);
            int n = is.read();
            while (n != -1){
                System.out.print((char) n);
                n = is.read();
            }
            System.out.println();
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Exception");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello!");
    }
}