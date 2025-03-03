import java.util.Scanner;

public class patterns {
  public static void main(String[] args) {
    // // RECTANGULAR
    // for (int i = 1; i <= 3; i++) {
    // for (int j = 1; j <= 6; j++) {
    // System.out.print("*");
    // }
    // System.out.println(" ");
    // }
    // Sqaure with space (errorr!!!!)
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of rows : ");
    int r = sc.nextInt();
    // System.out.println("Enter no of columns : ");
    // int c = sc.nextInt();
    // for (int i = 1; i <= r; i++) {
    // for (int j = 1; i <= c; i++) {
    // if (i == 1 || i == r || j == 1 || j == c)
    // System.out.print("*");
    // else
    // System.out.print(" ");

    // }
    // System.out.println();
    // }
    // for (int i = 1; i <= r; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // for (int i = 1; i <= r; i++) {
    // for (int j = 1; j <= r + 1 - i; j++) {
    // System.out.print("*");
    // }
    // System.out.println(" ");
    // }
    int i, j, k;
    for (int k = 1; k <= r; k++) {
      for (int i = 1; i <= r - i; i++) {
        System.out.print(" ");

      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }

  }
}
