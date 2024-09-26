// ForLoopsAndArrays.java
// this is my for loops & arrays project, I had to recode this and compiled it from other projects I am working on.

public class ForLoopsAndArrays {
    public static void main(String[] args) {

        // Array of integers
        int[] nums = {5, 10, 15, 20, 25, 30};

        // Basic loop to print all elements, to show all the elements
        System.out.println("Array elements:");
        for (int i = 0; i < nums.length; i++) { // i controls the loop and iterates through them
            System.out.println("Element at index " + i + ": " + nums[i]); 
        }

        // lets get sum of the array elements
        int sum = 0; // starting at 0
        for (int i = 0; i < nums.length; i++) { // another basic for loop
            sum += nums[i]; // adding each number to sum
        }
        System.out.println("\nSum of array elements: " + sum); // final sum printout

        // Reverse the array
        System.out.println("\nReversed array:");
        for (int i = 0; i < nums.length / 2; i++) { // only loop halfway to swap things
            int temp = nums[i]; // temp to store stuff
            nums[i] = nums[nums.length - 1 - i]; // swap first with last
            nums[nums.length - 1 - i] = temp; // swap last with first
        }
        // print reversed array
        for (int i = 0; i < nums.length; i++) { 
            System.out.println("Element at index " + i + ": " + nums[i]);
        }

        // Finding the largest number... nothing too crazy
        int big = nums[0]; // assume first element is the biggest
        for (int i = 1; i < nums.length; i++) { // start at 1 this time
            if (nums[i] > big) {
                big = nums[i]; // new biggest
            }
        }
        System.out.println("\nBiggest element in, array: " + big); // print biggest

        // Enhanced for loop, this is new to me but much easier to read!
        System.out.println("\nUsing enhanced for loop to print reversed array:");
        for (int n : nums) { // just loops through each element
            System.out.println("Num: " + n); // prints each number
        }
        // 2D Array (matrix array)
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < grid.length; i++) { // loop rows
            for (int j = 0; j < grid[i].length; j++) { // loop cols
                System.out.print(grid[i][j] + " "); // print each element
            }
            System.out.println(); // new line after each row
        }
        // Sum of each row... had to try this
        System.out.println("\nSum of each row in matrix:");
        for (int i = 0; i < grid.length; i++) { // go through each row
            int rowSum = 0; // reset sum for this row
            for (int j = 0; j < grid[i].length; j++) { // loop columns
                rowSum += grid[i][j]; // add current number
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum); // print sum for the row
        }
    
}



}
