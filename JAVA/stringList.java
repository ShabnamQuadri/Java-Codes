import java.util.ArrayList;
import java.util.Collections;

public class stringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("D");
        list.add("C");
        list.add("E");
        list.add("A");
        list.add("B");
        list.add("F");
        System.out.println("Original : " + list);
        Collections.sort(list);
        System.out.println("Ascending Order : " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order : " + list);
    }
}
// TIME AND SPACE COMPLEXITY