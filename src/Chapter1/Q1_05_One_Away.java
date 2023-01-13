package Chapter1;

/**
 * Question 1.5
 * One Away: There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 *
 *      Time Complexity O(n): function loops through the shorter string of length n
 *      Space Complexity O(n): function only stores the strings to iterate through their chars
 */
public class Q1_05_One_Away {
    public boolean oneAway(String string1, String string2) {

        // If strings are of the same length, replace operation
        if (string1.length() == string2.length()) {
            return oneReplaceOperationAway(string1, string2);
        } else { // If strings are of different lengths, insert/remove operation
            return oneInsertOrRemoveOperationAway(string1, string2);
        }
    }

    private boolean oneReplaceOperationAway(String string1, String string2) {
        boolean distanceExists = false;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                if (!distanceExists) {
                    distanceExists = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean oneInsertOrRemoveOperationAway(String string1, String string2) {
        if (Math.abs(string1.length() - string2.length()) > 1) {
            return false;
        }

        String longerString;
        String shorterString;

        if (string1.length() >= string2.length()) {
            longerString = string1;
            shorterString = string2;
        } else {
            longerString = string2;
            shorterString = string1;
        }
        boolean distanceExists = false;

        int j = 0;
        for (int i = 0; i < shorterString.length(); i++) {
            if (shorterString.charAt(i) != longerString.charAt(j)){
                if (!distanceExists) {
                    distanceExists = true;
                    i--;
                } else {
                    return false;
                }
            }
            j++;
        }
        return true;
    }
}
