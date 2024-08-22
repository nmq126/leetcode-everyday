package leetcode.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle119 {
    public static void main(String[] args) {
        List<Integer> result = getRow(3);
        print(result);
    }
    public static void print(List<Integer> matrix) {
        for (Integer integer : matrix) {
            System.out.print(integer + " ");
        }
    }

    public static List<Integer> recursive(int num) {
        List<Integer> result = new ArrayList<>(num);
        if (0 == num) {
            result.add(1);
            return result;
        } else if (1 == num) {
            result.add(1);
            result.add(1);
            return result;
        } else {
            result.add(1);
            List<Integer> prev = recursive(num - 1);
            for (int i = 1; i < num; i++) {
                int value = prev.get(i - 1) + prev.get(i);
                result.add(value);
            }
            result.add(1);
            return result;
        }
    }

    //Hệ số nhị thức
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long currentElement = 1;
        row.add((int) currentElement);  // Add the first element which is always 1

        // Calculate the rest of the elements in the row
        for (int i = 1; i <= rowIndex; i++) {
            currentElement = currentElement * (rowIndex - i + 1) / i;
            row.add((int) currentElement);
        }

        return row;
    }

}
