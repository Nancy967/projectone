package com.tom.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {

        LocalDateTime enter = LocalDateTime.of(2021,6,23,11,55,24);
        LocalDateTime leave = LocalDateTime.of(2021,6,23,14,37,12);
        Car car = new Car("PP-0001",enter);
        car.setLeave(leave);
        System.out.println("車子停了"+ car.getDuration() +"分鐘");
        long hours = (long) Math.ceil(car.getDuration()/60.0);
        System.out.println("總計"+ hours +"小時");
        System.out.println("應付"+ 30*hours +"元");


//        java();

//        java8();
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);

//        local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(5)));
        LocalDateTime other = LocalDateTime.of(2020,8,04,10,20,46);
        System.out.println(other);
    }

    private static void java() {
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
