import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {

    System.out.println("welcome to switch case");
    Scanner Input = new Scanner(System.in);
    System.out.println("Enter The Value");
    int day = Input.nextInt();

    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      default:
        System.out.println("Invalid number");
        break;
    }

  }
}
