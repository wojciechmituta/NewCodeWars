package codeWars;

public class Evaporator {

    public static int evaporator(double content, double evapPerDay, double threshold) {
        int counter = 0;
        double a = 100;

        while (a > threshold) {
            a -= a * (evapPerDay / 100);
            counter++;
        }
        return counter;
    }
}
