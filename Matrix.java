import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Input for Matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input for Matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Addition Logic - Fixed loops to cover entire matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Printing the Sum
        System.out.println("\nSum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

        // Symmetry Check Logic
        if (rows != cols) {
            System.out.println("The result matrix isn't symmetric (it's not square).");
        } else {
            boolean symmetric = true;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // Compare element at (i,j) with element at (j,i)
                    if (sum[i][j] != sum[j][i]) {
                        symmetric = false;
                        break;
                    }
                }
                if (!symmetric) break;
            }

            if (symmetric) {
                System.out.println("The result matrix is symmetric.");
            } else {
                System.out.println("The result matrix is not symmetric.");
            }
        }
        
        sc.close();
    }
}