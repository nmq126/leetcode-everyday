/**
 * https://leetcode.com/problems/counting-bits/description/
 */
package leetcode.DynamicProgramming;

public class CountingBits338 {
    public static void main(String[] args) {

    }

    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            int x = i - Integer.highestOneBit(i);
            result[i] = 1 + result[x];
        }
        return result;
    }
}