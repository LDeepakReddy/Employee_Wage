package com.blz;

public class Employee_Wage {
    public static final int IS_PRESENT = 1;
    public static final int PARTIAL_PRESENT = 2;

    public static void main(String[] args) {

        int WAGE_PER_HOUR = 20;
        int Employee_Wage = 0;
        int MONTHLY_WORKING_DAYS = 20;
        int MONTHLY_WORKING_HOURS = 100;
        int EmpHr = 0;
        int TOTAL_WORKING_DAYS = 1;
        int TOTAL_WORKING_HOURS = 0;


        System.out.println("Welcome to the Employee wage computation program");
        while (TOTAL_WORKING_HOURS < MONTHLY_WORKING_HOURS && TOTAL_WORKING_DAYS < MONTHLY_WORKING_DAYS) {

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
            TOTAL_WORKING_DAYS++;
            TOTAL_WORKING_HOURS = EmpHr + TOTAL_WORKING_HOURS;
        }

        Employee_Wage = TOTAL_WORKING_HOURS * WAGE_PER_HOUR;
        System.out.println("Employee worked for " + TOTAL_WORKING_HOURS + "Hours");
        System.out.println("EMployee Total wage is " + Employee_Wage);
    }
}
