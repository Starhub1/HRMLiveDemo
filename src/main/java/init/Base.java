package init;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public abstract class Base {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driverBinaries/chromedriver.exe");
        driver.set(new ChromeDriver());
        driver.get().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get().get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterMethod
    public void cleanUp() {
        driver.get().quit();
    }

}
