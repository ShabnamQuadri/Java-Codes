import java.util.Scanner;

public class arraysecond {
    void maxOfArray() {
        int[] arr = { 2, 14, 6, 8, 10, 12 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("maximum value is " + ans);
    }

    void searchOfValue() {
        int arr[] = { 3, 15, 99, 34, 25, 37, 75, 88, 29, 100, 103 };
        int searchvalue = 100;
        for (int i = 0; i < arr.length; i++) {
            if (searchvalue == arr[i]) {
                System.out.println("The value 100 is found at " + i);
            }
        }
    }

    public static void main(String[] args) {
        arraysecond obj = new arraysecond();
        obj.maxOfArray();
        obj.searchOfValue();
        Scanner sc = new Scanner(System.in);
        // TAKING INPUT IN ARRAY
        int array[] = new int[10];
        System.out.println("Enter values of array: ");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}