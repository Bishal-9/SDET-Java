// Check the equality of 2 arrays

import java.util.Arrays;
import java.util.Scanner;

public class P {

    private static int arrayLength;
    private static int[] array1;
    private static int[] array2;
    
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter array length: ");
            arrayLength = scannerObject.nextInt();

            array1 = new int [arrayLength];
            array2 = new int [arrayLength];

            arrayInput(scannerObject, array1, "Enter first array element: ");
            arrayInput(scannerObject, array2, "Enter second array element: ");

            System.out.print("Your entered first array is ");
            arrayDisplay(array1);

            System.out.print("\nYour entered second array is ");
            arrayDisplay(array2);

            firstWay();
            secondWay();

        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nPlease enter valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void arrayInput(Scanner s, int[] a, String statement) {

        for(int i = 0; i < arrayLength; i++) {
            System.out.print(statement);
            a[i] = s.nextInt();
        }
    }

    static void arrayDisplay(int[] a) {

        for(int i = 0; i < arrayLength; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    // This checks array element by index placing
    static void firstWay() {

        if(Arrays.equals(array1, array2)) System.out.println("\nArrays are similar.");
        else System.out.println("\nArrays are not similar.");
    }

    // This checks array elements exists or not
    static void secondWay() {

        boolean status = true;

        for(int i = 0; i < arrayLength; i++) {

            int counter = 0;
            for(int j = 0; j < arrayLength; j++) {

                if(array1[i] == array2[j]) counter++;
            }

            if(counter == 0) {
                status = false;
                break;
            }

            counter = 0;
        }

        if(status) {
            System.out.println("Arrays are similar.");
        } else {
            System.out.println("Arrays are not similar.");
        }
    }
}
