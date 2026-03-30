import java.util.Scanner;
import java.util.InputMismatchException;

// Generic Stack class
class Stack<T> {
    private int top;
    private int maxSize;
    private Object[] stackArray;

    // Constructor
    public Stack(int size) {
        maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
    }

    // Push operation
    public void push(T value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    // Pop operation
    @SuppressWarnings("unchecked")
    public T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return null;
        }
        return (T) stackArray[top--];
    }

    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter stack size: ");

            if (!sc.hasNextInt()) {
                throw new InputMismatchException("Invalid input! Enter integer only.");
            }

            int size = sc.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("Stack size must be greater than 0.");
            }

            Stack<Integer> stack = new Stack<>(size);

            int choice;
            do {
                System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
                System.out.print("Enter your choice: ");

                if (!sc.hasNextInt()) {
                    throw new InputMismatchException("Invalid choice!");
                }

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter value to push: ");
                        if (!sc.hasNextInt()) {
                            throw new InputMismatchException("Enter integer only!");
                        }
                        int value = sc.nextInt();
                        stack.push(value);
                        break;

                    case 2:
                        Integer popped = stack.pop();
                        if (popped != null) {
                            System.out.println("Popped element: " + popped);
                        }
                        break;

                    case 3:
                        stack.display();
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 4);

        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}