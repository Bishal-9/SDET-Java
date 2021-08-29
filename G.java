// Count number of EVEN & ODD digits in a number

import java.util.Scanner;

public class G {
    
    private static int number;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter a number: ");
            number = scannerObject.nextInt();

            System.out.println("Entered number is " + number);

            countDigitEvenOdd();
        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nEnter a valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void countDigitEvenOdd() {
        int n = number;
        int evenCounter = 0;
        int oddCounter = 0;

        while(n != 0) {
            
            if((n % 10) % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            
            n /= 10;
        }

        System.out.println("Number of EVEN and ODD digit in " + number + " is " + evenCounter + ", " + oddCounter + " respectively.");
    }
}
