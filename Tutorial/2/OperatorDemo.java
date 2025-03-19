// OperatorDemo.java
class OperatorDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic: " + (a + b) + ", " + (a - b) + ", " + (a * b) + ", " + (a / b) + ", " + (a % b));

        // Relational Operators
        System.out.println("Relational: " + (a == b) + ", " + (a != b) + ", " + (a > b));

        // Logical Operators
        System.out.println("Logical: " + ((a > b) && (b > 0)) + ", " + ((a > b) || (b < 0)) + ", " + !(a < b));

        // Bitwise Operators
        System.out.println("Bitwise: " + (a & b) + ", " + (a | b) + ", " + (a ^ b) + ", " + (~a) + ", " + (a << 1) + ", " + (a >> 1));

        // Assignment Operators
        System.out.println("Assignment: " + (a += 5) + ", " + (a -= 5) + ", " + (a *= 2));

        // Unary Operators
        System.out.println("Unary: " + (++a) + ", " + (--b));

        // Ternary Operator
        int min = (a < b) ? a : b;
        System.out.println("Ternary: " + min);
    }
}
