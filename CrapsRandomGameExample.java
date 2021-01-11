import java.security.SecureRandom;

public class CrapsRandomGameExample {
    // create secure random number generator for use in method rollDice
    private static final SecureRandom diceNUmber = new SecureRandom();

    // enum type with constants that represent the game status
    public enum Status {Continue, Won , Lost};

    //constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
         int myPoint = 0;// point if no win or loss on first roll
         Status gameStatus;// can Contain
         
         int sumOfDice = rollDice();

         switch (sumOfDice)//// determine game status and point based on first roll
         {
             case SEVEN://you win with 7 on first roll
             case YO_LEVEN:// you win with 11 on first roll
                 gameStatus = Status.Won;
                 break;
             case SNAKE_EYES:// you lose with 2 on first roll
             case TREY:// you lose with 3 on first roll
             case BOX_CARS:// you lose with 12 on first roll
                 gameStatus = Status.Lost;
                 break;
             default:// did not win or loose, so remember point
                 gameStatus = Status.Continue;// game is not over
                 myPoint = sumOfDice;
                 System.out.printf("Point is %d%n", myPoint);
                 break;
         }

         while (gameStatus == Status.Continue) // while game is not complete// not won or lost
         {
             sumOfDice = rollDice(); // roll dice again

             // determine game status
             if (sumOfDice == myPoint)// win by making point
                 gameStatus = Status.Won;
             else
                 if (sumOfDice == SEVEN)
                     gameStatus = Status.Lost;
         }

        // display game won or lost status
         if (gameStatus == Status.Won)
             System.out.println("You Wins");
         else
             System.out.println("You Losses");

    }

    private static int rollDice() {

        int die1 = 1 + diceNUmber.nextInt(6);// first die roll
        int die2 = 1 + diceNUmber.nextInt(6);// second die roll

        int sum = die1 + die2; //sum up of die values

        System.out.printf("Player rolled %d + %d = %d%n",die1,die2,sum);// displayed result of this roll

        return sum;

    }


}


