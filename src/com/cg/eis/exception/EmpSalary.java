package com.cg.eis.exception;

import java.util.Scanner;

public class EmpSalary {

    private void validate_salary(double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary is below 3000");
        }
        else {
            System.out.println("Employee salary is " + salary);
            System.out.println("Salary is high and above 3000");
        }
    }

    public static void main(String[] args) {
        double salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
        salary = sc.nextDouble();
        EmpSalary emp = new EmpSalary();
        try {
            emp.validate_salary(salary);
        }catch (EmployeeException a) {
            a.printStackTrace();
        }
    }


}
