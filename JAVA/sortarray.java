import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class sortarray {
    static void Sorted(int value[]) {
        Arrays.sort(value);
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        if (value[i] < value[i - 1]) {
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int value[] = new int[n];
        System.out.println("Enter the value of array : ");
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        Sorted(value);
    }
}
