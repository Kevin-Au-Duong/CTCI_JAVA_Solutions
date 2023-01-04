package Chapter1;

import java.util.Arrays;

/**
 * Question 1.4
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 *
 *      Assumption: Space char is not considered in the palindrome
 * 
 */

public class Q1_04_Palindrome_Permutation {
    String string;
    public Q1_04_Palindrome_Permutation(String string) {
        // this.string = string.toLowerCase();

        // More efficient method
        this.string = string;
    }

    public boolean checkForPalindromePermutation() {
        /*
        int[] charCountHashTable = new int[Character.getNumericValue('a') - Character.getNumericValue('z') + 1];
        Arrays.fill(charCountHashTable, 0);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                charCountHashTable[string.charAt(i)]++;
            }
        }
        */

        // Every single type of char in a palindrome must have a count of zero or an even number, and only
        // one type of char may have an odd number count
        boolean oddCharCountExisted = false;
        boolean[] charOddCountHashTable = countCharOfStringCaseInsensitive();
        for (boolean j : charOddCountHashTable) {
            if (j) {
                if (!oddCharCountExisted) {
                    oddCharCountExisted = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    // Learned from the provided solution. Is a very neat trick that I should remember for future uses
    private boolean[] countCharOfStringCaseInsensitive() {

        boolean[] charOddCountHashTable = new boolean[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        Arrays.fill(charOddCountHashTable, false);

        int a = Character.getNumericValue('a');
        int A = Character.getNumericValue('A');
        int z = Character.getNumericValue('z');
        int Z = Character.getNumericValue('Z');

        for (int i = 0; i < string.length(); i++) {
            int originalVal = Character.getNumericValue(string.charAt(i));
            int modifiedVal = -1;
            if (a <= originalVal && originalVal <= z) {
                modifiedVal = originalVal - a;
            } else if (A <= originalVal && originalVal <= Z) {
                modifiedVal = originalVal - A;
            }

            if (modifiedVal != -1) {
                charOddCountHashTable[modifiedVal] = !charOddCountHashTable[modifiedVal];
            }
        }
        return charOddCountHashTable;
    }
}
