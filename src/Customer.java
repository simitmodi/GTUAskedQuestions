// Winter 2024 Q:5(c)

public class Customer extends Thread {
    // Instance variables
    private String name;
    private String productName;
    private int purchaseQuantity;

    // Static variable shared across all Customer instances
    private static int productQuantity = 10;

    // Constructor to initialize customer details
    public Customer(String name, String productName, int purchaseQuantity) {
        this.name = name;
        this.productName = productName;
        this.purchaseQuantity = purchaseQuantity;
    }

    // Overridden run method to perform synchronized purchase
    @Override
    public void run() {
        synchronized (Customer.class) {
            System.out.println(name + " is trying to purchase " + purchaseQuantity + " of " + productName + ". Current stock: " + productQuantity);

            if (productQuantity >= purchaseQuantity) {
                productQuantity -= purchaseQuantity;
                System.out.println(name + " successfully purchased " + purchaseQuantity + " " + productName + "(s). Remaining stock: " + productQuantity);
            } else {
                System.out.println("Sorry, " + name + " could not purchase " + purchaseQuantity + " " + productName + "(s). Not enough stock.");
            }
        }
    }

    // Main method to simulate concurrent customer purchases
    public static void main(String[] args) {
        // Both customers are trying to buy the same product
        Customer customer1 = new Customer("Alice", "ProductA", 7);
        Customer customer2 = new Customer("Bob", "ProductA", 5);

        // Start both threads
        customer1.start();
        customer2.start();
    }
}