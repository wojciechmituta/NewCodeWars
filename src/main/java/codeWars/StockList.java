package codeWars;

public class StockList {
    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        for (int i = 0; i < lstOfArt.length; i++){
            String abc = lstOfArt[i].substring(0, 1);
            String bde = lstOf1stLetter[0];
            String liczby = lstOfArt[i].substring(5,8);
            int suma = 0;

            if (abc.equals(bde)) {
                suma = suma + Integer.parseInt(lstOfArt[i].substring(5,8));
                return "(" + abc + " : " + liczby + ")";
            }
        }

        return lstOfArt[0].substring(5, 8);
// nie skończone
    }
}
