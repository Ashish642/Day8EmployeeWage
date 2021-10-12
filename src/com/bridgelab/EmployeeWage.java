package com.bridgelab;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int ENP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;


   public static void main(String[] args) {
       // Variable
       int empHr = 0;
       int empWage = 0;
       int totalEmpWage = 0;
       System.out.println("Welcome to Employee Wage");
       for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
           // computation
           int empCheck = (int) Math.floor(Math.random() * 10) % 3;
           // using random class to get random number
           switch (empCheck) {
               case IS_PART_TIME:
                   empHr = 4;
                   break;
               case IS_FULL_TIME:
                   empHr = 8;
                   break;
               default:
                   empHr = 0;

           }
           empWage = empHr * ENP_RATE_PER_HOUR;
           totalEmpWage  += empWage;
           System.out.println("Employee Wage " + empWage);
       }
       System.out.println("Total Month Employee Wage :" + totalEmpWage);
   }
}
