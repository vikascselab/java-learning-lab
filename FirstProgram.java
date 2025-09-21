import java.util.Scanner;

class Firstprogram {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name ");
    String name = input.nextLine();

    System.out.println("welcome" + name);

    input.close();
  }
}
