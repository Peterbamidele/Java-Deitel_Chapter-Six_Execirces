import java.util.Scanner;

public class Find_theMinimum_Chapter6_23 {
    /*(Find the Minimum) Write a method minimum3 that returns the smallest of three floating-
    point numbers. Use the Math.min method to implement minimum3 . Incorporate the method into an
    application that reads three values from the user, determines the smallest value and displays the result.*/

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the your First Number: ");
        double A= input.nextDouble();

        System.out.println("Enter the your Second Number: ");
        double B = input.nextDouble();

        System.out.println("Enter the your Third Number: ");
        double C = input.nextDouble();

        System.out.print("The smallest value is " + smallest(A, B, C)+"\n" );

    }
    public static double smallest(double A, double B, double C){
        return Math.min(Math.min(A,B),C);
    }

}
