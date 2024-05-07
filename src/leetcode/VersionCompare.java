package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class VersionCompare {
    public static int compareVersion(String version1, String version2) {
        String[] characters = version1.split("\\.");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(characters));

        String[] characters2 = version2.split("\\.");
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(characters2));

        if (arrayList.size() > arrayList2.size()) {
            for (int j = arrayList2.size() - 1; j < arrayList.size() - 1 ; j++) {
                arrayList2.add("0");
            }
        }
        if (arrayList2.size() > arrayList.size()) {
            for (int j = arrayList.size() - 1; j < arrayList2.size() - 1 ; j++) {
                arrayList.add("0");
            }
        }

        for (int j = 0; j <= arrayList.size() -1; j++) {
            Integer integer = Integer.valueOf(arrayList.get(j));
            Integer integer2 = Integer.valueOf(arrayList2.get(j));
            if (integer > integer2) {
                return  1;
            } else if (integer2 > integer) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.2", "1.10"));
        System.out.println(compareVersion("1.01", "1.001"));
        System.out.println(compareVersion("1.0", "1.0.0.0"));
        System.out.println(compareVersion("1.0.1", "1"));
    }
}
