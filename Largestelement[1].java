import java.util.Scanner;

public class Largestelement {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = x.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
        x.close();
    }
}
