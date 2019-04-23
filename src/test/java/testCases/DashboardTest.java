package testCases;

import init.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PIM.AddEmployeePage;

public class DashboardTest extends Base {
    DashboardPage dashboardPage;
    LoginPage loginPage;

    @BeforeClass
    public void beforeClass() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
    }


    @Test
    public void mouseHoverPies() {
        loginPage.loginAs("Admin", "admin123").waitForPageToLoad();
        dashboardPage.mouseHoverpies();
    }


}
