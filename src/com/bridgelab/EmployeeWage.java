package com.bridgelab;
import java.util.ArrayList;

public class EmployeeWage implements ComputeWage{
    public static final int isPartTime =0;
    public static final int isFullTime = 1;
    private ArrayList<CopanyEmpWage> empList;

   public EmployeeWage() {
       empList = new ArrayList<>();

   }
    private void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maximumHoursPerMonth){
       empWageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfCompany,maximumHoursPerMonth);
       numOfCompany++;
    }
    private void computeEmpWage() {
       for (int i = 0; i<numOfCompany;i++){
           empList.get(i).setTotalEmpWage(this.coputeEmpWage(empList.get(i)));
           System.out.println(empList.get(i));
           

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