package com.bridgelab;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;



   public EmployeeWage(String company , int empRatePerHour, int noOfWorkingDay, int maxHourPerMonth) {
       this.company = company;
       this.empRatePerHour = empRatePerHour;
       this.numOfWorkingDays = noOfWorkingDay;
       this.maxHoursPerMonth = maxHourPerMonth;

   }
   public void computeEmpWage() {
       System.out.println("Welcome To Employee Wage Computation");

       // variable
       int empHrs = 0;
       int totalEmpHrs = 0;
       int totalWorkingDays = 0;
       // computation
       while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
           totalEmpHrs += totalEmpHrs;
           System.out.println("Day : " + totalWorkingDays + "Employee worked : " + empHrs + "Hour");
       }
       int totalEmpWage = totalEmpHrs * empRatePerHour;
   }
   public String toString() {
       return "Total Emp wage for Company:"  +company+" is: " + totalEmpWage;

   }
   public static void main(String[] args){
       EmployeeWage dMart = new EmployeeWage("DMart",200,2,10);
       EmployeeWage vMart = new EmployeeWage("VMart", 150, 4, 20);
       vMart.computeEmpWage();
       System.out.println(dMart);
       vMart.computeEmpWage();
       System.out.println(vMart);
   }

}
