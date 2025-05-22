//Summer OR Q:3(c)

public class CommandLineCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java CommandLineCalculator <num1> <operator> <num2>");
            System.out.println("Example: java CommandLineCalculator 10 + 5");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);

            double result;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;

                default:
                    throw new IllegalArgumentException("Invalid operator. Use +, -, *, or /.");
            }

            System.out.printf("Result: %.2f %s %.2f = %.2f%n", num1, operator, num2, result);

        } catch (NumberFormatException nfe) {
            System.out.println("Error: Please provide valid numbers.");
        } catch (ArithmeticException ae) {
            System.out.println("Error: " + ae.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println("Error: " + iae.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}
