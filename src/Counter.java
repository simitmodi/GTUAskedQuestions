public class Counter {
    int c;

    // Parameterized constructor
    public Counter(int initialValue) {
        c = initialValue;
    }

    // Instance method to increment and return updated value
    public int increment() {
        c++;
        return c;
    }

    // Main method to test the Counter class
    public static void main(String[] args) {
        Counter counter = new Counter(10); // Initialize c to 10
        System.out.println("Initial value: " + counter.c); // Output: 10
        System.out.println("After increment: " + counter.increment()); // Output: 11
        System.out.println("After another increment: " + counter.increment()); // Output: 12
    }
}