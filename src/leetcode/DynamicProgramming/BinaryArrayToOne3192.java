/**
 * https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-ii/description/
 */
package leetcode.DynamicProgramming;

public class BinaryArrayToOne3192 {
    //từ trái qua phải flip dần thôi
    //mỗi lần 2 số cạnh nhau khác nhau thì phải flip 1 lần
    //số 0 ở đầu thì flip thêm 1 lần
    public int minOperations(int[] nums) {
        int ans = 0, len = nums.length;
        for(int i = 1; i < len; i++)
            if (nums[i] != nums[i - 1])
                ans++;

        if(nums[0] == 0) ans++;
        return ans;
    }
}
