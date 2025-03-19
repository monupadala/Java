import java.util.Scanner;
public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = x.nextInt();
        System.out.print("Enter second number: ");
        int b = x.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        x.close();
    }
}