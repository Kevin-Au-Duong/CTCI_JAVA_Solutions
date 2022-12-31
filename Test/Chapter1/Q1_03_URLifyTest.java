package Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_03_URLifyTest {

    @Test
    public void basicTest() {
        Q1_03_URLify q103UrLify = new Q1_03_URLify("Mr John Smith    ", 13);
        assertEquals("Mr%20John%20Smith", q103UrLify.URLify());
    }

    @Test
    public void allSpaceTest() {
        Q1_03_URLify q103UrLify = new Q1_03_URLify("         ", 3);
        assertEquals("%20%20%20", q103UrLify.URLify());
    }

    @Test
    public void basicTest2() {
        Q1_03_URLify q103UrLify = new Q1_03_URLify("aaaaa a  ", 7);
        assertEquals("aaaaa%20a", q103UrLify.URLify());
    }

    @Test
    public void basicTest3() {
        Q1_03_URLify q103UrLify = new Q1_03_URLify("a aaaaa  ", 7);
        assertEquals("a%20aaaaa", q103UrLify.URLify());
    }

    @Test
    public void spaceAtEnd() {
        Q1_03_URLify q103UrLify = new Q1_03_URLify("Mr John Smith       ", 14);
        assertEquals("Mr%20John%20Smith%20", q103UrLify.URLify());
    }

    @Test
    public void doubleSpace() {
        Q1_03_URLify q103UrLify = new Q1_03_URLify("Mr  John Smith         ", 15);
        assertEquals("Mr%20%20John%20Smith%20", q103UrLify.URLify());
    }
}