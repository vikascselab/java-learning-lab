import java.util.HashMap;
import java.util.Map;

class map {

  public static void main(String[] args) {
    System.out.println("welcome to mapintrfce");

    Map<String, Integer> map = new HashMap<>();

    map.put("vikas", 3);
    map.put("yadav", 4);

    System.out.println(map.get("vikas"));
    // map.remove("vikas");
    System.out.println(map.values());
    for (String k : map.keySet()) {

      System.out.println(map.get(k));

    }

  }

}
