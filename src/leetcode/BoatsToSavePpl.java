package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BoatsToSavePpl {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int left = 0, right = people.length - 1;
        while (left <= right) {
            //đề bài cho max 2 người 1 thuyền nên chỗ này k cần phải optimze
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }

    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{1,2}, 3));
    }
}
