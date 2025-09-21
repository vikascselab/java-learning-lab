
import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {

  public static void main(String[] args) {

    Queue<Integer> number = new LinkedList<>();

    number.add(1);
    number.offer(4);

    // Utility.Print(number);

    System.out.println("element is identy fy  " + number.peek());
    System.out.println("element is remove" + number.remove());

    Utility.Print(number);

    // for (Integer i : number) {

    // System.out.println(i);

    // }
  }
}
