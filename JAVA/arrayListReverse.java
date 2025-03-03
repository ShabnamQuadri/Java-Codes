import java.util.ArrayList;
import java.util.Collections;

public class arrayListReverse {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);// adding elements in list
        list.add(2);
        list.add(33);
        list.add(21);
        list.add(58);
        System.out.println("Original List : " + list);
        // reverseList(list);
        // Collections.reverse(list);
        // System.out.println("Reversed List : " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list : " + list);
    }
}
