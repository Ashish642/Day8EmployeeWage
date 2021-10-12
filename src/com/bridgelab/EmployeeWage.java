package com.bridgelab;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int ENP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

   public static void main(String[] args) {
       // Variable
       int empHrs = 0;
       int totalEmpHrs = 0;
       int totalWorkingDays = 0;
       System.out.println("Welcome to Employee Wage");
           // computation
       while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
           int empCheck = (int) Math.floor(Math.random() * 10) % 3;
           // using random class to get random number
           switch (empCheck) {
               case IS_PART_TIME:
                   empHrs = 4;
                   break;
               case IS_FULL_TIME:
                   empHrs = 8;
                   break;
               default:
                   empHrs = 0;

           }
           totalEmpHrs  += totalEmpHrs;
           System.out.println("Day#: " + totalWorkingDays + "Emp Hr : " + empHrs);
       }
       int totalEmpWage = totalEmpHrs * ENP_RATE_PER_HOUR;
       System.out.println("Total Emp Wage: " + totalEmpWage);
   }
}
