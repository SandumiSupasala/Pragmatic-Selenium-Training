package com.homework1.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateManager {

    public static String getCurrentDate() {
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return formattedDate;
    }


    public static String getFutureDate(int addDays) {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(addDays);
        String formattedDate = futureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return formattedDate;
    }
}
