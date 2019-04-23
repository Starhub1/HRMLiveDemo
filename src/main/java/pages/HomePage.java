package pages;

import init.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver = Base.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);

    @FindBy(id = "welcome")
    private WebElement lblWelcome;

    public HomePage() {
        PageFactory.initElements(Base.getDriver(), this);
    }

    public HomePage waitForPageToLoad() {
        wait.until(ExpectedConditions.visibilityOf(lblWelcome));
        return this;
    }

    public String getWelcomeUserMessage() {
        return lblWelcome.getText();
    }

}
