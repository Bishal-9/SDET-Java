// Find sum of elements in array

import java.util.Scanner;

public class N {
    
    private static int arrayLength;
    private static int[] array;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter array length: ");
            arrayLength = scannerObject.nextInt();

            array = new int [arrayLength];

            for (int i = 0; i < arrayLength; i++) {
                System.out.print("Enter an array element: ");
                array[i] = scannerObject.nextInt();
            }

            System.out.print("Your entered array is ");
            for(int i = 0; i < arrayLength; i++) System.out.print(array[i] + ", ");

            sumOfArray();
        } catch (Exception e) {
            System.out.println("\nError occurred!\n" + e + "\nPlease enter valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void sumOfArray() {

        long sum = 0;

        for(int i = 0; i < arrayLength; i++) sum += array[i];

        System.out.println("\nSum of elements in array is " + sum);
    }
}
