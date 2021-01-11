import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int numberchosen;
    int remainder;
    String value = "";
    Scanner in = new Scanner(System.in);
    for (;;) {
      System.out.print("Enter a decimal number to convert into binary: ");
      numberchosen = in.nextInt();
      while (numberchosen > 0) {
        remainder = numberchosen % 2;
        value = remainder + value;
        numberchosen /= 2;
      }
      System.out.println("The binary number conversion is: " + value);
      System.out.println();
      value = "";
    }
  }
}