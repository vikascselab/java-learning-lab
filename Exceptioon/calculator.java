
import java.util.Scanner;

class calculator {

  public static void main(String[] args) {
    System.out.println("welcome to exception world");

    Scanner Input = new Scanner(System.in);

    System.out.println("Enter the value of a");
    int a = Input.nextInt();
    System.out.println("Enter the value of b");

    int b = Input.nextInt();
    try {

      int[] Mark = new int[5];
      System.out.println(Mark[6]);
      Mark[6] = a / b;
      // System.out.println("result is" + c);

      System.out.println(Mark[6]);
    } catch (ArithmeticException exception) {
      System.out.println("dived by zero , " + exception.getMessage());
    } catch (Throwable ee) {
      System.out.println("General Exception");
      throw ee;
    } finally {
      System.out.println("I am in finally");
    }
  }
}
