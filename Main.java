/*
* This program uses a custom class.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2022-1-5
*/

import java.util.Scanner;

/**
* This program uses a custom class.
*/
final class Main {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    static boolean isValid(final double lengthA, final double lengthB,
                           final double lengthC) {

        final boolean returnBool;

        // If any two sides are less than the other
        if (lengthA + lengthB < lengthC || lengthA + lengthC < lengthB ||
            lengthB + lengthC < lengthA) {

            // The triangle is invalid
            System.out.println("\nInvalid inputs\n");
            returnBool = false;

        // If the triangle either isn't set or is set to an impossible length
        } else if(lengthA <= 0 || lengthB <= 0 || lengthC <= 0) {
            // The triangle is invalid
            System.out.println("\nPlease use real lengths\n\n");
            returnBool = false;
        } else {

            // The triangle is valid
            returnBool = true;
        }
        return returnBool;
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {
        // Variables
        boolean triangleValid = false;
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;

        System.out.println("Please input the three sides");
        do {
            try {
                // Scanners to recieve inputs
                final Scanner inputA = new Scanner(System.in);
                final Scanner inputB = new Scanner(System.in);
                final Scanner inputC = new Scanner(System.in);

                // Inputs
                System.out.println("\nSide A: ");
                sideA = inputA.nextDouble();

                System.out.println("\nSide B: ");
                sideB = inputB.nextDouble();

                System.out.println("\nSide C: ");
                sideC = inputC.nextDouble();

            } catch(java.util.InputMismatchException ex) {}
            triangleValid = isValid(sideA, sideB, sideC);
        } while(!triangleValid);

       final Triangle fullTriangle = new Triangle(sideA, sideB, sideC);

       System.out.println("The area is: " + fullTriangle.getArea());
       System.out.println("Angle A is: " + fullTriangle.getAngleA());
       System.out.println("Angle B is: " + fullTriangle.getAngleB());
       System.out.println("Angle C is: " + fullTriangle.getAngleC());
       System.out.println("The name is: " + fullTriangle.getName());
       System.out.println("The perimeter is: " + fullTriangle.getPerimeter());

    }
}
