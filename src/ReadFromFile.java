import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Irina on 13.08.2016.
 */
public class ReadFromFile {
    static String readText(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String readingText = "";
        while (scanner.hasNext()) {
            readingText += scanner.nextLine() + "\n";
        }
        scanner.close();
        return readingText;
    }
}
