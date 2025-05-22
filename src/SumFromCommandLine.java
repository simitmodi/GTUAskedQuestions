// Winter 2024 Q:4(b)

public class SumFromCommandLine {
    public static void main(String[] args) {
        // Validate input length
        if (args.length < 2) {
            System.out.println("Error: Please provide exactly two numbers as command line arguments.");
            return;
        }

        try {
            // Parse the arguments into integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Calculate the sum
            int sum = num1 + num2;

            // Print the result
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }
    }
}
