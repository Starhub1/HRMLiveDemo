package testCases;

import com.sun.source.tree.AssertTree;
import init.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Admin.GeneralInformationPage;
import pages.LoginPage;
import pages.PIM.AddEmployeePage;

public class AddEmployeeTest extends Base {
    AddEmployeePage addEmployeePage;
    LoginPage loginPage;

    @BeforeClass
    public void beforeClass() {
        loginPage = new LoginPage();
        addEmployeePage = new AddEmployeePage();
    }


    @Test
    public void addNewEmployee() {
        loginPage.loginAs("Admin", "admin123").waitForPageToLoad();
        addEmployeePage.openAddEmployeeTab().typeFirstName("FirstName1").typeLastName("SecondName1").typeEmployeeId().clickSave();
        Assert.assertEquals(addEmployeePage.getProfileHeader(), "FirstName1 SecondName1");
    }

    @Test()
    public void uploadProfilePicture() {
        loginPage.loginAs("Admin", "admin123").waitForPageToLoad();
        addEmployeePage.openAddEmployeeTab().typeFirstName("FirstName1").typeLastName("SecondName1").typeEmployeeId().clickSave();
        addEmployeePage.uploadProfilePicture("samplePic.jpeg");
    }
}
