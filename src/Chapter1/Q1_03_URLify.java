package Chapter1;

/**
 * Question 1.3
 * URLify: Write a method to replace all spaces in a string with '%20': You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 *
 *     Performing operation in place means that no additional memory is used.
 *
 *     Time Complexity O(n): the function loops through the original string of size n
 *     Space Complexity O(m): the function uses an array of size m of the modified string
 */
public class Q1_03_URLify {
    String string;
    int lengthOriginal;

    public Q1_03_URLify(String string, int lengthOriginal) {
        this.string = string;
        this.lengthOriginal = lengthOriginal;
    }

    public String URLify() {
        int lengthFinal = string.length();
        int lengthDiff = lengthFinal - lengthOriginal;
        char[] charArray = string.toCharArray();

        for (int i = lengthOriginal - 1; i >= 0; i--) {
            if (charArray[i] != ' ') {
                charArray[i + lengthDiff] = charArray[i];
            } else {
                charArray[i + lengthDiff] = '0';
                lengthDiff--;
                charArray[i + lengthDiff] = '2';
                lengthDiff--;
                charArray[i + lengthDiff] = '%';
                // only decrement lengthDiff twice because "%20".length() - " ".length() = 2.
            }
        }
        return String.valueOf(charArray);
    }
}
