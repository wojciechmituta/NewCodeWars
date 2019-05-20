package codeWars;

public class PlayPass {
    public static String playPass(String s, int n) {
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {

            if (Character.isLetter(array[i])) {
                if (array[i] + n > 90) {
                    array[i] = (char) (array[i] + (n - 26));
                } else {
                    array[i] = (char) (array[i] + n);
                }
            }

            if (Character.isDigit(array[i])) {
                int a = array[i] - '0';
                a = 9 - a;
                array[i] = (char) (a + '0');
            }

            if (Character.isLetter(array[i]) && (i % 2 == 0)) {
                array[i] = Character.toUpperCase(array[i]);
            }

            if (Character.isLetter(array[i]) && (i % 2 != 0)) {
                array[i] = Character.toLowerCase(array[i]);
            }
        }

        return new StringBuilder(String.copyValueOf(array)).reverse().toString();
    }
}
