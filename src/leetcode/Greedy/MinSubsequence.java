package leetcode.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Constraints:
//
//1 <= nums.length <= 500
//1 <= nums[i] <= 100

public class MinSubsequence {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> newList = new ArrayList<>();
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();
        int total = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            newList.add(nums[i]);
            total += nums[i];
            if (total > sum - total) {
                break;
            }
        }
        return newList;
    }

    public List<Integer> minSubsequence2(int[] nums) {
        List<Integer> newList = new ArrayList<>();
        int[] freq = new int [101];
        int total = 0;
        for (int val: nums) {
            freq[val]++;
            total += val;
        }
        int subSeqSum = 0;
        for (int i = 100; i > 0; i--) {
            while (freq[i] > 0) {
                newList.add(i);
                subSeqSum += i;
                freq[i]--;
                if (subSeqSum > total - subSeqSum) {
                    return newList;
                }
            }
        }

        return newList;
    }
}
