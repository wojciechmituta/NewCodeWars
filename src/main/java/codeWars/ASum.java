package codeWars;

public class ASum {

    public static long findNb(long m) {
        long n = 0;
        long sum = 0;

        while (sum < m) {
            n++;
            sum = sum + (n * n * n);
        }
        if (sum == m) {
            return n;
        }
        return -1;
    }
}
