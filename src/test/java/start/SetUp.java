package start;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SetUp {

        public WebDriver driver;
        public pages.HomePage HomePageEx;
        public UtilsClass UtilEx;

        @BeforeTest
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            HomePageEx = new HomePage(driver);
            UtilEx = new UtilsClass(driver);
        }

        @AfterTest
        public void close(){
            driver.quit();
        }
    }

