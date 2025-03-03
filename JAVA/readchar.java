import java.util.Scanner;

public class readchar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter word :");
    char ch = sc.next().charAt(4);
    System.out.println("char " + ch);
  }
}
