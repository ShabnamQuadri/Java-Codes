import java.util.Scanner;

public class loops {
  public static void main(String[] args) {
    // COUNT THE DIGITS IN A NUMBER
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number :");
    int num = sc.nextInt();
    int count = 0;
    while (num > 0) {
      num = num / 10;
      count++;
    }
    System.out.println("The number of digits are " + count);
    // SUM OF DIGITS
    int sum = 0;
    while (num > 0) {
      sum = sum + num % 10;
      num = num / 10;
    }
    System.out.println("The sum of digits is " + sum);
    // REVERSE THE NUMBER DIGIT
    int ans1 = 0;
    while (num > 0) {
      ans1 = ans1 * 10 + num % 10;
      num = num / 10;
    }
    System.out.println("The sum of digits is " + ans1);
    // FACTORIAL
    int fac = 1;
    for (int i = 1; i <= num; i++) {
      fac = fac * i;
      System.out.println(fac);
    }
    System.out.println(fac);
    // POWER
    int ans = 1;
    System.out.println("Enter Power:");
    int pow = sc.nextInt();
    for (int i = 1; i <= pow; i++) {
      ans = ans * num;
    }
    System.out.println(ans);
  }
}
