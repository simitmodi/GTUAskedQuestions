// WInter 2024 Q:3(C)

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary > 0 ? monthlySalary : 0.0;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 5000.0);
        Employee emp2 = new Employee("Jane", "Smith", -4500.0);

        System.out.printf("%s %s yearly salary: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary() * 12);
        System.out.printf("%s %s yearly salary: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getMonthlySalary() * 12);

        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.1);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.1);

        System.out.println("After 10% raise:");
        System.out.printf("%s %s yearly salary: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary() * 12);
        System.out.printf("%s %s yearly salary: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getMonthlySalary() * 12);
    }
}