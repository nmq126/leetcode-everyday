package leetcode;

import java.util.Arrays;

public class MaximizeHappinessChildren {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int maxIndex = happiness.length - 1;
        long max = happiness[maxIndex];
        for (int i = 1; i <= k - 1; i++) {
            maxIndex--;
            if (happiness[maxIndex] - i > 0) {
                max += happiness[maxIndex] - i;

            }
        }
        return max;
    }
}
