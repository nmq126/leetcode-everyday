package leetcode.Greedy;

//1736
public class LatestTime {
    public static void main(String[] args) {
        maximumTime("?0:15");
    }
    public static String maximumTime(String time) {
        char[] chars = time.toCharArray();
        if (chars[0] == '?') {
            if (chars[1] == '?') {
                chars[0] = '2';
                chars[1] = '3';
            } else {
                int num = chars[1] - '0';
                if (num <= 3) {
                    chars[0] = '2';
                } else {
                    chars[0] = '1';
                }
            }
        }
        if (chars[1] == '?') {
            if (chars[0] == '1' || chars[0] == '0') {
                chars[1] = '9';
            } else if (chars[0] == '2') {
                chars[1] = '3';
            }
        }
        if (chars[4] == '?') {
            chars[4] = '9';
        }
        if (chars[3] == '?') {
            chars[3] = '5';
        }
        return new String(chars);
    }
}
