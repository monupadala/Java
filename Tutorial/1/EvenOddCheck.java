import java.util.Scanner;
public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = x.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        x.close();
    }
}