// Winter 2023 Q:1(c)

public class ArrayOperations {
    public static void main(String[] args) {
        // Declare and initialize an array of 10 integers
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Call and display results of each method
        System.out.println("Sum of elements: " + add(numbers));
        System.out.println("Maximum element: " + max(numbers));

        int searchKey = 50;
        int index = search(numbers, searchKey);
        System.out.println("Search for " + searchKey + ": " +
                (index != -1 ? "Found at index " + index : "Not found"));
    }

    // Method to calculate and print the sum of all elements
    public static int add(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total; // Return sum for display
    }

    // Method to find and print the maximum element
    public static int max(int[] array) {
        int maximum = array[0];
        for (int num : array) {
            if (num > maximum) {
                maximum = num;
            }
        }
        return maximum; // Return max for display
    }

    // Method to search for a key and return its index
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return first occurrence index
            }
        }
        return -1; // Return -1 if not found
    }
}