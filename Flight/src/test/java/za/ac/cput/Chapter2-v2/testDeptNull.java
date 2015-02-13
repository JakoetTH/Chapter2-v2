import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testDeptNull {
    @Before
    public void beforeDeparture()
    {
        System.out.println("in before testDeptNull");
    }
    @Test
    public void testDeparture()
    {
        String [] plane = new String [5];
        Flight test = new Flight("Monday","London","Cape Town",plane);
        Assert.assertNotNull("Departure is null",test.getDeparture());
    }
    @After
    public void afterDeparture()
    {
        System.out.println("in after testDeptNull");
    }
}
