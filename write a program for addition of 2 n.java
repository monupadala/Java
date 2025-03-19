write a program for addition of 2 numbers with return type


public class Main {
        public static int add(int num1, int num2) {
        return num1 + num2; 
    }

    public static void main(String[] args) {
        int number1 = 5; 
        int number2 = 10; 
        int result = add(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}
