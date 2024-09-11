package leetcode.Greedy;

public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int count = 0;
        int var = 0;
        for (char c: s.toCharArray()) {
            if (c == 'L') {
                var++;
            } else {
                var--;
            }
            if (var == 0) {
                count++;
            }
        }
        return count;
    }
}
