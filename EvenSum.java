import java.util.Scanner; // Import Scanner class for user input

public class EvenSum {
    // Function to calculate the sum of even numbers from 1 to n
    public static int sumOfEvenNum(int n) {
        int sum = 0; // Variable to store the sum of even numbers
        
        // Loop through even numbers from 2 to n
        for (int i = 2; i <= n; i += 2) {
            sum += i; // Add current even number to sum
        }
        
        return sum; // Return the final sum
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of n: "); // Prompt user for input
            int n = scanner.nextInt(); // Read input from user
            
            // Print the result using the sumOfEvenNum function
            System.out.println("Sum of even numbers from 1 to " + n + " is: " + sumOfEvenNum(n));
        }
    }
}
