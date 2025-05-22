// Winter 2023 Q:3(b)

import java.util.Scanner;

public class GujaratDistricts {
    public static void main(String[] args) {
        // Array of 5 Gujarat districts
        String[] districts = {
                "Ahmedabad",  // Index 0
                "Surat",      // Index 1
                "Vadodara",   // Index 2
                "Rajkot",     // Index 3
                "Bhavnagar"   // Index 4
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Enter district index (0-4): ");
        int index = input.nextInt();

        // Check index validity
        if (index >= 0 && index < districts.length) {
            System.out.println("District: " + districts[index]);
        } else {
            System.out.println("Out of Bounds");
        }

        input.close();
    }
}