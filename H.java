// Count sum of digits in a number

import java.util.Scanner;

public class H {
    
    private static int number;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter a number: ");
            number = scannerObject.nextInt();

            System.out.println("Entered number is " + number);

            sumOfDigits();
        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nEnter a valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void sumOfDigits() {
        int n = number;
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits is " + sum);
    }
}
