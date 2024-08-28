/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
 */
package leetcode.DynamicProgramming;

public class LargestNumberAtLeastTwiceOfOthers747 {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        int max = nums[0];
        int secondMax = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            }
        }
        if (max >= 2*secondMax) {
            return maxIndex;
        }
        return -1;
    }
}
