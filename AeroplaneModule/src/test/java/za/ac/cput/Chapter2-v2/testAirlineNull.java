import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testAirlineNull {
    @Before
    public void beforeAirline()
    {
        System.out.println("in before testAirlineNull");
    }
    @Test
    public void testAirline()
    {
        Aeroplane test = new Aeroplane(200,"Saudi airlines","Boeing-474");
        Assert.assertEquals("Saudi airlines",test.getAirline());
    }
    @After
    public void afterAirline()
    {
        System.out.println("in after testAirlineNull");
    }
}
