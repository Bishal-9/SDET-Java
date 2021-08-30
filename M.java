// Factorial of a number

import java.util.Scanner;

public class M {
    
    private static int number;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter a number: ");
            number = scannerObject.nextInt();

            System.out.println("Your entered number is " + number);

            factorial();
        } catch (Exception e) {
            System.out.println("Error occurred!\n" + e + "\nPlease enter a valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void factorial() {

        long factorial = 1;
        
        for(int i = 2; i <= number; i++) factorial *= i;

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
