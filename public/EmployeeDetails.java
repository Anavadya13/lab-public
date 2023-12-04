import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    int empAge;
    String empGender;
    String empDesignation;
    double empSalary;
    String empAddress;

    public Employee(int empId, String empName, int empAge, String empGender, String empDesignation, double empSalary, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empGender = empGender;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empAddress = empAddress;
    }

    public int getEmpId() {
        return empId;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
        System.out.println("Employee Gender: " + empGender);
        System.out.println("Employee Designation: " + empDesignation);
        System.out.println("Employee Salary: $" + empSalary);
        System.out.println("Employee Address: " + empAddress);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = in.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Employee ID: ");
            int empId = in.nextInt();
            in.nextLine(); 
            System.out.print("Employee Name: ");
            String empName = in.nextLine();
            System.out.print("Employee Age: ");
            int empAge = in.nextInt();
            in.nextLine(); 
            System.out.print("Employee Gender: ");
            String empGender = in.nextLine();
            System.out.print("Employee Designation: ");
            String empDesignation = in.nextLine();
            System.out.print("Employee Salary: ");
            double empSalary = in.nextDouble();
            in.nextLine();  
            System.out.print("Employee Address: ");
            String empAddress = in.nextLine();

            employees[i] = new Employee(empId, empName, empAge, empGender, empDesignation, empSalary, empAddress);
        }

        System.out.print("Enter the ID of the employee to display details: ");
        int requiredId = in.nextInt();

        boolean found = false;

        for (Employee employee : employees) {
            if (employee.getEmpId() == requiredId) {
                employee.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + requiredId + " not found.");
        }

        in.close();
    }
}


