package assignment;

import java.util.Scanner;

public class Age {

    public void validate_age(int age) throws MyException {
        if(age > 15) {
            System.out.println("You are validated");
        }
        else {
            throw new MyException("Please enter valid age(above 15years)");
        }
    }

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        age = sc.nextInt();
        Age a1 = new Age();
        try {
            a1.validate_age(age);
        }catch (MyException a) {
            a.printStackTrace();
        }

    }
}
