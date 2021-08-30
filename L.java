// Generate random Numbers & Strings

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class L {
    
    public static void main(String[] args) {

        // Approach 1 - using Random Class
        Random random = new Random();

        int random_Integer = random.nextInt();
        System.out.println(random_Integer);

        double random_Double = random.nextDouble();
        System.out.println(random_Double);

        // Approach 2 - using Math.random() function
        System.out.println(Math.random());

        // Approach 3 - using Apache commons-lang API
        String random_Number = RandomStringUtils.randomNumeric(10);
        System.out.println(random_Number);

        String random_String = RandomStringUtils.randomAlphabetic(10);
        System.out.println(random_String);
    }
}
