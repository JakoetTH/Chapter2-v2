import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testPassengerNull {
    @Before
    public void beforeTicket()
    {
        System.out.println("in before testPassengerNull");
    }
    @Test
    public void testPrice()
    {
        Ticket test = new Ticket(123.2,"123","John");
        Assert.assertNotNull("Passenger is null",test.getPassenger());
    }
    @After
    public void afterTicket()
    {
        System.out.println("in after testPassengerNull");
    }
}