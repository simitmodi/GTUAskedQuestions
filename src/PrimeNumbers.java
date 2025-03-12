import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error: Please provide exactly one argument for n.");
            System.exit(1);
        }

        String arg = args[0].trim();
        if (arg.isEmpty() || !isValidPositiveInteger(arg)) {
            System.out.println("Error: n must be a positive integer.");
            System.exit(1);
        }

        int n = Integer.parseInt(arg);
        List<Integer> primes = new ArrayList<>();
        primes.add(2); // First prime
        int current = 3;

        while (primes.size() < n) {
            if (isPrime(current)) {
                primes.add(current);
            }
            current += 2; // Check only odd numbers after 2
        }

        for (int prime : primes) {
            System.out.println(prime);
        }
    }

    // Validate input format (no exceptions used)
    private static boolean isValidPositiveInteger(String str) {
        return str.matches("^[1-9]\\d*$"); // Matches numbers like 1, 123, 456 (no leading zeros)
    }

    // Prime check (no exceptions used)
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}