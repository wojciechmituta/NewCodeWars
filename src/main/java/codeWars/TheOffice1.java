package codeWars;

public class TheOffice1 {
    public static Object meeting(char[] x) {

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'O') {
                return i;
            }
        }
        return "None available!";
    }
}
