import java.util.Scanner;

class ShapeArea {

    
    double area(double radius) {
        return 3.14 * radius * radius;
    }

 
    double area(double length, double breadth) {
        return length * breadth;
    }

  
    double area(float base, float height) {
        return 0.5 * base * height;
    }
}

public class AreaProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShapeArea obj = new ShapeArea();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + obj.area(r));

        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.area(l, b));

        System.out.print("Enter base and height: ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println("Area of Triangle: " + obj.area(base, height));

        sc.close();
    }
}