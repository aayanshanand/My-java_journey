import java.util.*;

public class AverageCalculator {
     // Function to calculate the average of three numbers
    public static double calculateAverage(double num1, double num2, double num3) {
         return (num1 + num2 + num3) / 3;
 }
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){

        // Taking three numbers as input from the user
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculating and printing the average
        double average = calculateAverage(num1, num2, num3);
        System.out.println("The average is: "+average);
       }
}
}