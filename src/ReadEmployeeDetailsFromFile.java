import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Winter 2024 Q:5(b)
public class ReadEmployeeDetailsFromFile {

    public static void main(String[] args) {
        String filePath = "EmpDetail.txt"; // File path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Employee Details from " + filePath + ":\n");
            System.out.println("--------------------------------------------------");
            System.out.println("ID\tName\t\tPosition\tSalary");
            System.out.println("--------------------------------------------------");

            while ((line = br.readLine()) != null) {
                // Split the line by commas
                String[] employeeData = line.split(",");

                if (employeeData.length == 4) {
                    String id = employeeData[0];
                    String name = employeeData[1];
                    String position = employeeData[2];
                    String salary = employeeData[3];

                    // Print formatted output
                    System.out.printf("%s\t%s\t%s\t%s%n", id, name, position, salary);
                } else {
                    System.out.println("Invalid data format in line: " + line);
                }
            }

            System.out.println("--------------------------------------------------");

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}