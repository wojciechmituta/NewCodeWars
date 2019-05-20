package codeWars;

public class ArrayReverser {
    public static String[] reverse(String[] a) {
        a.toString();
        return a;
    }

    public static void main(String[] args) {

        String[] abc = {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"};
String result = "";
        for(int a = 0; a < abc.length; a++){
            result = new StringBuilder().append(a).reverse().toString();
        }

        System.out.println();
    }
}

