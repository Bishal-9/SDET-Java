// Check the given number is Palindrome or not

import java.util.Scanner;

public class D {

    private static int number;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {

            System.out.print("Enter a number: ");
            number = scannerObject.nextInt();

            System.out.println("\nEntered number is " + number);
            System.out.println("\nChecking for Palindrome Number...");

            numberPalindrome();

        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nEnter a valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void numberPalindrome() {
        int n = number;
        int rNumber = 0;

        while(n > 0) {
            rNumber = rNumber * 10 + (n % 10);
            n /= 10;
        }

        if(rNumber == number) {
            System.out.println(number + " is Palindrome.");
        } else {
            System.out.println(number + " is not Palindrome.");
        }
    }
}
