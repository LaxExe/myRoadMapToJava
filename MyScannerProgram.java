// MyScannerProgram.java
//this project took me a while, nearly a whole day but I got it done I basically sniped a lot of my smaller programs and made them into one giant one!, it does go a bit into intermediate territory but nothing 3 hours of coding can't fix!, Also I hate how stuff has to be formated otherwise I would have used single letter variables like a normal person. 

import java.util.InputMismatchException; // First exception that I learned!
import java.util.Scanner; // The Scanner Class

public class MyScannerProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Creating a scanner to take user input

        // Ask for user's name and favorite quote
        System.out.print("Enter your name: ");
        String name = scan.nextLine(); // Read full line for the name
        System.out.print("Enter something funny!: ");
        String quote = scan.nextLine(); // Read full line for a funny quote
        // Ask for the user's age and validate it
        System.out.print("Enter your age: ");
        int age = 0;
        boolean valid = false;
        while (!valid) { // This loop ensures the input is a valid integer
            try {
                age = scan.nextInt();
                valid = true; // If input is valid, exit the loop
            } catch (InputMismatchException e) {
                System.out.println("Bruh!!! Please enter a valid number for age.");
                scan.next(); // Clear invalid input
            }
        }
        // Ask for the user's height in meters
        System.out.print("Enter your height in meters (e.g, 1. 75): ");
        double height = 0.0;
        valid = false;
        while (!valid) { // Loop to validate height input
            try {
                height = scan.nextDouble();
                valid = true; // Valid input means exit loop
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid  decimal numbr for height.");
                scan.next(); // Clear the invalid input
            }
        }

        // Checking if the user is an adult
        boolean isAdult = age >= 18;

        // printing the user details using a mix of formatted prints and regular prints
        System.out.println("\n--- User Summary ---");
        System.out.printf("Name: %s\nAge: %d\nHeight: %.2f meters\n", name, age, height); // Formatted output
        System.out.println("Favorite Quote: \"" + quote + "\"");
        System.out.println("Are you an adult? " + (isAdult ? "Yes" : "No")); // Conditional statement inside print
        //gathering more input (integer, double, and word) and display the results
        System.out.println("\nLet's input a few more things:");

        // Repeating this twice, so a simple for loop is used
        for (int i = 1; i <= 2; i++) {
            System.out.println("\nAttempt " + i); // Show which attempt we're on
            // Integer input with validation
            System.out.print("Enter an integer: ");
            int intValue = 0;
            valid = false;
            while (!valid) {
                try {
                    intValue = scan.nextInt();
                    valid = true; // Exit loop if valid
                } catch (InputMismatchException e) { //using the exception
                    System.out.println("Enter a valid integer.");
                    scan.next(); // removing invalid
                }
            }

            // double input with validation
            System.out.print("Enter a double: ");
            double doubleValue = 0.0;
            valid = false;
            while (!valid) {
                try {
                    doubleValue = scan.nextDouble();
                    valid = true; // Exit loop if valid
                } catch (InputMismatchException e) {
                    System.out.println("Enter a valid decimal number.");
                    scan.next(); // Clear invalid input
                }
            }

            // single word input (no validation needed here)
            System.out.print("Enter a word: ");
            String word = scan.next(); // Grabs a single word
            // Display the results from this round
            System.out.printf("You entered -> Integer: %d, Double: %.2f, Word: %s\n", intValue, doubleValue, word);
        }
        // closing the scanner to prevent resource leaks
        scan.close();
    }
}

