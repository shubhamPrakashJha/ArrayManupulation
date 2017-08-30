import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(36);
        nums.add(73);
        nums.add(40);
        nums.add(1);

        System.out.println(nums);
        Collections.shuffle(nums);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println(nums);
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));


    }
}