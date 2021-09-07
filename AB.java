// Reverse each word in a string

import java.util.Scanner;

public class AB {
    
    private static String string;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {

            System.out.print("Enter any string value: ");
            string = scannerObject.nextLine();

            System.out.println("\nYour entered string is " + string);

            string = string + " ";

            firstWay();
            secondWay();
        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nPlease enter valid string and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void firstWay() {

        String s = string;
        int startIndex = 0;
        int endIndex;
        String reverse = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                endIndex = i;
                for(int j = startIndex; j < endIndex; j++) {
                    reverse = string.charAt(j) + reverse;
                }
                startIndex = endIndex;
            }   
        }

        System.out.println("Reversed string is " + reverse);
    }

    static void secondWay() {

        String[] words = string.split("\\s");

        String reverse = "";

        for(String w: words) {

            StringBuilder rw = new StringBuilder(w);
            rw.reverse();

            reverse = reverse + rw.toString() + " ";
        }

        System.out.println("Reversed string is " + reverse);
    }
}