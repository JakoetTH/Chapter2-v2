import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testModelNull {
    @Before
    public void beforeModel()
    {
        System.out.println("in before testModelNull");
    }
    @Test
    public void testModel()
    {
        Aeroplane test = new Aeroplane(200,"Saudi airlines","Boeing-474");
        Assert.assertEquals("Boeing-474",test.getModel());
    }
    @After
    public void afterModel()
    {
        System.out.println("in after testModelNull");
    }
}
