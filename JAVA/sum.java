import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1 :");
    int num_1 = sc.nextInt();
    System.out.println("Enter number 2 :");
    int num_2 = sc.nextInt();
    int sum = num_1 + num_2;
    System.out.println("Sum of numbers is " + sum);
  }
}
