import java.util.Scanner;

public class recursionProblem {
    // static int factorial(int n) {
    // if (n == 0)
    // return 1;
    // int smallans = factorial(n - 1);
    // return n * smallans;

    // }

    static void multiple(int n, int k) {
        if (k == 1) {
            return;
        }
        multiple(n, k - 1);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of n : ");
        // int n = sc.nextInt();
        // System.out.println(factorial(n));
        System.out.println(multiple(2, 3));
    }
}
