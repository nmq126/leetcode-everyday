package leetcode;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println("a " + binToNumber("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"));
        System.out.println("a " + binToNumber("110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
        System.out.println(addBinary("1010", "1011"));

    }
    public static String addBinary(String a, String b) {
        long total = binToNumber(a) + binToNumber(b);
        return numberToBin(total);
    }

    public static long binToNumber(String a) {
        long result = 0;
        char[] chars = a.toCharArray();
        for(int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                result += Math.pow(2,chars.length - 1 - i);
            }
        }
        return result;
    }
    public static String numberToBin(long a) {
        StringBuilder result = new StringBuilder();
        while (a != 0) {
            if (a % 2 == 1) {
                result.append("1");
            } else {
                result.append("0");
            }
            a /= 2;
        }
        return result.reverse().toString();
    }
}
