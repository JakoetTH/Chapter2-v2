import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testPriceNull {
    @Before
    public void beforeTicket()
    {
        System.out.println("in before testPriceNull");
    }
    @Test
    public void testPrice()
    {
        Ticket test = new Ticket(123.2,"123","John");
        Assert.assertNotNull("Price is null",test.getPrice());
    }
    @After
    public void afterTicket()
    {
        System.out.println("in after testPriceNull");
    }
}
