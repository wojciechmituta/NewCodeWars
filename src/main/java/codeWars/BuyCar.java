package codeWars;

public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingPerMonth, double percentLossByMonth) {
        if (startPriceOld >= startPriceNew) {
            return new int[]{0, startPriceOld - startPriceNew};
        }
        double moneyNeeded = startPriceNew - startPriceOld;
        double valueNewCar = startPriceNew;
        double valueOldCar = startPriceOld;

        int i = 1;
        while (moneyNeeded >= 0) {

            moneyNeeded = moneyNeeded - savingPerMonth - (valueNewCar * percentLossByMonth /100) + (valueOldCar * percentLossByMonth/100);

            valueNewCar -= (valueNewCar * percentLossByMonth / 100);
            valueOldCar -= (valueOldCar * percentLossByMonth / 100);

            i++;

            if (i % 2 == 0) {
                percentLossByMonth += 0.5;
            }
        }
        return new int[] {i-1, -(int) Math.round(moneyNeeded)};
    }
}
