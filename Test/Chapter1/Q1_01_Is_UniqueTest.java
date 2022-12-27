package Chapter1;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Q1_01_Is_UniqueTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void basicTestQ1_01_1() throws Exception {
        Q1_01_Is_Unique q101IsUnique = new Q1_01_Is_Unique("String");
        assertTrue(q101IsUnique.checkUniqueString());
    }

    @Test
    public void basicTestQ1_01_2() throws Exception {
        Q1_01_Is_Unique q101IsUnique = new Q1_01_Is_Unique("No Nut November");
        assertFalse(q101IsUnique.checkUniqueString());
    }

    @Test
    public void uppercaseTestQ1_01_1() throws Exception {
        Q1_01_Is_Unique q101IsUnique = new Q1_01_Is_Unique("HeLlo");
        assertTrue(q101IsUnique.checkUniqueString());
    }

    @Test
    public void numberTestQ1_01_1() throws Exception {
        Q1_01_Is_Unique q101IsUnique = new Q1_01_Is_Unique("a1");
        assertTrue(q101IsUnique.checkUniqueString());
    }

    @Test
    public void emptyTestQ1_01_1() throws Exception {
        Q1_01_Is_Unique q101IsUnique = new Q1_01_Is_Unique("");
        assertTrue(q101IsUnique.checkUniqueString());
    }

    @Test
    public void doubleSpaceTestQ1_01_1() throws Exception {
        Q1_01_Is_Unique q101IsUnique = new Q1_01_Is_Unique("  ");
        assertFalse(q101IsUnique.checkUniqueString());
    }

    @Test
    public void oneCharTestQ1_01_1() throws Exception {
        Q1_01_Is_Unique q101IsUnique = new Q1_01_Is_Unique(" ");
        assertTrue(q101IsUnique.checkUniqueString());
    }

}