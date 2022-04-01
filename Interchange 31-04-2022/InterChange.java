import java.util.ArrayList;
import java.util.Collections;

public class InterChange {

	public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      list.add("Chennai");
      list.add("Super");
      list.add("Kings");
      System.out.println("Before Interchange :" +list);
      Collections.swap(list, 0, 2);
      System.out.println("After  interchange :" +list);
	}

}
