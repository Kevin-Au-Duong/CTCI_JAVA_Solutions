package Chapter1;
import java.util.*;

/**
 * This solution assumes that every character in the provided string
 * is an ascii character (has a unique ascii code)
 */
public class Q1_01_Is_Unique {

    String string;
    boolean[] charBinaryTable = new boolean[128];


    public Q1_01_Is_Unique(String string) {
        this.string = string;
        Arrays.fill(charBinaryTable, Boolean.FALSE);
    }

    public boolean checkUniqueString() {
        for (int i = 0; i < string.length(); i++) {
            int ascii = string.charAt(i);
            if (!charBinaryTable[ascii]) {
                charBinaryTable[ascii] = true;
            } else {
                return false;
            }

        }
        return true;
    }

}
