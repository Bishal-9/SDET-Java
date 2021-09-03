// Linear Search or Sequential Search

import java.util.Scanner;

public class T {
    
    private static int arrayLength;
    private static int[] array;
    private static int numberToSearch;
    
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

            System.out.println("Enter the number to be searched: ");
            numberToSearch = scannerObject.nextInt();

            System.out.print("Your entered array is ");
            for(int i = 0; i < arrayLength; i++) {

                System.out.print(array[i] + ", ");
            }

            linearSearch();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e + "\nPlease enter valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void linearSearch() {

        int found = 0;
        for(int i = 0; i < arrayLength; i++) {

            if(array[i] == numberToSearch) found++;
        }

        if(found != 0) System.out.println("\nFound " + found + " times in the array.");
        else System.out.println("\nNot found!!");
    }
}
