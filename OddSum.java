import java.util.Scanner; // Import Scanner class for user input

public class OddSum {
    
    // Function to calculate the sum of odd numbers from 1 to n
    public static int sumOfOddNum(int n) {
        int sum = 0; // Variable to store the sum of odd numbers
        
        // Loop through odd numbers from 1 to n
        for (int i = 1; i <= n; i += 2) { 
            sum += i; // Add current odd number to sum
        }
        
        return sum; // Return the final sum
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of n: "); // Prompt user for input
            int n = scanner.nextInt(); // Read input from user
            
            // Print the result using the sumOfOddNum function
            System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sumOfOddNum(n));
        }
    }
}
