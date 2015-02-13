import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testDayNull {
    @Before
    public void beforeDay()
    {
        System.out.println("in before testDayNull");
    }
    @Test
    public void testDay()
    {
        String [] plane = new String [5];
        Flight test = new Flight("Monday","London","Cape Town",plane);
        Assert.assertNotNull("Day is null",test.getDay());
    }
    @After
    public void afterDay()
    {
        System.out.println("in after testDayNull");
    }
}