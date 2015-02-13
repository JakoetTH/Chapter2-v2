
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testAeroArray {
    @Before
    public void beforeDay()
    {
        System.out.println("in before testAeroArray");
    }
    @Test
    public void testDay()
    {
        String [] plane = new String [5];
        Flight test = new Flight("Monday","London","Cape Town",plane);
        Assert.assertArrayEquals(plane,test.getAero());
    }
    @After
    public void afterDay()
    {
        System.out.println("in after testAeroArray");
    }
}
