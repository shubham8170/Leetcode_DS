public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            if (sum > ans) {
                ans = sum;
            }
            if (sum < 0) {
                sum = 0;

            }
        }
        return ans;
    }
}
