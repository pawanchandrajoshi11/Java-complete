import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// for sorting we can also make our class implements Comparable. In this case compareTo method will do the work of comparator.

public class Sorting {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(49);
        nums.add(51);
        nums.add(90);

        Collections.sort(nums);

        System.out.println(nums); // [23, 49, 51, 90]

        // Making our own Sorting method - Comparators - is an interface/logic with
        // which we can sort according to our needs, if you want to give power to a
        // class to compare its objects with its other objects we make it implements
        // comparable interface.

        Comparator<Integer> comp = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1; // 1 means, yes sort it
                } else {
                    return -1; // -1 means, negative don't sort
                }
            }
        };

        Collections.sort(nums, comp);

        System.out.println(nums); // [90, 51, 23, 49]
    }
}
