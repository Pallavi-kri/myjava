import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking two numbers as input
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Perform division
            double result = num1 / num2;
            System.out.println("The result of division is: " + result);
        } catch (java.util.InputMismatchException e) {
            // Handle invalid number input
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Close the scanner to avoid resource leak
            scanner.close();
        }
    }
}
