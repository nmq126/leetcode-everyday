package leetcode.Greedy;
//1974
public class MinTimeToType {
    public static void main(String[] args) {
        System.out.println(minTimeToType("bza"));
    }
    public static int minTimeToType(String word) {
        int result = 0;
        char[] chars = word.toCharArray();
        if (chars[0] == 'a') {
            result += 1;
        } else {
            result += Math.min(chars[0] - 'a', 26 + 'a' - chars[0]) + 1;
        }
        for (int i = 1; i < chars.length; i++) {
            int distance = Math.min(Math.abs(chars[i] - chars[i -1]), 26 - Math.abs(chars[i-1] - chars[i]));
            result += distance + 1;
        }
        return result;
    }
}
