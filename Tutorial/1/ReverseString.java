import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = x.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
        x.close();
    }
}
