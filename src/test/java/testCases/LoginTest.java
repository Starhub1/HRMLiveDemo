package testCases;

import init.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base {
    LoginPage loginPage;
    HomePage homePage;

    @Test()
    public void testValidLogin() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        loginPage.loginAs("Admin", "admin123");
        String welcomeMsg = homePage.waitForPageToLoad().getWelcomeUserMessage();
        Assert.assertEquals(welcomeMsg, "Welcome Admin");
    }
}
