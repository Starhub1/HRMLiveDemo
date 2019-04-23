package pages;

import init.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver = Base.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);

    @FindBy(id = "txtUsername")
    private WebElement txtUsername;

    @FindBy(id = "txtPassword")
    private WebElement txtPassword;

    @FindBy(id = "btnLogin")
    private WebElement btnLogin;


    public LoginPage() {
        PageFactory.initElements(Base.getDriver(), this);
    }

    public HomePage loginAs(String userName, String password) {
        txtUsername.sendKeys(userName);
        txtPassword.sendKeys(password);
        btnLogin.click();
        return new HomePage();
    }


}
