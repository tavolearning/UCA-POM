package plan;

import org.testng.Assert;
import org.testng.annotations.Test;
import start.SetUp;

public class TestOne extends SetUp {

    @Test ()
    public void verifyPageInfoTest(){
        //Check the url and the title
        boolean findUrl = Util.verifyUrl("https://www.saucedemo.com/");
        Assert.assertTrue(findUrl);

        boolean findTitle = Util.verifyTitle("Swag Labs");
        Assert.assertTrue(findTitle);
    }
}
