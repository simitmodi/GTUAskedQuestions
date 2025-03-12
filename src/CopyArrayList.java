import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        // Create the original ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");

        // Copy using the ArrayList constructor
        ArrayList<String> copiedList = new ArrayList<>(originalList);

        // Display both lists
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List: " + copiedList);

        // Modify the original list to show they are independent
        originalList.add("Date");
        System.out.println("\nAfter modifying the original list:");
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List: " + copiedList);
    }
}