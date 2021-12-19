/*
 * leetcode-189
 * */

public class Rotate {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (end > start) {
            int startValue = nums[start];
            nums[start] = nums[end];
            nums[end] = startValue;
            start++;
            end--;
        }
    }
}
