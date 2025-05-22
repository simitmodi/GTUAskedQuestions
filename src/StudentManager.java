//Winter 2022 OR Q:4(c)

import java.io.*;

class Student {
    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Convert student info to string for saving
    public String toDataString() {
        return id + "," + name + "\n";
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        String filename = "students.dat";

        // Sample student data
        Student[] students = {
                new Student("S101", "Alice"),
                new Student("S102", "Bob"),
                new Student("S103", "Charlie")
        };

        // Write students to file
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            for (Student s : students) {
                String data = s.toDataString();
                fos.write(data.getBytes());
            }
            System.out.println("Student data saved to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read and display student data from file
        try (FileInputStream fis = new FileInputStream(filename)) {
            System.out.println("\nReading student data from file:");
            int ch;
            StringBuilder sb = new StringBuilder();

            while ((ch = fis.read()) != -1) {
                sb.append((char) ch);
            }

            // Display file content (student data)
            System.out.println(sb.toString());

        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
