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
 	    theShack = new Movie("The Shack - A weekend with God.",17);
    }

 	@Test
 	public void testGetPriceCode() {
 		assertEquals(17,theShack.getPriceCode());
 	}

 	@Test
 	public void testSetPriceCode() {
 		theShack.setPriceCode(15);
 		assertEquals(15,theShack.getPriceCode());
 	}

 	@Test
 	public void testGetTitle() {
 		assertEquals( "The Shack - A weekend with God.", theShack.getTitle());
 	}
}
