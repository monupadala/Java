class BankAccount {
    private String accountHolder;
    private double balance;
    protected String accountType;
    public String accountNumber;

    public BankAccount(String accountHolder, String accountNumber, String accountType, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amoount = " + amount + "\nNew Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private void updateBalance(double amount) {
        balance += amount;
        System.out.println("Current balance = " + balance);
    }

    protected void updateAccountType(String newType) {
        accountType = newType;
        System.out.println("Account type updated to " + newType);
    }
}

class Employee extends BankAccount {
    public Employee(String accountHolder, String accountNumber, String accountType, double balance) {
        super(accountHolder, accountNumber, accountType, balance);
    }

    public void changeAccountType(BankAccount account, String newType) {
        account.updateAccountType(newType);
    }
}

class Admin extends BankAccount {
    public Admin(String accountHolder, String accountNumber, String accountType, double balance) {
        super(accountHolder, accountNumber, accountType, balance);
    }

    public void modifyBalance(BankAccount account, double amount) {
        try {
            java.lang.reflect.Method method = BankAccount.class.getDeclaredMethod("updateBalance", double.class);
            method.setAccessible(true);
            method.invoke(account, amount);
        } catch (Exception e) {
            System.out.println("Error modifying balance.");
        }
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount("John Doe", "123456", "Savings", 1000);
        
        customer.viewBalance();
        customer.deposit(500);
        
        Employee employee = new Employee("Employee Name", "000001", "Employee", 0);
        employee.changeAccountType(customer, "Invvestment");
        
        Admin admin = new Admin("Admin Name", "999999", "Admin", 0);
        admin.modifyBalance(customer, 2000);
    }
