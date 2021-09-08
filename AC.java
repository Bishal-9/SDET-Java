// Read data from text file

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class AC {
    
    private static String string;

    public static void main(String[] args) {

        firstWay();
        secondWay();
        thirdWay();
    }

    static void firstWay() {

        try {
            
            FileReader fileReaderObject = new FileReader("./demo.txt");
            BufferedReader bufferedReaderObject = new BufferedReader(fileReaderObject);

            while((string = bufferedReaderObject.readLine()) != null) {

                System.out.println(string);
            }

            string = "";
            bufferedReaderObject.close();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e);
        }
    }

    static void secondWay() {

        try {
            
            File fileObject = new File("./demo.txt");
            Scanner scannerObject = new Scanner(fileObject);

            while(scannerObject.hasNextLine()) {

                System.out.println(scannerObject.nextLine());
            }

            scannerObject.close();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e);
        }
    }

    static void thirdWay() {

        try {
            
            File fileObject = new File("./demo.txt");
            Scanner scannerObject = new Scanner(fileObject);

            scannerObject.useDelimiter("\\Z");
            System.out.println(scannerObject.next());

            scannerObject.close();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e);
        }
    }
}