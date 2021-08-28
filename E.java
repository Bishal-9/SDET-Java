// Check a string is Palindrome or not

import java.util.Scanner;

public class E {
    
    private static String string;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            string = scannerObject.next();

            System.out.println("\nEntered string is " + string);
            System.out.println("Checking for Palindrome String...");

            stringPalindrome();

        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nEnter a valid string and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void stringPalindrome() {
        String str = string;
        String rString = "";

        for(int i = 0; i < str.length(); i++) {
            rString = rString + str.charAt(str.length() - (i + 1));
        }

        if(rString.equals(string)) {
            System.out.println(string + " is Palindrome.");
        } else {
            System.out.println(string + " is not a Palindrome.");
        }
    }
}