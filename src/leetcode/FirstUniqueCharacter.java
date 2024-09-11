package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if (map.containsKey(character)) {
                map.put(character, -1);
            } else {
                map.put(character, i);
            }
        }
        OptionalInt min = map.values().stream().mapToInt(Integer::intValue).filter(i -> i!= -1).min();
        if (min.isPresent()) {
            return min.getAsInt();
        }
        return -1;
    }
}
