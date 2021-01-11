import java.security.SecureRandom;

public class Rolling_A_Six_Sided_Die_20Times_Example {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();// RandomNumber object that will Produce random number

        // a loop to loop 20times
        for (int counter = 1; counter <=20 ; counter++) {

            int face = 1 + randomNumbers.nextInt(6);// pick random integer from 1-6

            System.out.printf("%d ", face);// display generated value

            if (counter % 5 == 0)
                System.out.println();
        }

        System.out.println();

        /*Rolling a Six-Sided Die 6,000,000 Times
        To show that the numbers produced by nextInt occur with approximately equal likeli-
        hood, let’s simulate 6,000,000 rolls of a die with the application in Fig. 6.7. Each integer
        from 1 to 6 should appear approximately 1,000,000 times.*/

            SecureRandom randomNumber = new SecureRandom();
            int frequency1 = 1;
            int frequency2 = 2;
            int frequency3 = 3;
            int frequency4 = 4;
            int frequency5 = 5;
            int frequency6 = 6;

        for (int roll = 0; roll <= 6000000 ; roll++) //tally count for 6,000000 roll of die
        {
            int face =1 + randomNumber.nextInt(6);//number time die will role

            switch (face)
            {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;

            }
        }
        System.out.println("Face\tFrequency");// output headers
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);

        }
    }
