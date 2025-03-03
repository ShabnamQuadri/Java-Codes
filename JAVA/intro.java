import java.util.Scanner;

public class intro {
  public static void main(String[] args) {
    // System.out.println("Hello World");
    // taking input from user
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Name:");
    String name = sc.next();
    System.out.println("Provided name is " + name);

  }
}