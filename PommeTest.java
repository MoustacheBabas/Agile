

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PommeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PommeTest
{
    /**
     * Default constructor for test class PommeTest
     */
    public PommeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestMange()
    {
        Ornithorynque ornithor1 = new Ornithorynque(2, 40);
        Pomme pomme1 = new Pomme();
        pomme1.setOrnithorynque(ornithor1);
        pomme1.estMangee();
        assertEquals(39, ornithor1.getPoids(), 0.1);
    }
}

