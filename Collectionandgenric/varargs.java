
public class varargs {

  public static void main(String[] args) {

    System.out.println(sum(1, 2, 3));

  }

  public static int sum(int first, int second, int... a) {
    int sum = first + second;
    for (int i : a) {
      sum += i;

    }
    return sum;
  }

}
