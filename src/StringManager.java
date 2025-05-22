// Winter 2023 OR Q:3(C)

import java.util.Scanner;
import java.util.Arrays;

public class StringManager {
    static final int SIZE = 10;
    static String[] name = new String[SIZE];

    // (i) Search method
    public static int search(String s) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(s)) {
                return i;
            }
        }
        return -1;
    }

    // (ii) Sort method
    public static void sort() {
        String[] sorted = Arrays.copyOf(name, name.length);
        Arrays.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted Strings:");
        for (String s : sorted) {
            System.out.println(s);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 10 strings
        System.out.println("Enter " + SIZE + " strings:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("String " + (i + 1) + ": ");
            name[i] = scanner.nextLine();
        }

        // Menu
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Search a string");
            System.out.println("2. Sort strings");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter string to search: ");
                    String query = scanner.nextLine();
                    int index = search(query);
                    if (index != -1) {
                        System.out.println("String found at index: " + index);
                    } else {
                        System.out.println("String not found.");
                    }
                    break;
                case 2:
                    sort();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}