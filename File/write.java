
import java.io.FileWriter;
import java.io.IOException;

public class write {
  public static void main(String[] args) {

    String filename = "Java.txt";
    try (FileWriter write = new FileWriter(filename);) {

      write.write("jai shree i love india   RAM RAM ");
      write.flush();
      System.out.println("file write susscesful");
    } catch (IOException exception) {

      System.out.println("Exception occurd " + exception.getMessage());
    }

  }
}
