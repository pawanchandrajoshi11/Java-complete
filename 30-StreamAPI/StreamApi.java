import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(5);
        nums.add(8);
        nums.add(4);
        nums.add(9);

        // different ways to print elements of nums

        // method 1
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // method 2
        for (int n : nums) {
            System.out.println(n);
        }

        // method 3 (new java feature)
        nums.forEach(n -> System.out.println(n));


        // READ MORE ABOUT STREAM CLASS FROM YT/GOOGLE, it's lil advanced.

    }
}
