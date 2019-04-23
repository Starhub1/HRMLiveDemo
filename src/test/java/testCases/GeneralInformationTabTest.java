package testCases;

import init.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin.GeneralInformationPage;
import pages.HomePage;
import pages.LoginPage;

public class GeneralInformationTabTest extends Base {

    GeneralInformationPage generalInformationPage;
    LoginPage loginPage;

    @Test
    public void testPresenceOfGeneralInformation() {
        loginPage = new LoginPage();
        loginPage.loginAs("Admin", "admin123").waitForPageToLoad();
        generalInformationPage = new GeneralInformationPage();
        String menuName = generalInformationPage.mouseHoverOrganisationMenu().getGeneralInformationMenuName();
        Assert.assertEquals(menuName, "General Information");
    }
}
