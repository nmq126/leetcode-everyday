package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "XCIX";
        System.out.println("Approach 1: " + romanToInt(s));
        System.out.println("Approach 2: " + romanToIntApp2(s));

    }
    private static Map<Character,Integer> map = new HashMap<Character, Integer>();
    static {
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }

    public static int romanToInt(String s) {
        int sum=0;
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        for(int i=0;i<s.length();i++){
            sum = sum + (map.get(s.charAt(i)));
        }
        return sum;
    }

    public static int romanToIntApp2(String s) {
        int sum=0;
        //giải thích: chạy từ ký tự đầu đến áp chót, so sánh 2 cái cạnh nhau: nếu cái sau lớn hơn cái trước thì tổng từ đi cái trước,
        // cộng với cái sau vì bình thường số lớn nhất phải đứng trước, nếu có cái lớn hơn đứng sau tức là mấy case đặc biệt
        // kiểu IV, IX bla bla. Cuối cùng cộng với ký tự ở chót.
        //chạy từ dưới lên cũng được
        //chậm hơn cả cái trên
        List<Character> charList = s.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        for (int i = 0; i < charList.size() - 1; i++) {
            Character c = charList.get(i);
            Character cNext = charList.get(i+1);

            if (map.get(c) < map.get(cNext)) {
                sum -= map.get(c);
            } else {
                sum += map.get(c);
            }
        }
        sum += map.get(charList.get(charList.size() - 1));
        return sum;
    }
}
