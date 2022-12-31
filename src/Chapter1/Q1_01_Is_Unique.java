package Chapter1;
import java.util.*;

/**
 * Question 1.1
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 *
 *      This solution assumes that every character in the provided string
 *      is an ascii character (has a unique ascii code). Ascii is 128 characters long
 *
 *      Space complexity: O(1), only uses an array of size 128 for every string
 *      Time complexity: O(n), with n being the length of the string
 *
 *      Solution has the same logic as the one provided in the book.
 */
public class Q1_01_Is_Unique {
    String string;
    boolean[] charBinaryTable = new boolean[128];

    public Q1_01_Is_Unique(String string) {
        this.string = string;
    }

    public boolean checkUniqueString() {
        Arrays.fill(charBinaryTable, Boolean.FALSE);
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
