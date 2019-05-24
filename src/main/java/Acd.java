
public class Acd {

    public static void main(String[] args) {
            // write your code in Java SE 8

           int A[] = {9, 7, 3, 9, 3, 9, 9, };

            int unpaired;
            unpaired = A[0]; // initial

            for(int i=1; i< A.length; i++){
                unpaired = unpaired ^ A[i]; // xor
            }

        System.out.println(unpaired);        }



}