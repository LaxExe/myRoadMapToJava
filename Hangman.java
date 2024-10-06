// Hangman.java
// This is a basic hangman game where you guess letters and try to figure out the word
// This is a project I built with a friend, Harish, I also used the CS50.AI
import java.util.Scanner;
import java.util.Random;
public class Hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Creating the scanner to take input
        Random rand = new Random();  // Random object for picking a word
        // Word list for the game (would love to make this bigger or probably find a list on github)
        String[] words = {"java", "programming", "openai", "chatbot", "development", "hangman", "puzzle", "computer"};
        
        // Randomly pick a word from the list
        String SW = words[rand.nextInt(words.length)]; 

        // Array to track guessed letters (starts with _'s)
        char[] GW = new char[SW.length()];
        for (int i = 0; i < GW.length; i++) {
            GW[i] = '_';
        }
        int attempts = 6;  // You only get 6 wrong guesses
        boolean wG = false;  // Flag to check if the word is guessed
        String guessedLetters = "";   // To keep track of letters already guessed

        System.out.println("Welcome to Hangman!");
        System.out.println("Try to guess the word. You have " + attempts + " wrong attempts.");
        
        // Game loop - while there are attempts and the word is not guessed
        while (attempts > 0 && !wG) {
            // Show current progress of the word
            System.out.print("\nWord: ");
            for (char c : GW) {
                System.out.print(c + " ");
            }
            // Ask the player to guess a letter
            System.out.print("\n\nEnter a letter: ");
            char guess = scan.next().toLowerCase().charAt(0); // Always get lowercase
            // If the letter was already guessed
            if (guessedLetters.indexOf(guess) != -1) {
                System.out.println("You already guessed that letter. Try something else!");
                continue; // Skip the rest of the loop, ask for another guess
            }

            guessedLetters += guess; // Add the guessed letter to our list

            // Check if the guessed letter is part of the word
            boolean correctGuess = false;
            for (int i = 0; i < SW.length(); i++) {
                if (SW.charAt(i) == guess) {
                    GW[i] = guess;  // Reveal the letter in the word
                    correctGuess = true;
                }
            }

            // If they guessed wrong, subtract from attempts
            if (!correctGuess) {
                attempts--;
                System.out.println("Nope, that letter isn't in the word. You have " + attempts + " attempts left.");
            }
            // Check if the entire word has been guessed yet or not
            wG = true;
            for (char c : GW) {
                if (c == '_') {
                    wG = false;
                    break;
            }
           }
        }
        // If the word was guessed correctly
        if (wG) {
            System.out.println("\nCongrats! You guessed the word: " + SW);
        } else {
            System.out.println("\nGame over! The word was: " + SW);
        }
        scan.close(); // Closing the scanner
    }
}
