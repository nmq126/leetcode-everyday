/**
 * https://leetcode.com/problems/pascals-triangle/description/
 */
package leetcode.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
    public static void main(String[] args) {
        List<List<Integer>> result = generate(11);
        print(result);
    }
    public static void print(List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.print("\n");
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows ; i++) {
           result.add(recursive(i));
        }
        return result;
    }

    public static List<Integer> recursive(int num) {
        List<Integer> result = new ArrayList<>(num);
        if (1 == num) {
            result.add(1);
            return result;
        } else if (2 == num) {
            result.add(1);
            result.add(1);
            return result;
        } else {
            result.add(1);
            List<Integer> prev = recursive(num - 1);
            for (int i = 2; i < num; i++) {
                int value = prev.get(i - 2) + prev.get(i - 1);
                result.add(value);
            }
            result.add(1);
            return result;
        }
    }
}
