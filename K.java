// Check given number is Prime or not

import java.util.Scanner;

public class K {
    
    private static int number;

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        try {
            
            System.out.print("Enter a number: ");
            number = scannerObject.nextInt();

            System.out.println("Your entered number is " + number);

            prime();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e + "\nPlease enter a number and try again.");
            main(args);
        }

        scannerObject.close();
    }

    static void prime() {

        int counter = 0;

        if(number > 1) {

            for(int i = 2; i < number / 2; i++) {
                if(number % i == 0) counter++;
            }
    
            if(counter > 0)
                System.out.println(number + " is not a Prime number.");
            else 
                System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is not a Prime number.");
        }
    }
}
