package Chapter1;

/**
 * Question 1.6
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 *
 */
public class Q1_06_String_Compression {
    String string;
    int originalLength;

    public Q1_06_String_Compression(String string) {
        this.string = string;
        originalLength = string.length();
    }

    public String compressString() {
        StringBuilder compressed = new StringBuilder();
        int currentCompressedLength = 0;
        int maxLength = string.length();
        int sectionLength = 1;
        for (int i = 0; i < maxLength; i++) {
            if (currentCompressedLength + 2 >= maxLength) {
                return string;
            }
            if (i + 1 >= maxLength || string.charAt(i) != string.charAt(i + 1)) {
                compressed.append(string.charAt(i));
                compressed.append(sectionLength);
                sectionLength = 0;
                currentCompressedLength += 2;
            }
            sectionLength++;
        }
        return compressed.toString();
    }
}
