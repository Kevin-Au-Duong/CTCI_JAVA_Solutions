package Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_05_One_AwayTest {

    @Test
    public void basicTest1() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertTrue(q105OneAway.oneAway("pale", "ple"));

    }

    @Test
    public void basicTest2() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertTrue(q105OneAway.oneAway("pale", "pale"));
    }

    @Test
    public void basicTest3() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertTrue(q105OneAway.oneAway("pales", "pale"));

    }

    @Test
    public void basicTest4() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertTrue(q105OneAway.oneAway("pale", "bale"));
    }

    @Test
    public void basicTest5() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();


        assertFalse(q105OneAway.oneAway("pale", "bake"));
    }

    @Test
    public void basicTest6() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertFalse(q105OneAway.oneAway("pale", "a"));
    }

    @Test
    public void basicTest7() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertFalse(q105OneAway.oneAway("a", "pale"));
    }

    @Test
    public void differentOrderTest() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertFalse(q105OneAway.oneAway("eapl", "pale"));
    }

    @Test
    public void basicTest9() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertFalse(q105OneAway.oneAway("Hello There", "General Kenobi, you are a bold one"));
    }

    @Test
    public void oneTwoSpace() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertTrue(q105OneAway.oneAway(" ", "  "));
    }

    @Test
    public void spaceAndCharTest() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertTrue(q105OneAway.oneAway(" ", "a"));
    }

    @Test
    public void twoStepsAwayTest() {
        Q1_05_One_Away q105OneAway = new Q1_05_One_Away();

        assertFalse(q105OneAway.oneAway("pale", "plae"));
    }

}