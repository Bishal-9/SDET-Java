// Count words in a string

import java.util.Scanner;

public class AA {
    
    private static String string;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {

            System.out.print("Enter any string value: ");
            string = scannerObject.nextLine();

            System.out.println("\nYour entered string is " + string);

            countWords();
        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nPlease enter valid string and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void countWords() {

        int counter = 0;
        String s = string + " ";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') counter++;
        }

        System.out.println("There were " + counter + " words in the string.");
    }
}
