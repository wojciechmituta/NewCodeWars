package codeWars;

public class TotalPoints {
    public static int points(String[] games) {
        int result = 0;

        for (String score : games) {
            int point1 = Integer.parseInt(score.substring(0, 1));
            int point2 = Integer.parseInt(score.substring(2, 3));

            if (point1 > point2) {
                result += 3;
            }
            if (point1 == point2) {
               result += 1;
            }
        }
        return result;
    }
}
