package project_259;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo_one {

    @Test
    public void testPass() {
        Assert.assertEquals(demo.display(55), "pass");
    }

    @Test
    public void testFail() {
        Assert.assertEquals(demo.display(20), "fail");
    }
}
