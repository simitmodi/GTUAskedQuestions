public class FunctionOverloading {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        FunctionOverloading example = new FunctionOverloading();

        // Calling the overloaded methods
        System.out.println("Add two integers: " + example.add(5, 10)); // Calls add(int, int)
        System.out.println("Add three integers: " + example.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Add two doubles: " + example.add(5.5, 10.2)); // Calls add(double, double)
        System.out.println("Concatenate two strings: " + example.add("Hello, ", "World!")); // Calls add(String, String)
    }
}