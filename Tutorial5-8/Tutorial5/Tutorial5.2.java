// Base class: Employee
class Employee {
    protected String name;
    protected double salary;

    // Constructor to initialize Employee details
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Derived class: Manager
class Manager extends Employee {
    private double incentive;

    // Constructor to initialize Manager details using super()
    public Manager(String name, double salary, double incentive) {
        super(name, salary); // Calling parent class constructor
        this.incentive = incentive;
    }

    // Overriding displayDetails() to include incentive
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling parent class method
        System.out.println("Incentive: $" + incentive);
    }
}

// Derived class: Developer
class Developer extends Employee {
    private String programmingLanguage;

    // Constructor to initialize Developer details using super()
    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary); // Calling parent class constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails() to include programming language
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling parent class method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main class to test the Employee Management System
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating a Manager object
        Manager manager = new Manager("Yeshwin", 75000, 5000);
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println();

        // Creating a Developer object
        Developer developer = new Developer("Lohith", 60000, "Java");
        System.out.println("Developer Details:");
        developer.displayDetails();
    }
}
