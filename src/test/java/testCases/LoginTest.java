package testCases;

import init.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PIM.AddEmployeePage;

public class LoginTest extends Base {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeClass
    public void beforeClass() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test()
    public void testValidLogin() {

        loginPage.loginAs("Admin", "admin123");
        String welcomeMsg = homePage.waitForPageToLoad().getWelcomeUserMessage();
        Assert.assertEquals(welcomeMsg, "Welcome Admin");
    }
}
