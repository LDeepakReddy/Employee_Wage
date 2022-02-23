package com.blz;

public class Employee_Wage {
    public static final int IS_PRESENT = 1;
    public static final int PARTIAL_PRESENT = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee wage computation program");

        int WAGE_PER_HOUR = 20;
        int Employee_Wage = 0;
        int EmpHr = 0;

//Checking employee is present or absent

        int Empcheck = (int) (Math.random() * 10) % 3;

        switch (Empcheck) {
            case IS_PRESENT:
                System.out.println("Employee is present");
                EmpHr = 8;
                break;
            case PARTIAL_PRESENT:
                System.out.println("Employee is working part time");
                EmpHr = 4;
                break;
            default:
                System.out.println("Employee is absent");
        }

        Employee_Wage = EmpHr * WAGE_PER_HOUR;
        System.out.println("EMployee wage is " + Employee_Wage+ " Per day");
    }
}
