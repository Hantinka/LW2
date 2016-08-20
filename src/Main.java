/**
 * Created by Irina on 13.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        String readingText = ReadFromFile.readText("input.txt");
        System.out.print(readingText);
        String findText = InputWords.enteredWords();
        //System.out.print(findText);
        char [] charsReadindText;
        charsReadindText = readingText.toCharArray();
        char [] charsFindText;
        charsFindText = findText.toCharArray();
        SearchingWords.KMP(charsReadindText,charsFindText);
    }
}
