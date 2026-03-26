import graphics.*;
import graphics.Rectangle;
import graphics.Circle;

public class GraphicsTest {
    public static void main(String[] args) {
        // Create an array of Figures to demonstrate polymorphism
        Figure[] shapes = {
            new Circle(5.0),
            new Rectangle(10.0, 4.0),
            new Square(7.0),
            new Triangle(6.0, 3.0)
        };

        System.out.println("--- Area Calculations ---");
        for (Figure shape : shapes) {
            // Get the class name and the calculated area
            String name = shape.getClass().getSimpleName();
            System.out.printf("%s Area: %.2f\n", name, shape.getArea());
        }
    }
}