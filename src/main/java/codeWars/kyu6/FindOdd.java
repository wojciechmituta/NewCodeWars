package codeWars.kyu6;

public class FindOdd {
    public static int findIt(int[] a) {
        int odd = a[0];
        for(int i = 1; i<a.length; i++){
            odd = odd ^ a[i];
        }

        return odd;
    }
}
