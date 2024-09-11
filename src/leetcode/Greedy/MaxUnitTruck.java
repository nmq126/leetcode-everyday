package leetcode.Greedy;

//1710
public class MaxUnitTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] arr = new int[1001];
        for (int[] box : boxTypes) {
            int unit = box[1];
            int quantity = box[0];
            arr[unit] += quantity;
        }
        int sizeLeft = truckSize;
        int max = 0;
        for (int i = 1000; i >= 1; i--) {
            if (arr[i] < sizeLeft) {
                max += i * arr[i];
                sizeLeft -= arr[i];
            } else {
                max += i * sizeLeft;
                break;
            }
        }
        return max;
    }
}
