//find missing numbers from a range . given numbers from 1 to 10 with some missing .find missing number using hashset 

import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.println("Enter numbers from 1 to 10:");
        for (int i = 0; i < 10; i++) {
            if (sc.hasNextInt()) {
                set.add(sc.nextInt());
            }
        }

        System.out.println("Missing numbers:");
        for (int i = 1; i <= 10; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}