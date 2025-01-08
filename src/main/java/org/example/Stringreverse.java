package org.example;
import java.util.Scanner;

public class Stringreverse {
    public static void main(String[] args) {
    String original = "", reverse = ""; // Setting the strings values
    Scanner in = new Scanner(System.in); // Scanner is equal to input from user

    while(!original.contains("exit"))
    // As long as user does not input "exit", user will be prompt to enter a sentence
    {
        original = "";
        reverse = "";
        System.out.println("Enter a sentence to be reversed: ");
        original = in.nextLine(); // Setting "original" to be equal to user's input

        int length = original.length(); // Getting user's input character length (original)
        for (int i = length - 1; i >= 0; i--) // Getting input from the last character to be reversed
            reverse = reverse + original.charAt(i); //Setting "reverse" to the input "original" characters

        System.out.println(reverse); // Printing the input reversely
    }

}
}
