import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GuesstheNumber_Chapter6_30 {
    /*(Guess the Number) Write an application that plays “guess the number” as follows: Your program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
    The application displays the prompt Guess a number between 1 and 1000 . The player inputs a first guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
    low. Try again. to help the player “zero in” on the correct answer. The program should prompt the user for the next guess. When the user enters the correct answer, display Congratulations. You
    guessed the number! , and allow the user to choose whether to play again.*/

    public static void main(String[] args) {
        int UnknownNumber;
        UnknownNumber = (int) (Math.random() * 999 + 1);

        Scanner Input = new Scanner(System.in);
        int guessNumber;

        do {

            System.out.print("Enter a guess (1-999): ");
            guessNumber = Input.nextInt();

            if (guessNumber == UnknownNumber)
                System.out.println("Your guess is correct. Congratulations!");

            else if (guessNumber < UnknownNumber)
                System.out.println("Your guess is smaller than the secret number.");

            else if (guessNumber > UnknownNumber)
                System.out.println("Your guess is greater than the secret number.");
        } while (guessNumber != UnknownNumber);

    }

}


