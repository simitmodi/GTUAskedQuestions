// EmployeeTest.java

public class EmployeeDetail {
    public static void main(String[] args) {
        // Example usage
        SalariedEmployee emp = new SalariedEmployee();
        emp.employee_Id = 101;
        emp.employee_Name = "John Doe";
        emp.designation = "Software Engineer";
        emp.monthly_salary = 5000.0;

        System.out.println("Employee ID: " + emp.employee_Id);
        System.out.println("Name: " + emp.employee_Name);
        System.out.println("Designation: " + emp.designation);
        System.out.println("Monthly Salary: $" + emp.monthly_salary);
    }
}

class EmployeeDetails {
    int employee_Id;
    String employee_Name;
}

class SalariedEmployee extends EmployeeDetails {
    String designation;
    double monthly_salary;
}