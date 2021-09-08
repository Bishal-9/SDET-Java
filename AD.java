// Write Data into text file

import java.io.BufferedWriter;
import java.io.FileWriter;

public class AD {

    public static void main(String[] args) {

        writeData();
    }

    static void writeData() {

        try {

            FileWriter fileWriterObject = new FileWriter("./text.txt");
            BufferedWriter bufferedWriterObject = new BufferedWriter(fileWriterObject);

            bufferedWriterObject.write(" Lionel Messi - 10");
            bufferedWriterObject.write(" Cristiano Ronaldo - 7");

            System.out.println("Finished!!");

            bufferedWriterObject.close();
        } catch (Exception e) {
            System.out.println("Error occurred!!\n" + e);
        }
    }
}
