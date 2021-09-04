// Count occurrences of a character in a string

import java.util.Scanner;

public class Z {

    private static String string;
    private static char charToCount;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {

            System.out.print("Enter any string value: ");
            string = scannerObject.nextLine();

            System.out.print("Enter character to be searched: ");
            charToCount = scannerObject.next().charAt(0);

            System.out.println("\nYour entered string is " + string);

            countCharacter();
        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nPlease enter valid string and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void countCharacter() {

        if (string.contains(String.valueOf(charToCount))) {

            int initialLength = string.length();
            int removedLength = string.replace(String.valueOf(charToCount), "").length();
            System.out.println("Occurrence of " + charToCount + " is " + (initialLength - removedLength));
        } else {

            System.out.println("Character not found.");
        }
    }
}
