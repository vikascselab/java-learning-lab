// import java.util.Scanner;

// public class Welcome {
//   public static void main(String[] args) {

//     Scanner input = new Scanner(System.in);

//     System.out.println("Enter your name ");
//     String name = input.nextLine();

//     System.out.println("welcome " + name);

//     int a = 24;
//     int b = 23;
//     int c = a + b;
//     System.out.println(c);

//     input.close();
//   }
// }

// public class Welcome {
//   public static void main(String[] args) {
//     System.out.println("Welcome");
//   }
// }
// public class od {
//   public static void main(String[] args) {
//     System.out.println("vikas yadav");
//   }
// }

import java.util.Scanner;

class oddSum {
  public static void main(String[] args) {
    System.out.println("Welcome to odd sum");
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter the Value ");
    int num = input.nextInt();
    int sum = OddSum(num);

    System.out.println(sum);

    input.close();
  }

  public static int OddSum(int num) {
    int sum = 0;
    int i = 1;
    while (i <= num) {

      sum += i;
      i += 2;

    }
    return sum;
  }
}