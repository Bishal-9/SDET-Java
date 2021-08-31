// Find duplicate element in a array

import java.util.HashSet;
import java.util.Scanner;

public class S {
    
    private static int arrayLength;
    private static int[] array;
    private static HashSet<String> list = new HashSet<String>();

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

            firstWay();
            secondWay();
        } catch (Exception e) {
            System.out.println("\nError occurred!!\n" + e + "\nPlease enter valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void firstWay() {

        boolean flag = false;
        for(int i = 0; i < arrayLength; i++) {

            for(int j = i + 1; j < arrayLength; j++) {

                if(array[i] == array[j]) {
                    
                    System.out.print("\nDuplicate element: " + array[i]);
                    flag = true;
                }
            }
        }

        if(flag == false) {

            System.out.println("\nDuplicate element not found.");
        }
    }

    static void secondWay() {

        boolean flag = false;
        for(int i = 0; i < arrayLength; i++) {

            if(list.add(Integer.toString(array[i])) == false) {

                System.out.println("\nFound duplicate element: " + array[i]);
                flag = true;
            }
        }

        if(flag == false) {

            System.out.println("\nNot found any duplicate.");
        }
    }
}
