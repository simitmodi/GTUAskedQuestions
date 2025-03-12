import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Handle negative numbers manually
        if (number < 0) {
            number = -number;  // Convert to positive equivalent
        }

        int sum = 0;

        while (number > 0) {
            sum += number % 10;  // Extract last digit and add to sum
            number /= 10;        // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
        input.close();
    }
}