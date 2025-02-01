import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Use try-with-resources to avoid resource leaks
            System.out.println("Enter the value of a: ");
            double a = sc.nextDouble();
            System.out.println("Enter the value of b: ");
            double b = sc.nextDouble();

            System.out.println("Choose an operation: ");
            System.out.println("1: + (Addition)");
            System.out.println("2: - (Subtraction)");
            System.out.println("3: * (Multiplication)");
            System.out.println("4: / (Division)");
            System.out.println("5: % (Modulo)");
            int operation = sc.nextInt();

            // Rule switch introduced in Java 14 (standard in Java 17)
            String result = switch (operation) {
                case 1 -> "Result: " + (a + b);
                case 2 -> "Result: " + (a - b);
                case 3 -> "Result: " + (a * b);
                case 4 -> (b != 0) ? "Result: " + (a / b) : "Error: Division by zero is not allowed.";
                case 5 -> (b != 0) ? "Result: " + (a % b) : "Error: Division by zero is not allowed.";
                default -> "Invalid operation selected.";
            };

            System.out.println(result); // Print the result or error

        }
    }
}
