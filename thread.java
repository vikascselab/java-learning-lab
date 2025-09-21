
public class thread {

  public static void main(String[] args) {

    System.out.println("weclome to treads");
    long startime = System.currentTimeMillis();
    // first task

    for (int i = 0; i <= 1000; i++) {

      System.out.print("*" + i + " ");
    }

    for (int i = 0; i <= 1000; i++) {

      System.out.print("$" + i + " ");
    }

    for (int i = 0; i <= 1000; i++) {

      System.out.print("#" + i + " ");
    }

    long endtime = System.currentTimeMillis();

    System.out.println("total time taken  " + (endtime - startime));
  }

}
