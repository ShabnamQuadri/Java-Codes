import java.util.Scanner;

public class arrayproblem {
    static void greatervaluecount(int[] value, int x) {
    int count = 0;

    for(int = i; i< value.length; i++) {
    if (value[i] > x) {
    count++;
    }
    }

    System.out.println(" The number greater than search value are " + count);
    }

    public static void main(String[] args) {
        int[] problem_arr = { 2, 5, 6, 8, 5, 0, 7, 5, 3, 66, 5 };
        int searchVal = 5;
        int count = 0;
        for (int i = 0; i < problem_arr.length; i++) {
            if (searchVal == problem_arr[i]) {
                count++;
            }
        }
        System.out.println("the repeated value of 5 in given array is " + count);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int value[] = new int[n];
        System.out.println("Enter the value of array : ");
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        System.out.println("Enter the search value: ");
        int x = sc.nextInt();
        greatervaluecount(value, x);
    }
}
