
import java.util.Scanner;

public static double areaWithInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double radius = scanner.nextDouble();
    return Math.PI * radius * radius;
}



class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
