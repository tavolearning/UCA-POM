package plan;

import org.testng.Assert;
import org.testng.annotations.Test;
import start.SetUp;

public class TestOne extends SetUp {

    @Test()
    public void verifyPageInfoTest(){
        //Check the url and the title
        boolean findUrl = UtilEx.verifyUrl("https://www.saucedemo.com/");
        Assert.assertTrue(findUrl);

        Assert.assertTrue(UtilEx.verifyUrl("https://www.saucedemo.com"));

        boolean findTitle = UtilEx.verifyTitle("Swag Labs");
        Assert.assertTrue(findTitle);
    }
}
