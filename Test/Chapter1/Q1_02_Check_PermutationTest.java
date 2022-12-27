package Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_02_Check_PermutationTest {

    @Test
    public void isIdentical() throws Exception {
        Q1_02_Check_Permutation q102CheckPermutation = new Q1_02_Check_Permutation("String", "String");
        assertTrue(q102CheckPermutation.checkStringIsPermutation());
    }
    @Test
    public void isPermutation() throws Exception {
        Q1_02_Check_Permutation q102CheckPermutation = new Q1_02_Check_Permutation("String", "Strnig");
        assertTrue(q102CheckPermutation.checkStringIsPermutation());
    }

    @Test
    public void notPermutation() throws Exception {
        Q1_02_Check_Permutation q102CheckPermutation = new Q1_02_Check_Permutation("String", "Strinn");
        assertFalse(q102CheckPermutation.checkStringIsPermutation());
    }

    @Test
    public void empty() throws Exception {
        Q1_02_Check_Permutation q102CheckPermutation = new Q1_02_Check_Permutation("", "");
        assertTrue(q102CheckPermutation.checkStringIsPermutation());
    }

    @Test
    public void sentence() throws Exception {
        Q1_02_Check_Permutation q102CheckPermutation =
                new Q1_02_Check_Permutation("hello there", " therehello");
        assertTrue(q102CheckPermutation.checkStringIsPermutation());
    }

    @Test
    public void differentCapitalization() throws Exception {
        Q1_02_Check_Permutation q102CheckPermutation = new Q1_02_Check_Permutation("String", "string");
        assertFalse(q102CheckPermutation.checkStringIsPermutation());
    }

}