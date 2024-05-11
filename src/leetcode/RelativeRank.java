package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRank {
    public String[] findRelativeRanks(int[] score) {
        int[] sorted = Arrays.copyOf(score, score.length);
        Arrays.sort(sorted);
        String[] strings = new String[score.length];
        Map<Integer, String> map = new HashMap<>();
        map.put(sorted[sorted.length - 1], "Gold Medal");
        if (sorted.length - 2 >= 0) map.put(sorted[sorted.length - 2], "Silver Medal");
        if (sorted.length - 3 >= 0) map.put(sorted[sorted.length - 3], "Bronze Medal");
        if (sorted.length - 4 >= 0) {
            int count = 4;
            for (int i = sorted.length - 4; i >=0 ; i --) {
                map.put(sorted[i], String.valueOf(count));
                count++;
            }
        }
        for (int i = 0; i < score.length; i++) {
            strings[i] = map.get(score[i]);
        }
        return strings;
    }
}
