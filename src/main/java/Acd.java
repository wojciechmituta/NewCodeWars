
public class Acd {

    public static void main(String[] args) {
       int n = 4561;
        int sum = 0;

        while(n > 9){
            n = n/10 + n % 10;
        }

        System.out.println(n);
    }



}