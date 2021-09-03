// Binary Search

import java.util.Arrays;
import java.util.Scanner;

public class U {

    private static int arrayLength;
    private static int[] array;
    private static int numberToSearch;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {

            System.out.print("Enter array length: ");
            arrayLength = scannerObject.nextInt();

            array = new int[arrayLength];

            for (int i = 0; i < arrayLength; i++) {
                System.out.print("Enter array element: ");
                array[i] = scannerObject.nextInt();
            }

            Arrays.sort(array);

            System.out.println("Enter the number to be searched: ");
            numberToSearch = scannerObject.nextInt();

            System.out.print("Your entered array is ");
            for (int i = 0; i < arrayLength; i++) {
                System.out.print(array[i] + ", ");
            }

            firstWay();
            secondWay();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e + "\nPlease enter valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void firstWay() {

        int lowerIndex = 0;
        int higherIndex = arrayLength;
        int middleIndex = arrayLength / 2;
        boolean found = false;

        while (lowerIndex <= higherIndex) {
            
            if (array[middleIndex] == numberToSearch) {
                found = true;
                System.out.println("\nYour entered element " + numberToSearch + " is found within the array.");
                break;
            } else if(numberToSearch > array[middleIndex]) {
                lowerIndex = middleIndex + 1;
                middleIndex = (lowerIndex + higherIndex) / 2;
            } else if(numberToSearch < array[middleIndex]) {
                higherIndex = middleIndex - 1;
                middleIndex = (lowerIndex + higherIndex) / 2;
            }
        }

        if(found == false) System.out.println("\nElement not found in the array.");
    }

    static void secondWay() {

        int searchedIndex = Arrays.binarySearch(array, numberToSearch) + 1;

        if(searchedIndex > 0) {
            System.out.println("Element found in " + searchedIndex + " position in the array.");
        } else {
            System.out.println("Element not found.");
        }
    }
}
