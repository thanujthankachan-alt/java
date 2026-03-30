import java.util.Scanner;
import java.util.InputMismatchException;

// User-defined exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageCalculator {

    // Method to calculate average
    static double calculateAverage(int n, Scanner sc) throws NegativeNumberException {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");

            if (!sc.hasNextInt()) {
                throw new InputMismatchException("Invalid input! Please enter integers only.");
            }

            int num = sc.nextInt();

            if (num < 0) {
                throw new NegativeNumberException("Negative number entered: " + num);
            }

            sum += num;
        }

        return (double) sum / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter value of N: ");

            if (!sc.hasNextInt()) {
                throw new InputMismatchException("Invalid input! N must be an integer.");
            }

            int n = sc.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("N must be greater than 0.");
            }

            double avg = calculateAverage(n, sc);
            System.out.println("Average = " + avg);

        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}