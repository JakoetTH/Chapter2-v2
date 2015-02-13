import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testFlightNull {
    @Before
    public void beforeFlight()
    {
        System.out.println("in before testFlightNull");
    }
    @Test
    public void testPrice()
    {
        Ticket test = new Ticket(123.2,"123","John");
        Assert.assertNotNull("Flight is null",test.getFlight());
    }
    @After
    public void afterFlight()
    {
        System.out.println("in after testFlightNull");
    }
}
