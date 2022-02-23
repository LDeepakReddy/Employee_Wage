package com.blz;

public class Employee_Wage {

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee wage computation program");
        int Is_present = 1;
        int PARTIAL_PRESENT = 2;
        int WAGE_PER_HOUR = 8;
        int FULLTIME_WORKINGHOUR = 20;
        int PARTTIME_WORKINGHOUR = 4;
        int Employee_Wage = 0;

//Checking employee is present or absent

        int Empcheck = (int) (Math.random() * 10) % 3;

        if (Empcheck == Is_present) {
            System.out.println("Employee is present");
            Employee_Wage = FULLTIME_WORKINGHOUR * WAGE_PER_HOUR;
            System.out.println("Daily Employee Wage is " + Employee_Wage);
        } else if (Empcheck == PARTIAL_PRESENT) {
            System.out.println("Employee worked half day ");
            Employee_Wage = PARTTIME_WORKINGHOUR * WAGE_PER_HOUR;
            System.out.println("Part time employee wage per day is  " + Employee_Wage);
        } else {
            System.out.println("Employee is Absent");

        }
    }
}