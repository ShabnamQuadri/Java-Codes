import java.util.Scanner;

public class SpiralOrder {
    static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrderMatrix(int[][] matrix, int r, int c) {
        int toprow = 0, bottomrow = r - 1, leftcol = 0, rightcol = c - 1;
        int totalelement = 0;
        while (totalelement < r * c) {
            // top -> leftcol to right col
            for (int j = leftcol; j <= rightcol; j++) {
                System.out.print(matrix[toprow][j] + " ");
                totalelement++;
            }
            toprow++;
            // rightcol-> toprow to bottomrow
            for (int i = toprow; i <= bottomrow; i++) {
                System.out.print(matrix[i][rightcol] + " ");
                totalelement++;
            }
            rightcol--;
            // bottomrow-> rightcol to leftcol
            for (int j = rightcol; j >= leftcol; j--) {
                System.out.print(matrix[bottomrow][j] + " ");
                totalelement++;

            }
            bottomrow--;
            // leftcol-> bottomrow to toprow
            for (int i = bottomrow; i >= toprow; i--) {
                System.out.print(matrix[i][leftcol] + " ");
                totalelement++;

            }
            leftcol++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows and column :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r * c;
        System.out.println("Enter total " + total + " values ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        print2DArray(matrix);
        System.out.println("Spiral Order");
        printSpiralOrderMatrix(matrix, r, c);
    }
}