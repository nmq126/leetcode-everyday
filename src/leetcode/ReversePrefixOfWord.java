package leetcode;

import java.util.List;
import java.util.stream.Collectors;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
        System.out.println(reversePrefix("xyxzxe", 'z'));
        System.out.println(reversePrefix("abcd", 'z'));
    }
    public static String reversePrefix(String word, char ch) {
        //ez way tự làm
        List<Character> charList = word.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        if (!charList.contains(ch)) {
            return word;
        }
        StringBuilder sb = new StringBuilder();
        int index = charList.indexOf(ch);
        for (int i = index; i >= 0; i--) {
            sb.append(charList.get(i));
        }
        for (int i = index + 1; i < charList.size(); i++) {
            sb.append(charList.get(i));
        }

        return sb.toString();
    }

    public static String reversePrefix2(String word, char ch) {
        //ngắn hơn tí, tận dụng reverse của string builder (cái này ít dung k bit hix)
        int firstOccurence = word.indexOf(ch);
        if (firstOccurence == -1) {
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(0, firstOccurence + 1)).reverse();
        if (firstOccurence < word.length()) {
            sb.append(word.substring(firstOccurence + 1));
        }
        return sb.toString();
    }

    //cach 3 lay tren mang
    public String reversePrefix3(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        int firstOccurence = word.indexOf(ch);
        int k = 0;
        int l = firstOccurence;
        while(k<l){
            swap(sb,k,l);
            k++;
            l--;
        }
        return sb.toString();
    }
    void swap(StringBuilder sb,int i,int j){
        char temp = sb.charAt(i);
        sb. replace(i,i+1, ""+sb.charAt(j));
        sb. replace(j,j+1, ""+temp);
    }
}
