package codeWars.kyu6;

public class Prime {
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for(int a = 2; a < num; a++ ) {
            if (num % a == 0) {
                return false;
            }
        }
        return true;
    }
}
