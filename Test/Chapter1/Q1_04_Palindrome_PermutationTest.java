package Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_04_Palindrome_PermutationTest {
    @Test
    public void basicTrueTest() {
        Q1_04_Palindrome_Permutation q104PalindromePermutation = new Q1_04_Palindrome_Permutation("Tact Coa");
        assertTrue(q104PalindromePermutation.checkForPalindromePermutation());
    }

    @Test
    public void basicFalseTest() {
        Q1_04_Palindrome_Permutation q104PalindromePermutation = new Q1_04_Palindrome_Permutation("Hello There");
        assertFalse(q104PalindromePermutation.checkForPalindromePermutation());
    }

}