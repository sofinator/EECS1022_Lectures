package ca.yorku.testbed.scratch;

import org.junit.Assert;
import org.junit.Test;

import ca.roumani.i2c.Utility;

public class UtilTest
{
    @Test
    public void cubicRootTest()
    {
        System.out.println("Testing cubicRoot");
        double testCase;
        //===================================
        testCase = 27;
        System.out.println(testCase);
        System.out.println(Util.cubicRoot(testCase));
        Assert.assertEquals(Util.cubicRoot(testCase), 3.0, 0.001);

        System.out.println(Utility.repeat(40, '-'));

        testCase = 12;
        System.out.println(testCase);
        System.out.println(Util.cubicRoot(testCase));
        Assert.assertEquals(Util.cubicRoot(testCase), 3.0, 0.001);
    }


}
