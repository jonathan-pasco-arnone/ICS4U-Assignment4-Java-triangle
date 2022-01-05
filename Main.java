/*
* This program uses a custom class.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2022-1-5
*/

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

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {

        System.out.println("Please input the three sides");
        do {
            try {
                // Scanners to recieve inputs
                final Scanner inputA = new Scanner(System.in);
                final Scanner inputB = new Scanner(System.in);
                final Scanner inputC = new Scanner(System.in);

                System.out.println("Side A: ");
                final int sideA = inputA.nextInt()
            } catch(java.util.InputMismatchException ex) {
            }
        } while(true);

    }
}
