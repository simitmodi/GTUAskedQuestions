public class SumCalculator {
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Error: Provide exactly two numbers.");
            return;
        }

        // Parse arguments directly (no error handling)
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        // Calculate and print sum
        System.out.println("Sum: " + (num1 + num2));
    }
}