public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int pivotind = -1, left = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (left == sum - left - nums[i]) {
                return i;
            }
            left += nums[i];

        }
        return pivotind;
    }
}
