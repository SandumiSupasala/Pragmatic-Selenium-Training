package com.homework1.util;

import com.github.javafaker.Faker;

public class EmployeeInfoManager {

    /**
     * Generate random first name
     * @return String firstName
     * Generate random last name
     * @return String lastName
     * Generate random middle name
     * @return  middleName
     */

    public static String getFirstname() {

        Faker faker = new Faker();
        String firstName = faker.name().firstName().replaceAll("'","").strip();
        return firstName;
    }

    public static String getlastname() {
        Faker faker = new Faker();
        String lastName = faker.name().lastName().replaceAll("'","").strip();
        return lastName;

    }


    public static String getmiddlename() {
        return getlastname();
    }

    public static EmployeeDetails getEmployeeDetails() {
        return new EmployeeDetails();
    }
}
