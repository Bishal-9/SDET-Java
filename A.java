// Swapping 2 numbers

import java.util.Scanner;

public class A {

    private static int num1;
    private static int num2;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            System.out.print("Enter a number...");
            num1 = scannerObject.nextInt();

            System.out.print("Enter another number...");
            num2 = scannerObject.nextInt();

            System.out.println("\nBefore swapping, the values are " + num1 + ", " + num2);
            System.out.println("After swapping...");

            firstWay(num1, num2);
            secondWay(num1, num2);
            thirdWay(num1, num2);
            fourthWay(num1, num2);
            fifthWay(num1, num2);
        } catch(Exception e) {
            System.out.println("\nError Occurred!!\n\n" + e + "\n\nEnter Integer Only and try again.\n");
            main(args);
        }

        scannerObject.close();;
    }

    static void firstWay(int a, int b) {
        int c = a;                          // c = 5
        a = b;                              // a = 10
        b = c;                              // b = 5

        System.out.println(a + ", " + b);
    }

    static void secondWay(int a, int b) {
        a = a + b;                          // a = 5 + 10 = 15
        b = a - b;                          // b = 15 - 10 = 5
        a = a - b;                          // a = 15 - 5 = 10

        System.out.println(a + ", " + b);
    }

    static void thirdWay(int a, int b) {
        a = a * b;                          // a = 5 * 10 = 50
        b = a / b;                          // b = 50 / 10 = 5
        a = a / b;                          // a = 50 / 5 = 10

        System.out.println(a + ", " + b);
    }

    static void fourthWay(int a, int b) {
        a = a ^ b;                          // a = 5 ^ 10 = 15
        b = a ^ b;                          // b = 15 ^ 10 = 5
        a = a ^ b;                          // a = 15 ^ 5 = 10

        System.out.println(a + ", " + b);
    }

    static void fifthWay(int a, int b) {
        b = a + b - ( a = b);               // b = 5 + 10 - ( a = 10)

        System.out.println(a + ", " + b);
    }
}