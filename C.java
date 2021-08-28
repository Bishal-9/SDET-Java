//  Reverse a String

import java.util.Scanner;

public class C {

    private static String string;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {

            System.out.println("Enter a String: ");
            string = scannerObject.next();
            System.out.println("\nEntered string is " + string);
            System.out.println("\nAfter reversing...");

            firstWay();
            secondWay();
            thirdWay();
            fourthWay();
        
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e + "\nEnter a valid string and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void firstWay() {
        String str = string;
        String rString = "";

        for(int i = 0; i < str.length(); i++) {
            rString = rString + str.charAt(str.length() - (i + 1));
        }
        System.out.println("Reversed string is " + rString);
    }

    static void secondWay() {
        StringBuffer rString = new StringBuffer(string);
        System.out.println("Reversed string is " + rString.reverse());
    }

    static void thirdWay() {
        StringBuilder rString = new StringBuilder(string);
        System.out.println("Reversed string is " + rString.reverse());
    }

    static void fourthWay() {
        char[] s =  string.toCharArray();
        String rString = "";

        for(int i = s.length - 1; i >= 0; i--) {
            rString = rString + s[i];
        }

        System.out.println("Reversed string is " + rString);
    }
}
