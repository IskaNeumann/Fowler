import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by franz on 10.05.2017.
 */
public class TestRental {

    private static Movie theShack;
    private static Rental rental;

    @BeforeClass
    public static void init()
    {
        theShack = new Movie("The Shack - A weekend with God.",17);
        rental = new Rental(theShack, 5);
    }

    @Test
    public void testGetDaysRented() {
        assertEquals(5, rental.getDaysRented());
    }

    @Test
    public void testGetMovie()
    {
        assertEquals(theShack, rental.getMovie());

    }
}
