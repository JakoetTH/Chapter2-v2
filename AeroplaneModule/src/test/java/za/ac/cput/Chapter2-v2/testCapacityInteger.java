
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class testCapacityInteger {
    @Before
    public void beforeCapacity()
    {
        System.out.println("in before testCapacityInteger");
    }
    @Test
    public void testCapacity()
    {
        Aeroplane test = new Aeroplane(200,"Saudi airlines","Boeing-474");
        Assert.assertEquals(200,test.getCapacity(),1);
    }
    @After
    public void afterCapacity()
    {
        System.out.println("in after testCapacityInteger");
    }
}