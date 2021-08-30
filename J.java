// Generate Fibonacci Series

import java.util.Scanner;

public class J {
    
    private static int limit;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter the limit of the series: ");
            limit = scannerObject.nextInt();

            System.out.println("Your entered limit is " + limit);

            fibonacci();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e + "\nPlease enter a valid number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void fibonacci() {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for(int i = 0; i < limit; i++) {
            System.out.print(a + ", ");

            int c = a;
            a = b;
            b = c + b;
        }
    }
}
