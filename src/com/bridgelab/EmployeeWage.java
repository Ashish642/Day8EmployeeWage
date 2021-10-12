package com.bridgelab;

public class EmployeeWage {
    public static void main(String[] args) {

        // constants
        int IS_PRESENT = 1;
        double empCheck = Math.floor(Math.random() * 10) %2;
        // using random class to get random number
        if (empCheck == IS_PRESENT) { // empCheck get 1 when the first condition is true and employee is present
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
