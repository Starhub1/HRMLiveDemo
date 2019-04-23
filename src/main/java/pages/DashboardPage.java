package pages;

import init.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PIM.AddEmployeePage;

import java.io.File;
import java.util.List;

public class DashboardPage {
    WebDriver driver = Base.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);
    Actions actions = new Actions(driver);

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "*[id^='pieLabel']")
    private List<WebElement> pies;


    public DashboardPage mouseHoverpies() {
        for (WebElement pie: pies){
            actions.moveToElement(pie).build().perform();
        }
        return this;
    }


}
