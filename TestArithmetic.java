import arithmetic.*;
import java.util.Scanner;

public class TestArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        Add add = new AddImpl();
        Subtract sub = new SubtractImpl();
        Multiply mul = new MultiplyImpl();
        Divide div = new DivideImpl();

        System.out.println("\nResults:");
        System.out.println("Addition = " + add.add(a, b));
        System.out.println("Subtraction = " + sub.subtract(a, b));
        System.out.println("Multiplication = " + mul.multiply(a, b));
        System.out.println("Division = " + div.divide(a, b));

        sc.close();
    }
}