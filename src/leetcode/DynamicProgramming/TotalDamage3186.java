/**
 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
 */
package leetcode.DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TotalDamage3186 {
    public long maximumTotalDamage(int[] power) {
        Arrays.sort(power); // Sort the power array

        // Initialize a map to keep track of the maximum damage at each spell value
        Map<Integer, Integer> dp = new HashMap<>();

        int maxDamage = 0;

        for (int dmg : power) {
            // Compute the max damage including this spell, considering the constraints
            int currentMax = Math.max(dp.getOrDefault(dmg, 0),
                            dmg + dp.getOrDefault(dmg - 3, 0));
            currentMax = Math.max(currentMax, dmg + dp.getOrDefault(dmg - 4, 0));

            dp.put(dmg, currentMax);
            maxDamage = Math.max(maxDamage, currentMax);
        }

        return maxDamage;
    }
}
