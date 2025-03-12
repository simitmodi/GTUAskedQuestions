import java.util.Scanner; // (i) import keyword

public class KeywordDemo {
    private Scanner scanner; // Scanner instance for input
    private int count;

    // (iii) this keyword used to refer to current object's fields
    public KeywordDemo() {
        this.scanner = new Scanner(System.in); // (ii) new keyword to create Scanner object
        this.count = 0;
    }

    public void processNumbers() {
        System.out.println("Enter numbers (type 'exit' to quit):");

        while (true) {
            if (!scanner.hasNextInt()) {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    break; // (iv) break keyword to exit loop
                } else {
                    System.out.println("Invalid input. Skipping...");
                    continue; // (v) continue keyword to skip to next iteration
                }
            }

            int num = scanner.nextInt();
            if (num % 2 == 0) {
                continue; // Skip even numbers
            }

            count++;
            System.out.println("Processed odd number: " + num);
        }
    }

    public static void main(String[] args) {
        KeywordDemo demo = new KeywordDemo(); // (ii) new keyword again
        demo.processNumbers();
        System.out.println("Total odd numbers processed: " + demo.count);
    }
}