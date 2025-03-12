class Account {
    private int Ac_No;
    private String Name;
    private double Balance;

    // Method to set initial data
    public void setdata(int acNo, String name, double balance) {
        Ac_No = acNo;
        Name = name;
        Balance = balance;
    }

    // Method to display account details
    public void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + Ac_No);
        System.out.println("Name: " + Name);
        System.out.println("Balance: $" + Balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println("\nDeposited: $" + amount);
        } else {
            System.out.println("\nInvalid deposit amount.");
        }
    }
}

// Main class to test the Account class
public class AccountTest {
    public static void main(String[] args) {
        // Create an Account object
        Account account = new Account();

        // Set initial data using setdata()
        account.setdata(12345, "Alice Johnson", 1000.0);

        // Display initial details
        account.display();

        // Deposit $500
        account.deposit(500.0);
        account.display(); // Show updated balance

        // Attempt invalid deposit (negative amount)
        account.deposit(-200.0);
        account.display(); // Balance remains unchanged
    }
}