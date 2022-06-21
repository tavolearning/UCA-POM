package start;

import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SetUp {

        public WebDriver driver;
        public pages.HomePage HomePage;
        public UtilsClass Util;

        @BeforeTest
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            HomePage = new HomePage(driver);
            Util = new UtilsClass(driver);
        }

        @AfterTest
        public void close(){
            driver.quit();
        }
    }

