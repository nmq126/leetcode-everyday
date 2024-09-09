package leetcode.Greedy;

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = nums.length - 1; i >= 0 ; i-=2) {
            max += nums[i-1];
        }
        return max;
    }
}
