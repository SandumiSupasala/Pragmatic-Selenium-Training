package com.homework1.util;


public class DateTester {

    public static void main(String[] args) {

        String currentDate = DateManager.getCurrentDate();
        System.out.println("currentDate = " + currentDate);

        String futureDate = DateManager.getFutureDate(5);
        System.out.println("futureDate = " + futureDate);


    }
}
