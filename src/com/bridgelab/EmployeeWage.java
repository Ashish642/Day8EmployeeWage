package com.bridgelab;

public class EmployeeWage {
    public static void main(String[] args) {

        // constants
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int ENP_RATE_PER_HOUR = 20;

        // Variable
        int empHr = 0;
        int empWage = 0;

        // computation
        double empCheck = Math.floor(Math.random() * 10) %3;
        // using random class to get random number
        if (empCheck == IS_PART_TIME) { // empCheck get 1 when the first condition is true and employee is present
            empHr = 4;
        }
        else if (empCheck == IS_FULL_TIME) {
            empHr = 8;
        }
        else {
            empHr = 0;

        }
        empWage = empHr * ENP_RATE_PER_HOUR;
        System.out.println("Employee Wage " + empWage);
    }
}
