import java.util.HashSet;
import java.util.Set;

class setinterfaces {

  public static void main(String[] args) {
    System.out.println("welcome to setinterfaces");

    Set<String> name = new HashSet<>();
    System.out.println(name.add("Vikas"));

    System.out.println(name.add("satyam"));

    System.out.println(name.remove("satyam"));

    Utility.Print(name);

  }

}
