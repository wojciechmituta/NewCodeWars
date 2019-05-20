package codeWars;

public class Kata {
    public static String getMiddle(String word) {
        char char1 = ' ';
        char char2 = ' ';
        int a = word.length()/2;

        if(word.length() % 2 ==0) {
            char1 = word.charAt(a-1);
            char2 = word.charAt(a);
            return "" + char1 + char2;
        }else {
            return "" + word.charAt(a);
        }
    }
}
