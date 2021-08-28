// Reverse a number

import java.util.Scanner;

public class B {

    private static int number;

    public static void main(String[] args) {
        
        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter a number ");
            number = scannerObject.nextInt();

            System.out.println("Entered Number is " + number);

            firstWay();
            secondWay();
            thirdWay();
            fourthWay();
        } catch (Exception e) {
            System.out.println("\nError Occurred!!\n\n" + e + "\n\nEnter Integer Only and try again.\n");
            main(args);
        }

        scannerObject.close();
    }

    static void firstWay() {

        int n = number;
        int rNumber = 0;

        while(n > 0) {
            rNumber = rNumber * 10 + (n % 10);
            n /= 10;
        }

        System.out.println("Reversed Number is " + rNumber);
    }

    static void secondWay() {
        String n = Integer.toString(number);
        String rNumber = "";

        for(int i = 0; i < n.length(); i++) {
            rNumber = rNumber + String.valueOf(n.charAt(n.length() - (i + 1)));
        }

        System.out.println("Reversed Number is " + rNumber);
    }

    static void thirdWay() {
        StringBuffer rNumber = new StringBuffer(String.valueOf(number));
        System.out.println("Reversed Number is " + rNumber.reverse());
    }

    static void fourthWay() {
        StringBuilder rNumber = new StringBuilder();
        rNumber.append(String.valueOf(number));
        System.out.println("Reversed Number is " + rNumber.reverse());
    }
}