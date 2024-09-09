package leetcode.Greedy;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        if (n == 0) {
            return true;
        }
        switch (l) {
        case 1:
            return flowerbed[0] == 0;
        case 2:
            return flowerbed[0] == 0 && flowerbed[1] == 0;
        default:
            int count = 0;
            for (int i = 0; i < l; ) {
                if (flowerbed[i] == 1) {
                    if (flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
                        count++;
                        i += 2;
                    }
                    if (flowerbed[i + 1] == 1 && flowerbed[i + 2] == 0) {
                        i += 1;
                    } else {
                        i += 2;
                    }
                }
                if (i == 0 && flowerbed[i] == 0) {
                    if (flowerbed[i + 1] == 0) {
                        count++;
                        i += 2;
                    }
                    if (flowerbed[i + 1] == 1) {
                        i += 1;
                    }
                }
                return count >= n;
            }
        }
        return false;
    }

}
