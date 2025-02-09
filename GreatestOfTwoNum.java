import java.util.Scanner;  // Import Scanner class for user input

public class GreatestOfTwoNum {
    
    // Function to return the greater of two numbers
    public static int getGreater(int a, int b) {
        return (a > b) ? a : (a < b) ? b : a;  // Using ternary operator
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Creating Scanner object for user input
            
            // Asking user to enter first number
            System.out.println("Enter the value of a: ");
            int a = scanner.nextInt();

            // Asking user to enter second number
            System.out.println("Enter the value of b: ");
            int b = scanner.nextInt();

            // Printing the greater number
            System.out.println("The greater number is: " + getGreater(a, b));
        }
    }
}
