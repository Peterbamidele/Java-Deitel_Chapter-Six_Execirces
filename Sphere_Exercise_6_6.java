import java.util.Scanner;

public class Sphere_Exercise_6_6 {
    /*Calculates the volume of a sphere, using the radius entered by the user*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius Of Sphere :");
        double radius = input.nextDouble();

        System.out.printf("Volume is %f%n", sphereVolume(radius));

    }

    private static double sphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}

