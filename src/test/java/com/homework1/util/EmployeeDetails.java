package com.homework1.util;

import com.github.javafaker.Faker;

import java.util.Locale;

public class EmployeeDetails {

    private String firstName;
    private String middleName;
    private String lastName;
    private String userName;
    private String empNumber;

    public EmployeeDetails() {
        this.firstName = EmployeeInfoManager.getFirstname();
        this.middleName = EmployeeInfoManager.getmiddlename();
        this.lastName = EmployeeInfoManager.getlastname();
        this.userName = String.format("%s.%s", firstName, lastName).toLowerCase(Locale.ROOT);
        this.empNumber = getEmployeeNumber("EMP-RC");
    }

    public String getEmployeeNumber(String prefix){
        Faker faker = new Faker();
        String employeeNumber = prefix + faker.number().numberBetween(1000, 9999);
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}
