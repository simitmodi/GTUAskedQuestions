//Summer 2023 Q:3(c)

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator (integer): ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator (integer): ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;  // Can throw ArithmeticException if denominator = 0
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException ae) {
            System.out.println("Error: Division by zero is not allowed! 🚫");
        }
        catch (InputMismatchException ime) {
            System.out.println("Error: Please enter valid integers only! ⚠️");
        }
        finally {
            System.out.println("Execution completed - thanks for using the calculator! ✅");
        }
    }
}
