import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by   Shenno Willaert
 * Date         6/02/2016
 * Project      teamf-ip2
 * Package      PACKAGE_NAME
 */
public class TestOne {

    @Before
    public void setup()
    {

    }

    @Test
    public void testing()
    {
        Assert.assertEquals("Test must fail", 5, 4);
    }

}
