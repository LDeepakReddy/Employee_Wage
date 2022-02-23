package com.blz;

public class Employee_Wage {


    public static void main(String[] args) {
        System.out.println("Welcome to the Employee wage computation program");
        int WAGE_PER_HOUR = 8;
        int FULLTIME_WORKINGHOUR = 20;
        int Employee_Wage = 0;
        
//Checking employee is present or absent
        int Is_present = 1;
        int Empcheck = (int) (Math.random() * 10) % 2;

        if (Empcheck == Is_present) {
            System.out.println("Employee is present");
            Employee_Wage = FULLTIME_WORKINGHOUR * WAGE_PER_HOUR;
            System.out.println("Daily Employee Wage is " + Employee_Wage);
        } else {
            System.out.println("Employee is Absent");

        }
    }
}
