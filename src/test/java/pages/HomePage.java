package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    //Here we have all locator just to update or created
    String btnWhat = "display-flex";

    public HomePage(WebDriver remoteDriver) {
        driver = remoteDriver;
    }

    public void acceptCookiesAs (){
        driver.findElement(By.className("button button-style ab")).click();
    }

    public OtherPage clickBtn() {
        driver.findElement(By.className(btnWhat)).click();
        OtherPage nextPage = new OtherPage(driver);
        return nextPage;
    }

    public void searchOutsource (){
        driver.findElement(By.className("searchbox")).click();
        driver.findElement(By.cssSelector("#search-field")).sendKeys("Outsource", Keys.ENTER);
    }

}
