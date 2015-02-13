import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testDestNull {
    @Before
    public void beforeDestination()
    {
        System.out.println("in before testDestNull");
    }
    @Test
    public void testDestination()
    {
        String [] plane = new String [5];
        Flight test = new Flight("Monday","London","Cape Town",plane);
        Assert.assertNotNull("Destination is null",test.getDestination());
    }
    @After
    public void afterDest()
    {
        System.out.println("in after testDestNull");
    }
}
