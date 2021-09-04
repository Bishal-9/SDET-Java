// Remove junk or special characters from a string

import java.util.Scanner;

public class X {
    
    private static String string;

    public static void main(String[] args) {
        
        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter any string value: ");
            string = scannerObject.next();

            System.out.println("\nYour entered string is " + string);

            removingJunk();
        } catch (Exception e) {
            System.out.println("\nEnter valid input and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void removingJunk() {

        string = string.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Replaced string is " + string);
    }
}
