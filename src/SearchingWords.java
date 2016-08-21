import java.util.Arrays;

/**
 * Created by Irina on 13.08.2016.
 */
public class SearchingWords {
    public static int[] indexesOf(char[] pattern, char[] text) {
        int[] pfl = pfl(pattern);
        int[] indexes = new int[text.length];
        int size = 0;
        int k = 0;
        for(int i = 0; i < text.length; ++i) {
            while(pattern[k] != text[i] && k > 0) {
                k = pfl[k - 1];
            }
            if(pattern[k] == text[i]) {
                k = k + 1;
                if(k == pattern.length) {
                    indexes[size] = i + 1 - k;
                    size += 1;
                    k = pfl[k - 1];
                }
            } else {
                k = 0;
            }
        }
            if (size > 0) {
                System.out.println("Искомая фраза найдена. Количество вхождений: " + size);
            } else {
                System.out.println("Искомая фраза не найдена!");
            }
        return Arrays.copyOfRange(indexes, 0, size);
}

    public static int[] pfl(char[] text) {
        int[] pfl = new int[text.length];
        pfl[0] = 0;
        for(int i = 1; i < text.length; ++i) {
            int k = pfl[i - 1];
            while(text[k] != text[i] && k > 0) {
                k = pfl[k - 1];
            }
            if(text[k] == text[i]) {
                pfl[i] = k + 1;
            } else {
                pfl[i] = 0;
            }
        }
        return pfl;
    }
}
