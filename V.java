// Sort arrays using Bubble Sort technique

import java.util.Arrays;
import java.util.Scanner;

public class V {

    private static int arrayLength;
    private static int[] array;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter array length: ");
            arrayLength = scannerObject.nextInt();

            array = new int[arrayLength];

            for(int i = 0; i < arrayLength; i++) {
                System.out.print("Enter array element: ");
                array[i] = scannerObject.nextInt();
            }

            System.out.print("\nYour entered array is " + Arrays.toString(array));

            bubbleSort();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e + "\nPlease enter valid number and try again.");
            main(args);
        }
    }

    static void bubbleSort() {
        
        for(int i = 0; i < arrayLength; i++) {
            for(int j = 0; j < arrayLength; j++) {
                if(array[i] > array[j]) {
                    int value = array[i];
                    array[i] = array[j];
                    array[j] = value;
                }
            }
        }

        System.out.print("\nSorted array is " + Arrays.toString(array));
    }
}