package leetcode.Greedy;

public class LargestOdd {
    public static void main(String[] args) {
        largestOddNumber("35427");
    }
    public static String largestOddNumber(String num) {
        char[] chars = num.toCharArray();
        int index = -1;
        for (int i = chars.length - 1; i >= 0; i--) {
            int number = chars[i] - '0';
            if (number % 2 == 1) {
                index = i;
                break;
            }
        }
        if (index == -1) return "";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= index; i++) {
            s.append(chars[i]);
        }
        return s.toString();
    }
}
