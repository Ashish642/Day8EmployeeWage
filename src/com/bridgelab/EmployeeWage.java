package com.bridgelab;

public class EmployeeWage {
    public static final int isPartTime =0;
    public static final int isfullTime = 1;
    private int numOfCompany;
    private CompanyEmpWage empWageArray[];

   public EmployeeWage() {
       empWageArray = new CompanyEmpWage[5];


   }
    private void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maximumHoursPerMonth){
       empWageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfCompany,maximumHoursPerMonth);
       numOfCompany++;
    }
    private void computeEmpWage() {
       for (int i = 0; i<numOfCompany;i++){
           System.out.println(empWageArray[i]);

       }
    }
    private int computeEmpWage(CompayEmpWage compayEmpWage) {
       int empHours =0, totalEmpHours =0, totalWorkingDays = 0;
       while (totalEmpHours<=compayEmpWage.maximumHoursPerMonth && totalWorkingDays<compayEmpWage.numOfWorkingDays) {
           int check = (int)(Math.floor(Math.random()*10)%2);
           switch (check) {
               case isPartTime:
                   empHours = 4;
                   break;
               case isfullTime:
                   empHours = 8;
                   break;
               default:
                   empHours = 0;

           }
           totalEmpHours + = empHours;
           totalWorkingDays + = 1;

       }
       return totalEmpHours * compayEmpWage.empRatePerHour;

    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyEmpWage("DMart",40,20,80);
        employeeWage.addCompanyEmpWage("VMart",50,21,125);
        employeeWage.computeEmpWage();
    }
}