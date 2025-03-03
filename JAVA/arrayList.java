import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // wrapper classes- objects me premitive store rehta hai
        // int(premitive)=Integer(wrapper class)
        // Integer in = Integer.valueOf(4);
        // System.out.println(in);
        // Array list---arrays ki limitation ko overcome krti hai
        // array list ne size can vary
        ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Boolean> l2 = new ArrayList<>();
        // METHODS
        // add new element
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);

        // get an element at index i
        System.out.println(l1.get(0));

        // print with loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        // withot loop also you can print list
        System.out.println(l1);

        // add element at i-th index
        l1.add(0, 4);
        System.out.println(l1);

        // change the value at i-th index
        l1.set(0, 3);
        System.out.println(l1);

        // removing element
        l1.remove(0);
        System.out.println(l1);

        l1.remove(Integer.valueOf(50));
        System.out.println(l1);
        // OUTPUT
        // 10
        // 10
        // 20
        // 30
        // 40
        // 50
        // 60
        // 70
        // [10, 20, 30, 40, 50, 60, 70]
        // [4, 10, 20, 30, 40, 50, 60, 70]
        // [3, 10, 20, 30, 40, 50, 60, 70]
        // [10, 20, 30, 40, 50, 60, 70]
        // [10, 20, 30, 40, 60, 70]

        // checking if an element exist
        boolean ans = l1.contains(Integer.valueOf(90));
        System.out.println(ans);

        // if you don't specify class - you can add any data type
        ArrayList l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2.0);
        l2.add(3.5);
        l2.add("Shabnam");
        l2.add("Quadri");
        System.out.println(l2);

    }

}
