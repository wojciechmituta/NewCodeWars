package codeWars;

public class NumberOfTrailingZeros {

    public static int zeros(int n) {
        int factor = 5;
        int counter = 0;
        while ((n / factor) > 0){
            counter += n / factor;
            factor *= 5;
        }
        return counter;
    }
}
