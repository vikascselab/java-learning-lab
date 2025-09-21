
import java.util.ArrayList;
import java.util.List;

class TestingList {

  public static void main(String[] args) {

    List<String> strList = new ArrayList<>();

    strList.add("Vikas");
    strList.add("Yadav ");

    strList.add(1, "pradeep");

    strList.remove(0);

    if (strList.contains("pradeep")) {

      System.out.println("vikas exist in list");

    }

    for (int i = 0; i < strList.size(); i++) {
      System.out.println(strList.get(i));
    }

  }

}
