package codeWars.kyu6;

public class PersistentBugger {
    public static int persistence(long n) {
        int result = 0;
        while (n > 9) {
            long a = 1;
            for (char digit : String.valueOf(n).toCharArray()) {
                a *= Long.parseLong(String.valueOf(digit));
            }
            n = a;
            result++;
        }
        return result;
    }
}
