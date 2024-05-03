package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class LargestPositiveInteger {
    public static void main(String[] args) {
        int[] nums = {-1,2,-3,3};
        int[] nums2 = {-1,10,6,7,-7,1};
        int[] nums3 = {-10,8,6,7,-2,-3};

        System.out.println(findMaxK3(nums));
        System.out.println(findMaxK3(nums2));
        System.out.println(findMaxK3(nums3));
    }
    public static int findMaxK(int[] nums) {
        //tu lam
        int[] antiNums = new int[nums.length];
        for (int i = 0; i< nums.length; i++){
            antiNums[i] = - nums[i];
        }
        int maxK = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < antiNums.length; j++) {
                if (nums[i] == antiNums[j] && nums[i] > maxK){
                    maxK = nums[i];
                }
            }
        }
        return maxK;
    }

    public int findMaxK2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = n-1; i >= 0; i--) {
            if (nums[i] > 0 && Arrays.binarySearch(nums, -nums[i]) >= 0) {
                return nums[i];
            }
        }
        return -1;  // If no such pair found
    }

    //kho hieu vl
    public static int findMaxK3(int[] nums) {
        int [] positive=new int [1001];
        int [] negative=new int [1001];
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive[nums[i]]++;
                if(negative[nums[i]]>0){
                    ans=Math.max(ans,nums[i]);
                }
            }
            else{
                negative[Math.abs(nums[i])]++;
                if(positive[Math.abs(nums[i])]>0){
                    ans=Math.max(ans,-nums[i]);
                }
            }
        }
        return ans;
    }

    //de hieu vl sort de tim ra so lon nhat roi iterate tu so lon nhat ve, so sanh voi so be tu duoi len
    // de tim xem co negative k
    public static int findMaxK4(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length - 1, i = 0;
        while (i < j) {
            int a = -1 * nums[j];
            if (nums[i] == a)
                return nums[j];
            else if (nums[i] < a)
                i++;
            else
                j--;
        }
        return -1;
    }

    //tan dung hashset de tim contain do complexity thap O(1)
    // co the chi can add so am thoi k can add het
    public int findMaxK5(int[] nums) {
        int max= -1;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        for(int num:nums){
            if(max < num && set.contains(-num)) max = num;
        }
        return max;
    }
}


