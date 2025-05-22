// Summer 2024 OR Q:5(c)

class Staff {
    protected int employee_Id;
    protected String employee_Name;

    // Constructor
    public Staff(int employee_Id, String employee_Name) {
        this.employee_Id = employee_Id;
        this.employee_Name = employee_Name;
    }

    // Insert or update base details
    public void setDetails(int employee_Id, String employee_Name) {
        this.employee_Id = employee_Id;
        this.employee_Name = employee_Name;
    }

    // Display base details
    public void showDetails() {
        System.out.println("Employee ID: " + employee_Id);
        System.out.println("Employee Name: " + employee_Name);
    }
}

class SalariedStaff extends Staff {
    private String designation;
    private double monthly_salary;

    // Constructor
    public SalariedStaff(int employee_Id, String employee_Name, String designation, double monthly_salary) {
        super(employee_Id, employee_Name);
        this.designation = designation;
        this.monthly_salary = monthly_salary;
    }

    // Insert or update full details
    public void setDetails(int employee_Id, String employee_Name, String designation, double monthly_salary) {
        super.setDetails(employee_Id, employee_Name);
        this.designation = designation;
        this.monthly_salary = monthly_salary;
    }

    // Display all details
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Designation: " + designation);
        System.out.println("Monthly Salary: ₹" + monthly_salary);
        System.out.println("----------------------------------");
    }
}

public class EmployeeDetail {
    public static void main(String[] args) {
        if (args.length % 4 != 0) {
            System.out.println("Usage: <ID> <Name> <Designation> <Salary> for each employee");
            return;
        }

        int numberOfEmployees = args.length / 4;
        SalariedStaff[] staffArray = new SalariedStaff[numberOfEmployees];

        // Reading command line arguments
        int index = 0;
        for (int i = 0; i < args.length; i += 4) {
            try {
                int id = Integer.parseInt(args[i]);
                String name = args[i + 1];
                String designation = args[i + 2];
                double salary = Double.parseDouble(args[i + 3]);

                staffArray[index++] = new SalariedStaff(id, name, designation, salary);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please check ID and Salary values.");
                return;
            }
        }

        // Display all employee details
        System.out.println("\n---- Employee Details ----");
        for (SalariedStaff staff : staffArray) {
            staff.showDetails();
        }

        // Example: Update the first employee's details if needed
        if (staffArray.length > 0) {
            System.out.println("Updating first employee's record...\n");
            staffArray[0].setDetails(999, "Updated Name", "Lead Developer", 95000.00);
            staffArray[0].showDetails();
        }
    }
}