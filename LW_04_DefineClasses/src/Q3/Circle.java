package Q3;

public class Circle {
    private double radius;

    // No argument constructor
    public Circle() {
        radius = 0.0;
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method
    public double getRadius() {
        return radius;
    }

    // Method to compute area
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute circumference
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}
