import java.util.Scanner;

public class Objective9Lab1 {
  public static void main(String[] args) {
    printName();
  }

  public static void printName() {
    Scanner scanner = new Scanner(System.in);
    String userName = "";

    System.out.println("What is your name?");
    userName = scanner.nextLine();

    System.out.println("Hello " + userName + "!");
  }
}
