package Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_06_String_CompressionTest {

    @Test
    public void basicTest() {
        Q1_06_String_Compression q106StringCompression = new Q1_06_String_Compression("aabcccccaaa");
        assertEquals("a2b1c5a3", q106StringCompression.compressString());
    }

    @Test
    public void basicTest2() {
        Q1_06_String_Compression q106StringCompression = new Q1_06_String_Compression("a");
        assertEquals("a", q106StringCompression.compressString());
    }


    @Test
    public void basicTest3() {
        Q1_06_String_Compression q106StringCompression = new Q1_06_String_Compression("aa");
        assertEquals("aa", q106StringCompression.compressString());
    }

    @Test
    public void basicTest4() {
        Q1_06_String_Compression q106StringCompression = new Q1_06_String_Compression("abcde");
        assertEquals("abcde", q106StringCompression.compressString());
    }

    @Test
    public void basicTest5() {
        Q1_06_String_Compression q106StringCompression = new Q1_06_String_Compression("aabbccdd");
        assertEquals("aabbccdd", q106StringCompression.compressString());
    }

    @Test
    public void basicTest6() {
        Q1_06_String_Compression q106StringCompression = new Q1_06_String_Compression("abbbccc");
        assertEquals("a1b3c3", q106StringCompression.compressString());
    }

    @Test
    public void basicTest7() {
        Q1_06_String_Compression q106StringCompression = new Q1_06_String_Compression("abbbcc");
        assertEquals("abbbcc", q106StringCompression.compressString());
    }

    @Test
    public void justASpaceTest() {
        Q1_06_String_Compression q106StringCompression = new Q1_06_String_Compression(" ");
        assertEquals(" ", q106StringCompression.compressString());
    }

    @Test
    public void emptyTest() {
        Q1_06_String_Compression q106StringCompression = new Q1_06_String_Compression("");
        assertEquals("", q106StringCompression.compressString());
    }
}