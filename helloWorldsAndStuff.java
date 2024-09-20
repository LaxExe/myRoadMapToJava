// helloWorldsAndStuff.java
// Demonstrates various print methods and primitive data types this showcases what I learnt and was my first Java program over 20 lines!!!

public class helloWorldsAndStuff{ 
    public static void main(String[] args) {
      
        // Basic print statements
        System.out.print("Hello, World! ");
        System.out.println("This is a single line.");

        // variables String, int, char, double, boolean
        String name = "John";
        int age = 25;
        char initial = 'J';
        double pi = 3.14159;
        boolean isAdult = age >= 18;

        // Print variable values using the "+" sign and concatination
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Initial: " + initial);
        System.out.println("Pi: " + pi);
        System.out.println("Is Adult? " + isAdult);

        // Formatted output using printf
        System.out.printf("Formatted Pi: %.2f\n", pi);
        System.out.printf("Name: %s, Age: %d\n", name, age);

        // Additional primitive types I learnt!
        byte smallNumber = 120;
        short mediumNumber = 32000;
        long largeNumber = 123456789L;
        float decimalNumber = 5.75f;
        
        //Python would have made this same project with sooooo much less syntax :(
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + mediumNumber);
        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + decimalNumber);
    }
}
