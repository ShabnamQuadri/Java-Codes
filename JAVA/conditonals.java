import java.util.Scanner;

public class conditonals {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    IF-ELSE
    System.out.println("Enter the Number: ");
    int num = sc.nextInt();
    if (num % 2 == 0) {
    System.out.println(" even");
    } else {
    System.out.println(" odd");
    }
    IF- ELSE IF - ELSE
    System.out.println("Enter the Age : ");
    int age = sc.nextInt();
    if (age < 12) {
    System.out.println("The person is Child ");
    } else if ((age < 18) && (age > 12)) {
    System.out.println("The person is Teenager ");
    } else {
    System.out.println("The person is Adult ");
    }
    NESTED IF ELSE
    TERNARY OPERATOR (condition)? true ans1: ans2;
    int p = 25, q = 45;
    String ans;
    ans = (p > q) ? "value of p is 25" : "p is smaller than q";
    System.out.println(ans);
    print the number if its even and divisible by 3
    System.out.println("Enter the number");
    int num = sc.nextInt();
    if ((num % 2 == 0) && (num % 3 == 0)) {
    System.out.println(num);
    }
    print the number if its divisible by 3 or 5
    if ((num % 3 == 0) || (num % 5 == 0)) {
    System.out.println(num);
    }
    System.out.println("Enter num from 1 to 7 to get the day name :");
    int day = sc.nextInt();
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wedday");
        break;
      case 4:
        System.out.println("Thrusday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Sunday");
        break;
    }
  }
}