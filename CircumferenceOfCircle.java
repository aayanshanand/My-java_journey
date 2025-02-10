import java.util.Scanner;

public class CircumferenceOfCircle {
    
    // Method to calculate the circumference of a circle given its radius
    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Prompting the user to enter the radius
            System.out.println("Enter the radius: ");
            
            // Reading the radius input from the user
            double radius = scanner.nextDouble();
            
            // Calculating and displaying the circumference
            System.out.println("The circumference of the circle is: " + getCircumference(radius));
        } 
    }
}