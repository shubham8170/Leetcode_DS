import java.util.*;

class containsDuplicate {
    public boolean ContainsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            if (set.contains(i))
                return true;
            else
                set.add(i);
        return false;

    }
}