package codeWars.kyu6;

import java.util.Arrays;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        if(text.length() == 0) {
            return 0;
        }

        char a[] = String.valueOf(text).toLowerCase().toCharArray();
        int prev = a[0];
        int counter = 0;
        boolean numRepeat = false;

        Arrays.sort(a);

        for (int i = 1; i < a.length; i++) {
            if (prev == a[i] && !numRepeat) {
                counter++;
                numRepeat = true;
            } else if (prev != a[i]) {
                prev = a[i];
                numRepeat = false;
            }
        }
        return counter;
    }
}
