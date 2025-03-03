import java.util.Scanner;

public class arrManipulation {
    // fimding unique non repeated value in an array
    // static int findingUnique(int[] arr) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if (arr[i] == arr[j]) {
    // arr[i] = -1;
    // arr[j] = -1;
    // }
    // }
    // }
    // int ans = -1;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] > 0) {
    // ans = arr[i];
    // }
    // }
    // return ans;
    // }
    // finding the second largest value in an array
    // static int findMax(int[] arr) {
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // }
    // return max;
    // }

    // static int findSecondMax(int[] arr) {
    // int max = findMax(arr);
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == max) {
    // arr[i] = Integer.MIN_VALUE;
    // }
    // }
    // int secondmax = findMax(arr);
    // return secondmax;
    // }
    // RETURN THE FIRST VALUE THAT IS REPEATING IN THE ARRAY
    // static int firstRepeat(int[] arr) {
    // int n = arr.length;
    // int ans = 0;
    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if (arr[i] == arr[j]) {
    // return arr[i];
    // }
    // }
    // }
    // return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        // System.out.println("Enter the target value: ");
        // int target = sc.nextInt();
        System.out.println("Enter the value of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("Unique element", +findingUnique(arr));
        // System.out.println(findSecondMax(arr));
        System.out.println(firstRepeat(arr));
    }
}