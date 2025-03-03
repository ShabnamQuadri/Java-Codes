import java.util.Scanner;

// 0, 1, 1, 2, 3, 5, 8, 13 .......
public class fibonacci {
    static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
