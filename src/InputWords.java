import java.util.Scanner;

/**
 * Created by Irina on 13.08.2016.
 */
public class InputWords {
    static String enteredWords(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово для поиска: ");
        String inputWords = in.nextLine();
        //System.out.println("Слово для поиска: " + inputWords);
        return inputWords;
    }
}
