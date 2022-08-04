package com.homework1.util;

public class EmployeeInfoTester {
    public static void main(String[] args) {

        String firstName = EmployeeInfoManager.getFirstname();
        String lastName = EmployeeInfoManager.getlastname();
        String middleName = EmployeeInfoManager.getmiddlename();

        EmployeeDetails employeeDetails = EmployeeInfoManager.getEmployeeDetails();

        //For creating a new employee

        System.out.println("firstName = " + firstName);
        System.out.println("middleName = " + middleName);
        System.out.println("lastName = " + lastName);

        //After creating a new employee

        EmployeeDetails firstEmployee = EmployeeInfoManager.getEmployeeDetails();
        System.out.println(firstEmployee.getEmployeeNumber("EMP-RC"));
        System.out.println(firstEmployee.getFirstName());
        System.out.println(firstEmployee.getMiddleName());
        System.out.println(firstEmployee.getLastName());
        System.out.println(firstEmployee.getUserName());


    }
}
