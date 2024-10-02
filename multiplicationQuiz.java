// MultiplicationQuiz.java
// A small quiz program that tests your knowledge of multiplication tables!
// It's random and keeps going until you want to stop
import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating a scanner to gather for user input
        Random rand = new Random(); // Random number generator
        // Variable to keep track of the correct answer
        int cA;
        int uA;
        String continueQuiz = "yes"; // Control for the loop, can be changed to stop quiz

        System.out.println("Welcome to the Multiplication Quiz!");
        System.out.println("You will be asked some random multiplication questions.");
        System.out.println("Type 'exit' anytime to quit the quiz.");

        // Loop continues until the user types "exit"
        while (!continueQuiz.equalsIgnoreCase("exit")) {
            // Generate two random numbers between 1 and 10
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            
            // Calculate the correct answer
            cA = num1 * num2;

            // Ask the user the multiplication question
            System.out.printf("What is %d * %d? ", num1, num2);

            // Check if the input is an integer
            if (scan.hasNextInt()) {
                uA = scan.nextInt();
                // Compare user's answer to the correct answer
                if (uA == correctAnswer) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Wrong! The correct answer is " + cA);
                }

            } else {
                // Check if the user typed "exit" to quit
                String input = scan.next();
                if (input.equalsIgnoreCase("exit")) {
                    continueQuiz = "exit"; // Exit the loop
                } else {
                    System.out.println("Please enter a valid number or type 'exit' to quit.");
                }
            }
        }

        System.out.println("Thanks you for playing!");
        scan.close(); // Close the scanner
    }
}
