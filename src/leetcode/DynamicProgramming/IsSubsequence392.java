package leetcode.DynamicProgramming;

public class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        char[] charS = s.toCharArray();
        if (charS.length == 0)
            return false;
        char[] charT = t.toCharArray();
        int i, j;
        i = j = 0;
        while (j < charT.length && i < charS.length) {
            if (charS[i] == charT[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == charS.length;
    }
}
