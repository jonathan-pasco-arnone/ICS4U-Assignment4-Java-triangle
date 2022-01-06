/*
* This is the class file
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2022-1-5
*/

// Imports
import java.lang.Math;

/**
* This is the class that contains many functions.
*/
public class Triangle {
    // Variables/Constants

    /**
    * Length A.
    */
    private static double LENGTH_A;

    /**
    * Length B.
    */
    private static double LENGTH_B;

    /**
    * Length C.
    */
    private static double LENGTH_C;

    /**
    * The Area.
    */
    private static double AREA;

    /**
    * Angle A.
    */
    private static double ANGLE_A;

    /**
    * Angle B.
    */
    private static double ANGLE_B;

    /**
    * Angle C.
    */
    private static double ANGLE_C;

    /**
    * The Name.
    */
    private static String NAME;

    /**
    * The Perimeter.
    */
    private static double PERIMETER;

    /**
    * The Semiperimeter.
    */
    private static double SEMIPERIMETER;


    /**
    * The multiplier to change from radian to degrees.
    */
    private static final double DEGREES = 180/Math.PI;

    /**
    * This is the constructor.
    *
    * @param lengthAInput the inputted length A
    * @param lengthAInput the inputted length B
    * @param lengthAInput the inputted length C
    */
    public Triangle(final double lengthAInput, final double lengthBInput,
                 final double lengthCInput) {
        LENGTH_A = lengthAInput;
        LENGTH_B = lengthBInput;
        LENGTH_C = lengthCInput;

        // Math.acos is inverse cosine
        // The "DEGREES" changes the result from a radian to a degree
        ANGLE_A = DEGREES * (Math.acos((Math.pow(LENGTH_B, 2)
            + Math.pow(LENGTH_C, 2)- Math.pow(LENGTH_A, 2))
            / (2 * LENGTH_B * LENGTH_C)));
    
        ANGLE_B = DEGREES * (Math.acos((Math.pow(LENGTH_A, 2)
            + Math.pow(LENGTH_C, 2) - Math.pow(LENGTH_B, 2))
            / (2 * LENGTH_A * LENGTH_C)));
    
        ANGLE_C = DEGREES * (Math.acos((Math.pow(LENGTH_A, 2)
            + Math.pow(LENGTH_B, 2) - Math.pow(LENGTH_C, 2))
            / (2 * LENGTH_A * LENGTH_B)));
    
        /*
        * Name
        */
    
        // If all of the angles are acute
        if (ANGLE_A < 90 && ANGLE_B < 90 && ANGLE_C < 90) {
            NAME = "Acute ";
        // If any of the angles are obtuse
        } else if (ANGLE_A > 90 || ANGLE_B > 90 || ANGLE_C > 90) {
            NAME = "Obtuse ";
        // If there is a right angle
        } else {
            NAME = "Right ";
        }
    
        // If all the angles are equal
        if (ANGLE_A == ANGLE_B && ANGLE_B == ANGLE_C) {
            NAME += "Equilateral ";
        // If only two of the angles are equal
        } else if (ANGLE_A == ANGLE_B || ANGLE_B == ANGLE_C ||
                   ANGLE_A == ANGLE_C) {
            NAME += "Isosceles";
        // If none of the angles are equal
        } else {
            NAME += "Scalene";
        }
    
        PERIMETER = LENGTH_A + LENGTH_B + LENGTH_C;
        SEMIPERIMETER = PERIMETER / 2;

        AREA = Math.sqrt(SEMIPERIMETER * (SEMIPERIMETER - LENGTH_A)
            * (SEMIPERIMETER - LENGTH_B) * (SEMIPERIMETER - LENGTH_C));
    }

    /**
    * Gets the name.
    *
    * @return returns the name
    */
    public String getName() {
        return NAME;
    }

    /**
    * Gets the area.
    *
    * @return returns the area
    */
    public double getArea() {
        return AREA;
    }

    /**
    * Gets Angle A.
    *
    * @return returns Angle A
    */
    public double getAngleA() {
        return ANGLE_A;
    }

    /**
    * Gets Angle B.
    *
    * @return returns Angle B
    */
    public double getAngleB() {
        return ANGLE_B;
    }

    /**
    * Gets Angle C.
    *
    * @return returns Angle C
    */
    public double getAngleC() {
        return ANGLE_C;
    }

    /**
    * Gets the perimete.
    *
    * @return returns the perimeter
    */
    public double getPerimeter() {
        return PERIMETER;
    }
}
