package graphics;

public class Rectangle implements Figure {
    protected double length, width;

    // This MUST be public
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}