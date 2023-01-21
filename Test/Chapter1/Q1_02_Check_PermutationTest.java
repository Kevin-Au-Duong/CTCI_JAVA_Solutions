package Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_02_Check_PermutationTest {

    @Test
    public void isIdentical() {
        Q1_02_Check_Permutation q102CheckPermutation = new Q1_02_Check_Permutation("String", "String");
        assertTrue(q102CheckPermutation.checkStringIsPermutation());
    }
    @Test
    public void isPermutation() {
        Q1_02_Check_Permutation q102CheckPermutation = new Q1_02_Check_Permutation("String", "Strnig");
        assertTrue(q102CheckPermutation.checkStringIsPermutation());
    }

    @Test
    public void notPermutation() {
        Q1_02_Check_Permutation q102CheckPermutation = new Q1_02_Check_Permutation("String", "Strinn");
        assertFalse(q102CheckPermutation.checkStringIsPermutation());
    }

    @Test
    public void empty() {
        Q1_02_Check_Permutation q102CheckPermutation = new Q1_02_Check_Permutation("", "");
        assertTrue(q102CheckPermutation.checkStringIsPermutation());
    }

    @Test
    public void sentence() {
        Q1_02_Check_Permutation q102CheckPermutation =
                new Q1_02_Check_Permutation("hello there", " therehello");
        assertTrue(q102CheckPermutation.checkStringIsPermutation());
    }

    @Test
    public void differentCapitalization() {
        Q1_02_Check_Permutation q102CheckPermutation = new Q1_02_Check_Permutation("String", "string");
        assertFalse(q102CheckPermutation.checkStringIsPermutation());
    }

}