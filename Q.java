// Finding missing array element

import java.util.Scanner;

public class Q {
    
    private static int arrayLength;
    private static int[] array;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.println("Enter array length: ");
            arrayLength = scannerObject.nextInt();

            array = new int [arrayLength];

            for(int i = 0; i < arrayLength; i++) {

                System.out.println("Enter array element: ");
                array[i] = scannerObject.nextInt();
            }

            System.out.print("Your entered array is ");
            for(int i = 0; i < arrayLength; i++) {

                System.out.print(array[i] + ", ");
            }

            missingElement();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e + "\nPlease enter valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void missingElement() {

        int firstElement = array[0];
        int lastElement = array[arrayLength - 1];
        
        if(firstElement > lastElement) {
            firstElement = firstElement + lastElement;
            lastElement = firstElement - lastElement;
            firstElement = firstElement - lastElement;
        }

        int sumOfRange = 0;
        for(int i = firstElement; i <= lastElement; i++) sumOfRange += i;

        int sumOfArray = 0;
        for(int i = 0; i < arrayLength; i++) sumOfArray += array[i];

        System.out.println("\nThe missing array element is " + (sumOfRange - sumOfArray));
    }
}
