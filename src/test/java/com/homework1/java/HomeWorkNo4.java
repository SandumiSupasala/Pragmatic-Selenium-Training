package com.homework1.java;

import com.github.javafaker.Faker;

import java.sql.SQLOutput;

public class HomeWorkNo4 {

    public static void main(String[] args) {

        Faker faker = new Faker();

        String phoneNumber = faker.phoneNumber().cellPhone();
        String address = faker.address().fullAddress();

       // System.out.println("Phone Number = " + phoneNumber);
      //  System.out.println("Address = " + address);
        System.out.println (String.format("Phone Number: %s",phoneNumber));
        System.out.println(String.format("Address: %s",address));

    }
}
