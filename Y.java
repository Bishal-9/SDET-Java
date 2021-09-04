// Remove white space from string

import java.util.Scanner;

public class Y {
    
    private static String string;

    public static void main(String[] args) {
        
        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter any string value: ");
            string = scannerObject.nextLine();

            System.out.println("\nYour entered string is " + string);

            removingSpace();
        } catch (Exception e) {
            System.out.println("\nEnter valid input and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void removingSpace() {

        string = string.replaceAll("\\s", "");
        System.out.println("Replaced string is " + string);
    }
}
