// NumberGuessingGame.java
// A simple number guessing game.

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner for user input
        Random rand = new Random(); // random number generator

        // Game setup - target number between 1 and 100
        int tN = rand.nextInt(100) + 1; // Generates a number from 1 to 100
        int guess = 0; // User's guess
        int attempts = 0; // To count the number of tries

        // Limit the number of guesses to 10
        int mA = 10;

        System.out.println("Welcome to the Number Guessing Game:  ");
        System.out.println("Guess a number between 1 and 100. You have " + mA + " tries.");

        // The loop to let the user guess
        while (guess != targetNum && attempts < maxAttempts) {
            // Ask the user for a guess
            System.out.print("Enter your guess: ");
            
            // Validate input and handle errors (like non-integer input)
            if (scan.hasNextInt()) {
                guess = scan.nextInt();
                attempts++; // Each valid guess counts as an attempt
                // Check if guess is correct
                if (guess < tN) {
                    System.out.println("Too low! Try again.");
                } else if (guess > tN) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congrats! You guessed the number in " + attempts + " attempts.");
                }

            } else {
                System.out.println("Bruh, that's not a number! try again.");
                scan.next(); // Clear invalid input
            }
        }

        // end of game messages based on result
        if (guess != tN) {
            System.out.println("Sorry, you ran out of attempts. The number was: " + tN;
        }


    }
}
