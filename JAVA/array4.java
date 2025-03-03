import java.util.Scanner;

public class array4 {
    // SWAPPING OF 2 INTEGER
    // public static void swap(int a, int b) {
    // System.out.println("Original value :");
    // System.out.println("a " + a);
    // System.out.println("b " + b);

    // int temp;
    // temp = a;
    // a = b;
    // b = temp;
    // System.out.println("swapped value :");
    // System.out.println("a " + a);
    // System.out.println("b " + b);

    // }
    // SWAPPED WITHOUT USING A VARIABLE
    // static void swapwovar(int a, int b) {

    // System.out.println("original value :");
    // System.out.println("a " + a);
    // System.out.println("b " + b);

    // a = a + b;
    // b = a - b;
    // a = a - b;
    // System.out.println("swapped value :");
    // System.out.println("a " + a);
    // System.out.println("b " + b);

    // }
    // REVERSE THE INTEGER ARRAY
    static int[] reverseArray(int[] arr) {
        int i, j;
        int n = arr.length;
        int[] ans = new int[n];
        for (i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return System.out.println(ans);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 3, 4, 5, 6 };
        // System.out.println("Enter value of a: ");
        // int a = sc.nextInt();
        // System.out.println("Enter value of b: ");
        // int b = sc.nextInt();
        // // int a = 5;
        // int b = 6;
        // swap(a,b);
        // swapwovar(a, b);
        int ans[] = reverseArray(arr);
        printArray(ans);
    }
}