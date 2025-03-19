write a java program for addition of two numbers method without return type

public class Main {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public static void main(String[] args) {
        Main addition = new Main();
        addition.add(5, 10);
    }
}
