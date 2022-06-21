package start;

import org.openqa.selenium.WebDriver;

public class UtilsClass {

    WebDriver driver;

    public UtilsClass(WebDriver remoteDriver){
        driver = remoteDriver;
    }

    public boolean verifyUrl(String urlLoginExpected){
        String Url = driver.getCurrentUrl();
        boolean findUrl = Url.contains(urlLoginExpected);
        return findUrl;
    }

    public boolean verifyTitle(String titleText){
        String title = driver.getTitle();
        boolean findText = title.contains(titleText);
        return findText;
    }
}
