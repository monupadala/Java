// LoanCalculator.java
class LoanCalculator {
    public double calculateLoan(double principal, double interestRate) {
        return principal * (1 + interestRate / 100);
    }

    public double calculateLoan(double principal, double interestRate, int tenure) {
        return principal * Math.pow(1 + interestRate / 100, tenure);
    }

    public double calculateLoan(double principal, double interestRate, int tenure, double processingFee) {
        return (principal * Math.pow(1 + interestRate / 100, tenure)) + processingFee;
    }
}

public class LoanDemo {
    public static void main(String[] args) {
        LoanCalculator loanCalculator = new LoanCalculator();
        System.out.println("Personal Loan: " + loanCalculator.calculateLoan(10000, 5));
        System.out.println("Home Loan: " + loanCalculator.calculateLoan(10000, 5, 10));
        System.out.println("Car Loan: " + loanCalculator.calculateLoan(10000, 5, 10, 500));
    }
}
