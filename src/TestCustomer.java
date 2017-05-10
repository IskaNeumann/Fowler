import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by franz on 10.05.2017.
 */
public class TestCustomer {

    private static Customer testCustomer;

    @BeforeClass
    public static void init()
    {
        testCustomer = new Customer("Franzi");

    }

    @Test
 	public void testGetName() {
 		assertEquals("Franzi", testCustomer.getName());
 	}

 	@Test
 	public void testStatement() {
 		assertNotNull(testCustomer.statement());
 }
}
