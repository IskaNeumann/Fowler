import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by franz on 10.05.2017.
 */
public class TestMovie {

    private static Movie theShack;

    @BeforeClass
    public static void init()
    {
 	    theShack = new Movie("The Shack - A weekend with God.",Movie.NEW_RELEASE);
    }

 	@Test
 	public void testGetPriceCode() {
 		assertEquals(Movie.NEW_RELEASE,theShack.getPriceCode());
 	}

 	@Test
 	public void testSetPriceCode() {
 		theShack.setPriceCode(Movie.REGULAR);
 		assertEquals(Movie.REGULAR,theShack.getPriceCode());
 	}

 	@Test
 	public void testGetTitle() {
 		assertEquals( "The Shack - A weekend with God.", theShack.getTitle());
 	}
}
