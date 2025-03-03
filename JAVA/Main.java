import java.util.Scanner;
////methods=functions

class algebra {
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        algebra var1 = new algebra();
        Scanner var2 = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int var3 = var2.nextInt();
        int var4 = var2.nextInt();
        System.err.println("sum of numbers is ");
        int var5 = var1.add(var3, var4);
        System.out.println(var5);
        // Standard LIBRARY

        System.out.println(Math.floor(5.8));
        System.out.println(Math.ceil(4.5));
        System.out.println(Math.sqrt(65));
    }
}
