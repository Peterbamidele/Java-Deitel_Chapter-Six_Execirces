import java.security.SecureRandom;

public class Rolling_Of_A_Coin {
    /*
    * A program that simulates coin tossing might require only 0 for “heads” and 1 for “tails.*/
    public static void main(String[] args) {
        SecureRandom Toss = new SecureRandom();// ran

        for (int toss = 0; toss <=1 ; toss++) {

            /**/
            int face = 0 + Toss.nextInt(2);// pick the random inter from 0 - 2 numbers

            System.out.printf("%d ", face);

            if (toss % 1 == 0)
                System.out.println();
                    }
    }
}
