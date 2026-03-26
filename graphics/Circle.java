package graphics;

public class Circle implements Figure {
    private double radius;

    // This MUST be public to be called from GraphicsTest
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}