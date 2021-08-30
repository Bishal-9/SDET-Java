// Find the largest of 3 numbers

import java.util.Scanner;

public class I {

    private static int number1;
    private static int number2;
    private static int number3;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            number1 = scannerObject.nextInt();
            System.out.print("Enter second number: ");
            number2 = scannerObject.nextInt();
            System.out.print("Enter third number: ");
            number3 = scannerObject.nextInt();

            System.out.println(
                    "Your entered numbers are " + number1 + ", " + number2 + ", " + number3 + " respectively.");

            firstWay();
            secondWay();
        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nEnter a valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void firstWay() {

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("The largest number is " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The largest number is " + number2);
        } else {
            System.out.println("The largest number is " + number3);
        }
    }

    static void secondWay() {

        int largest = number1 >= number2 && number1 >= number3 ? number1 : number2 >= number1 && number2 >= number3 ? number2 : number3;

        System.out.println("The largest number is " + largest);
    }
}
