package Q3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input inner and outer radii
        System.out.print("Enter inner radius (ri): ");
        double ri = input.nextDouble();

        System.out.print("Enter outer radius (ro): ");
        double ro = input.nextDouble();

        // Create Circle objects
        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        // Compute shaded area
        double shadedArea =outerCircle.computeArea() - innerCircle.computeArea();

        // Display results
        System.out.println("Inner Circle Area: " + innerCircle.computeArea());

        System.out.println("Outer Circle Area: " + outerCircle.computeArea());

        System.out.println("Shaded Circular Region Area: " + shadedArea);

        System.out.println("Inner Circle Circumference: " + innerCircle.computeCircumference());

        System.out.println("Outer Circle Circumference: " + outerCircle.computeCircumference());

    }
}
