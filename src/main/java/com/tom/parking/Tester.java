package com.tom.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));

        String s = "2022/7/1 07:43:14";
        Date other = null;
        try {
            other = sdf.parse(s);
            System.out.println(other+"\n");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,2);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,12);
        System.out.println(calendar.getTime());
    }
}
