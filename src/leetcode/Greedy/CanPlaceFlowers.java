package leetcode.Greedy;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        canPlaceFlowers(new int[]{1,0,0,0,0,1}, 2);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int l = flowerbed.length;
        if (n == 0) {
            return true;
        }
        switch (l) {
        case 1:
            return flowerbed[0] == 0;
        case 2:
            return flowerbed[0] == 0 && flowerbed[1] == 0 && n < l;
        default:
            for (int i = 0; i < l - 1; ) {
                if (i == 0 && flowerbed[i] == 0) {
                    if (flowerbed[i + 1] == 0) {
                        count++;
                        flowerbed[i] = 1;
                        continue;
                    }
                    else if (flowerbed[i + 1] == 1) {
                        i += 1;
                        continue;
                    }
                }
                if (flowerbed[i] == 1) {
                    if (flowerbed[i + 1] == 1) {
                        i++;
                    } else if (i + 2 == l) {
                        break;
                    } else if (flowerbed[i + 2] == 0) {
                        if (i + 3 < l) {
                            if (flowerbed[i+3] == 0) {
                                flowerbed[i+2] = 1;
                                count++;
                                i += 2;
                            } else {
                                i+=3;
                            }
                        } else {
                            count++;
                            break;
                        }
                    }
                    else if (flowerbed[i + 1] == 0 && flowerbed[i + 2] == 1) {
                        i += 2;
                    }
                }
            }
        }
        return count >= n;
    }
}
