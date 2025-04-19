abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee("Alice", 5000);
        PartTimeEmployee partTime = new PartTimeEmployee("Bob", 20, 80);

        System.out.println("Full-Time Employee Details:");
        fullTime.displayDetails();
        System.out.println();

        System.out.println("Part-Time Employee Details:");
        partTime.displayDetails();
    }
}