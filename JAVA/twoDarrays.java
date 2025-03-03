import java.util.Scanner;

public class twoDarrays {
    // multidimensiona array
    // initialization of 2D array
    // int [][] name =new int [no of rows][no of colums]
    static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addition(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("invalid");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum");
        print2DArray(sum);
    }

    static void Multiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Invalid");
            return;
        }
        int[][] mul = new int[r1][c2]; // r1*c1= 4*10 // r2*c2=10*3 //result=4*3
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication");
        print2DArray(mul);
    }

    static void TransposeMatrix(int[][] a, int r1, int c1) {
        int ans[][] = new int[c1][r1];
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                ans[i][j] = a[j][i];
            }
        }
        System.out.println("Transpose");
        print2DArray(ans);

    }

    static void

    static void transposeInplace(int[][] a, int r1, int c1) {
        for (int i = 0; i < c1; i++) {
            for (int j = i; j < r1; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println("Transpose");

    }

    public static void main(String[] args) {
        // Taking 2D input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int r1 = sc.nextInt();
        System.out.println("Enter column");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter the values of array 1 ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1:");
        print2DArray(a);

        // System.out.println("Enter row");
        // int r2 = sc.nextInt();
        // System.out.println("Enter column");
        // int c2 = sc.nextInt();
        // int[][] b = new int[r2][c2];
        // System.out.println("Enter the values of array");
        // for (int i = 0; i < r2; i++) {
        // for (int j = 0; j < c2; j++) {
        // b[i][j] = sc.nextInt();
        // }
        // }
        // System.out.println("matrix2:");
        // print2DArray(b);
        // addition(a, r1, c1, b, r2, c2);
        // Multiplication(a, r1, c1, b, r2, c2);
        // TransposeMatrix(a, r1, c1);
        transposeInplace(a, r1, c1);
        print2DArray(a);

    }
}