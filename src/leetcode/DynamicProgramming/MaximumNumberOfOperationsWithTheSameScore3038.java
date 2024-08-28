/**
 * https://leetcode.com/problems/maximum-number-of-operations-with-the-same-score-i/description/
 */
package leetcode.DynamicProgramming;

public class MaximumNumberOfOperationsWithTheSameScore3038 {
    public int maxOperations(int[] nums) {
        int times = 1;
        int max = nums[0] + nums[1];
        for (int i = 2; i <= nums.length - 2; i+=2) {
            if (max == nums[i] + nums[i+1]) {
                times++;
            } else {
                return times;
            }
        }
        return times;
    }
}
