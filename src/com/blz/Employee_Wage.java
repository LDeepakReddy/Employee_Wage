package com.blz;

public class Employee_Wage {

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee wage computation program");
//Checking employee is present or absent
        int Is_present = 1;
        int Empcheck = (int) (Math.random() * 10) % 2;

        if (Empcheck == Is_present) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
