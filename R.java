// Find maximum and minimum element in a array

import java.util.Scanner;

public class R {
    
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

            elementMaxMin();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e + "\nPlease enter valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void elementMaxMin() {

        int max = 0;
        int min = array[0];

        for(int i = 0; i < arrayLength; i++) {

            if(max < array[i]) max = array[i];

            if(min > array[i]) min = array[i];
        }

        System.out.println("\nThe Maximum value is " + max);
        System.out.println("The Minimum value is " + min);
    }
}
