package Chapter1;

import java.util.Arrays;

/**
 * Question 2.2
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 *
 * Assumes characters in strings are strictly 128-char Ascii
 * A permutation of a string is another string with the exact same set of characters (no less, no more) as the
 * original string, except in different order. Implications are:
 * 1. Permutation has the same length as original
 * 2. For every character in Ascii, the permutation has the same tally for each of those characters as the original
 *
 * Space complexity: O(1): Uses 2 arrays of 128 int
 * Time Complexity: O(n): Iterates through every char of string with length n
 */
public class Q1_02_Check_Permutation {
    String string;
    String permutation;
    public Q1_02_Check_Permutation(String string, String permutation) {
        this.string = string;
        this.permutation = permutation;
    }

    public boolean checkStringIsPermutation() {
        // Step 1: Check length, which is the quickest check that can be performed
        // This step isn't necessary, but can improve the performance of the function
        if (string.length() != permutation.length()) {
            return false;
        }

        // Step 2: Count every char in original and permutation and compare
        else {
            int[] charCountTableString = new int[128];
            Arrays.fill(charCountTableString, 0);

            int[] charCountTablePermutation = new int[128];
            Arrays.fill(charCountTablePermutation, 0);

            for (int i = 0; i < string.length(); i++) {
                charCountTableString[string.charAt(i)]++;
                charCountTablePermutation[permutation.charAt(i)]++;
            }

            // Arrays.equals() is O(m) with m being the length of the arrays being compared,
            // but length of arrays are constant, so operation below is O(1)
            return Arrays.equals(charCountTableString, charCountTablePermutation);
        }
    }

}
