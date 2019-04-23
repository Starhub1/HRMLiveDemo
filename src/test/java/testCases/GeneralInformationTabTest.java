package testCases;

import init.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin.GeneralInformationPage;
import pages.HomePage;
import pages.LoginPage;

public class GeneralInformationTabTest extends Base {

    GeneralInformationPage generalInformationPage;
    LoginPage loginPage;

    @BeforeClass
    public void beforeClass() {
        loginPage = new LoginPage();
        generalInformationPage = new GeneralInformationPage();
    }


    @Test()
    public void testPresenceOfGeneralInformation() {

        loginPage.loginAs("Admin", "admin123").waitForPageToLoad();
        String menuName = generalInformationPage.mouseHoverOrganisationMenu().getGeneralInformationMenuName();
        Assert.assertEquals(menuName, "General Information");
    }

    @Test
    public void verifyEditableFields() {
        loginPage.loginAs("Admin", "admin123").waitForPageToLoad();
        generalInformationPage.openGenerationInformationTab().clickEditButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(generalInformationPage.isOrganisationCityEditable());
        softAssert.assertFalse(generalInformationPage.isOrganisationCountryEditable());
        softAssert.assertTrue(generalInformationPage.isOrganisationEmailEditable());
        softAssert.assertTrue(generalInformationPage.isOrganisationFaxEditable());
        softAssert.assertTrue(generalInformationPage.isOrganisationNameEditable());
        softAssert.assertTrue(generalInformationPage.isOrganisationNoteEditable());
        softAssert.assertTrue(generalInformationPage.isOrganisationPhoneEditable());
        softAssert.assertFalse(generalInformationPage.isOrganisationProvinceEditable());
        softAssert.assertTrue(generalInformationPage.isOrganisationRegistrationNumEditable());
        softAssert.assertFalse(generalInformationPage.isOrganisationStreet1Editable());
        softAssert.assertFalse(generalInformationPage.isOrganisationStreet2Editable());
        softAssert.assertFalse(generalInformationPage.isOrganisationZipCodeEditable());

        softAssert.assertAll();
    }

}
