package org.example;
import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        System.out.println("number is: " + n);
        // Condition check
        // if n|1 if greater than n then this number is even
        if ((n | 1) > n) {
            // Print statement
            System.out.println("Number is Even");
        }
        else {
            // Print statement
            System.out.println("Number is Odd");
        }
    }
}
