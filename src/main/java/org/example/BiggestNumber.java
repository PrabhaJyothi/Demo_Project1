package org.example;
import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args)
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = s.nextInt();
        System.out.print("Enter the second number: ");
        y = s.nextInt();
        System.out.print("Enter the third number: ");
        z = s.nextInt();
        if ( x > y )
        {
            if ( x > z )
            {
                System.out.println("Largest number: " + x);
            }
            else
            {
                System.out.println("Largest number: " + z);
            }
        }
        else
        {
            if ( y > z )
            {
                System.out.println("Largest number: " + y);
            }
            else
            {
                System.out.println("Largest number: " + z);
            }
        }
    }
}

