import java.util.Scanner;

public class recursion {
    // a function calling itself with diff parameters & base case to terminate
    // infinite loop
    // principle of mathematical induction
    // WAP to print all nautral number from 1 to n
    // last in first out

    static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n - 1);

    }

    static void printIncr(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncr(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        printDec(n);
        printIncr(n);
    }
}
