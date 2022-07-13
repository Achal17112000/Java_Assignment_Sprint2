package assignment;

import java.util.Scanner;

public class EmpName {

    public void validate_name(String fname, String lname) throws MyException {
        if(fname.isEmpty() && lname.isEmpty()) {
            throw new MyException("Firstname and last name is empty");
        }else if(fname.isEmpty()){
            throw new MyException("Employee First name is missing");
        }
        else  if(lname.isEmpty()){
            throw new MyException("Employee Last name is missing");
        }
        else {
            System.out.println("Valid details");
            System.out.println("Employee Name is " + fname + " " + lname);
        }
    }
    public static void main(String[] args) {
        String fname, lname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Firstname and Lastname");
        fname = sc.nextLine();
        lname = sc.nextLine();
        EmpName emp = new EmpName();
        try {
            emp.validate_name(fname, lname);
        }catch (MyException e) {
            e.printStackTrace();
        }

    }
}
