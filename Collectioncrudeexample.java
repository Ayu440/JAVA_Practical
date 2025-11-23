
import java.util.*;

public class Collectioncrudeexample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println(list);

        System.out.println("Element at index 1: " + list.get(1));
        
        list.set(1,"Pineapple");
        System.out.println(list);

        list.add(2,"Grapes");
        System.out.println(list);

        list.remove("Orange");
        System.out.println(list);

        System.out.println("Contains Apple? " + list.contains("Apple"));

        System.out.println("Size" + list.size());

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        
    }
}
