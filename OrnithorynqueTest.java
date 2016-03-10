

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class OrnithorynqueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OrnithorynqueTest
{
    /**
     * Default constructor for test class OrnithorynqueTest
     */
    public OrnithorynqueTest()
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
    public void ttest()
    {
        Ornithorynque ornithor1 = new Ornithorynque(2, 40);
        assertEquals(40, ornithor1.getPoids(), 0.1);
    }
}

