public class Objective3Lab3 {
  public static void main(String[] args) {
    int first = 1 + (int)(Math.random() * 6);
    int second = 1 + (int)(Math.random() * 6);
    int third = 1 + (int)(Math.random() * 6);
    int sum = first + second + third;
    String stringFirst = String.valueOf(first);
    String stringSecond = String.valueOf(second);
    String stringThird = String.valueOf(third);
    String stringSum = String.valueOf(sum);
    System.out.println(stringFirst + " + " + stringSecond + " + " + stringThird + " = " + stringSum);
  }
}
