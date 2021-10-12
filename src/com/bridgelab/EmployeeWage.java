package com.bridgelab;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;


   public static  int computeWage(String company , int empRatePerHour, int noOfWorkingDay, int maxHourPerMonth) {
       // variable
       int empHrs = 0;
       int totalEmpHrs = 0;
       int totalWorkingDays = 0;
           // computation
       while (totalEmpHrs <= maxHourPerMonth && totalWorkingDays < noOfWorkingDay) {
            totalWorkingDays++;
           int empCheck = (int) Math.floor(Math.random() * 10) % 3;
           // using random class to get random number
           switch (empCheck) {
               case 0: // Employee is absent
                   empHrs = 0;
                   break;
               case 1: // FullTime Employee
                   empHrs = 8;
                   break;
               case 2: // FullTime Employee
                   empHrs = 4;
                   break;

           }
           totalEmpHrs  += totalEmpHrs;
           System.out.println("Day : " + totalWorkingDays + "Employee worked : " + empHrs + "Hour");
       }
       int totalEmpWage = totalEmpHrs * empRatePerHour;
       System.out.println("Total Emp Wage for company : " + company + " is : " + totalEmpWage);
       return totalEmpWage;
   }
   public static void main(String[] args){
       computeWage("Dmart", 20,2, 10);
       computeWage("Reliance", 10 ,4, 20);
   }

}
