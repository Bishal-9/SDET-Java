// Sort array using built-in methods

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class W {
    
    private static int arrayLength;
    private static int[] array;
    private static Integer[] a;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter array length: ");
            arrayLength = scannerObject.nextInt();

            a = new Integer[arrayLength];
            array = new int[arrayLength];

            for(int i = 0; i < arrayLength; i++) {
                System.out.print("Enter array element: ");
                a[i] = array[i] = scannerObject.nextInt();
            }

            System.out.print("\nYour entered array is " + Arrays.toString(array));

            firstWay();
            secondWay();
            thirdWay();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e + "\nPlease enter valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void firstWay() {

        Arrays.parallelSort(array);
        System.out.print("\nSorted array using ParallelSort: " + Arrays.toString(array));
    }

    static void secondWay() {

        Arrays.sort(array);
        System.out.print("\nSorted array using Sort: " + Arrays.toString(array));
    }

    static void thirdWay() {

        Arrays.sort(a, Collections.reverseOrder());
        System.out.print("\nSorted array in descending order using Sort: " + Arrays.toString(a));
    }
}
