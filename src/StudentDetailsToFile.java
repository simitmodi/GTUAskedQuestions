import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Winter 2024 OR Q:5(B)

public class StudentDetailsToFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("StudentData.txt"))) {
            while (true) {
                System.out.print("Enter student name (or 'q' to quit): ");
                String name = scanner.nextLine();

                if (name.equalsIgnoreCase("q")) {
                    break;
                }

                System.out.print("Enter roll number: ");
                String rollNumber = scanner.nextLine();

                System.out.print("Enter course: ");
                String course = scanner.nextLine();

                // Format student data as comma-separated values
                String studentData = name + "," + rollNumber + "," + course;

                // Write student data to file
                writer.write(studentData);
                writer.newLine();

                System.out.println("Student details saved.\n");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        System.out.println("All student details have been saved to 'StudentData.txt'.");
    }
}