import java.util.Scanner;

public class Twopointers {
    // TWO POINTER APPROACH
    static void sortArr(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

    }

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverse(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print();
        }
    }

    static int[] SquareSort(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int ans[] = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                k++;
                left++;
            } else {
                ans[k] = arr[right] * arr[right];
                k++;
                right--;
            }
        }
        return ans;

    }

    static void SortOpti(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }

        }

    }

    static void EvenOddSort(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if ((arr[left] % 2) == 0) {
                left++;
            }
            if ((arr[right] % 2) == 1) {
                right--;
            }

        }

    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // arrays.sort --- in build function
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array :");
        printArr(arr);
        // sortArr(arr);
        // System.out.println("Sorted array : ");
        // // SortOpti(arr);
        // EvenOddSort(arr);
        // printArr(arr);
        int[] ans = SquareSort(arr);
        reverse(ans);
        System.out.println("Sorted array");

        printArr(ans);
    }
}
