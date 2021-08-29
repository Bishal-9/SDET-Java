// Count number of digits in a number

import java.util.Scanner;

public class F {
    
    private static int number;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter a number: ");
            number = scannerObject.nextInt();

            System.out.println("Entered number is " + number);

            countDigit();
        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nEnter a valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void countDigit() {
        int n = number;
        int counter = 0;

        while(n != 0) {
            counter++;
            n /= 10;
        }

        System.out.println("Number of digit in " + number + " is " + counter);
    }
}
