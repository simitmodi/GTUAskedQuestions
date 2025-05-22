// Winter 2024 OR Q:4(c)

import java.util.Scanner;

public class WithdrawalExample {

    // Custom exception class for insufficient funds
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw: ");
        double withdrawalAmount = input.nextDouble();
        double balance = 1000.0;

        try {
            // Attempt to perform withdrawal
            Withdraw(balance, withdrawalAmount);
        } catch (InsufficientFundsException e) {
            // Handle the exception
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to perform withdrawal with exception handling
    public static void Withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // Throw exception if withdrawal amount exceeds balance
            throw new InsufficientFundsException(
                    "Insufficient funds for withdrawal of $" + amount + ". Current balance: $" + balance
            );
        }
        // Optional: Deduct the amount from the balance
        System.out.println("Withdrawal successful. Remaining balance: $" + (balance - amount));
    }
}