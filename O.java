// Print Even & Odd numbers from an array

import java.util.Scanner;

public class O {
    
    private static int[] array;
    private static int arrayLength;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter array length: ");
            arrayLength = scannerObject.nextInt();

            array = new int [arrayLength];

            for(int i = 0; i < arrayLength; i++) {
                System.out.print("Enter array element: ");
                array[i] = scannerObject.nextInt();
            }

            System.out.print("Your entered array is ");
            for(int i = 0; i < arrayLength; i++) {
                System.out.print(array[i] + ", ");
            }

            elementEvenOdd();

        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e + "\nPlease enter valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void elementEvenOdd() {
        
        System.out.print("\nEven numbers is/are ");
        for(int i: array) {
            if(i % 2 == 0) System.out.print(i + ", ");
        }

        System.out.print("\nOdd numbers is/are ");
        for(int i: array) {
            if(i % 2 != 0) System.out.print(i + ", ");
        }
    }
}
