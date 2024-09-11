package leetcode.SlidingWindow;

//219
public class ContainsDuplicate {
    public static void main(String[] args) {
        containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1) return false;
        for (int i = 0; i < nums.length - 1; i++) {
            int bound = Math.min(i + k, nums.length - 1);
            for (int j = i + 1; j <= bound; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}
