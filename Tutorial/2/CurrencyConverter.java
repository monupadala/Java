// CurrencyConverter.java
import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();

        // Exchange rate
        double exchangeRate = 82.5;
        double inr = usd * exchangeRate;
        int roundedInr = (int) inr;

        // Output
        System.out.println("Converted Amount in INR (double): " + inr);
        System.out.println("Converted Amount in INR (int, rounded): " + roundedInr);

        // Type Conversion Examples
        byte byteValue = 10;
        int intValue = byteValue;
        double doubleValue = intValue;
        int narrowedInt = (int) doubleValue;
        byte narrowedByte = (byte) narrowedInt;

        System.out.println("Type Conversion Examples:");
        System.out.println("byte to int: " + intValue);
        System.out.println("int to double: " + doubleValue);
        System.out.println("double to int: " + narrowedInt);
        System.out.println("int to byte: " + narrowedByte);
    }
}
