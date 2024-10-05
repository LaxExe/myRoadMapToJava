// myFirstBubbleSort.java
// This program sorts an array of integers using the Bubble Sort algorithm
// Bubble Sort is simple but can be inefficient for large datasets, this is a huge step up from linear sort tho,

import java.util.Scanner;

public class myFirstBubbleSort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Scanner for user input called scan

        // Prompt user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        int[] arr = new int[n]; // Array to hold the elements of the user

        // Input elements from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Call the bubbleSort method to sort the array
        bubbleSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close the scanner
        scan.close();
    }

    // Method to implement bubble sort algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped; // To track if any swaps happened in the current iteration

        // Outer loop runs n-1 times
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // No swaps at the start of each pass

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // If a swap occurs, set swapped to true
                }
            }

            // If no swaps occurred in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
