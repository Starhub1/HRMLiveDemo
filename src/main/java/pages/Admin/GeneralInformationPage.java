package pages.Admin;

import init.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralInformationPage {
    WebDriver driver = Base.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);
    Actions actions = new Actions(driver);

    public GeneralInformationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu_admin_viewAdminModule")
    private WebElement menuAdmin;

    @FindBy(id = "menu_admin_Organization")
    private WebElement menuOrganisation;

    @FindBy(id = "menu_admin_viewOrganizationGeneralInformation")
    private WebElement menuGeneralInformation;

    @FindBy(id = "btnSaveGenInfo")
    private WebElement btnEdit;

    @FindBy(id = "btnSaveGenInfo")
    private WebElement btnSave;

    @FindBy(id = "organization_name")
    private WebElement txtOrganisationName;

    @FindBy(id = "organization_taxId")
    private WebElement txtOrganisationTaxId;

    @FindBy(id = "organization_phone")
    private WebElement txtOrganisationPhone;

    @FindBy(id = "organization_registraionNumber")
    private WebElement txtOrganisationRegNumber;

    @FindBy(id = "organization_fax")
    private WebElement txtOrganisationFax;

    @FindBy(id = "organization_email")
    private WebElement txtOrganisationEmail;

    @FindBy(id = "organization_street1")
    private WebElement txtOrganisationStreet1;

    @FindBy(id = "organization_street2")
    private WebElement txtOrganisationStreet2;

    @FindBy(id = "organization_city")
    private WebElement txtOrganisationCity;

    @FindBy(id = "organization_province")
    private WebElement txtOrganisationProvince;

    @FindBy(id = "organization_zipCode")
    private WebElement txtOrganisationZipCode;

    @FindBy(id = "organization_country")
    private WebElement txtOrganisationCountry;

    @FindBy(id = "organization_note")
    private WebElement txtOrganisationNote;


    public GeneralInformationPage openGenerationInformationTab() {
        actions.moveToElement(menuAdmin).moveToElement(menuOrganisation).moveToElement(menuGeneralInformation)
                .click().build().perform();
        wait.until(ExpectedConditions.visibilityOf(txtOrganisationCity));
        return this;
    }

    public GeneralInformationPage mouseHoverOrganisationMenu() {
        actions.moveToElement(menuAdmin).moveToElement(menuOrganisation)
                .build().perform();
        return this;
    }

    public String getGeneralInformationMenuName() {
        return menuGeneralInformation.getText();
    }

    public GeneralInformationPage clickEditButton() {
        btnEdit.click();
        return this;
    }

    public boolean isOrganisationNameEditable() {
        return txtOrganisationName.isEnabled();
    }


    public boolean isOrganisationTaxIDEditable() {
        return txtOrganisationTaxId.isEnabled();
    }


    public boolean isOrganisationRegistrationNumEditable() {
        return txtOrganisationRegNumber.isEnabled();
    }


    public boolean isOrganisationPhoneEditable() {
        return txtOrganisationPhone.isEnabled();
    }


    public boolean isOrganisationFaxEditable() {
        return txtOrganisationFax.isEnabled();
    }


    public boolean isOrganisationEmailEditable() {
        return txtOrganisationEmail.isEnabled();
    }


    public boolean isOrganisationStreet1Editable() {
        return txtOrganisationStreet1.isEnabled();
    }


    public boolean isOrganisationStreet2Editable() {
        return txtOrganisationStreet2.isEnabled();
    }


    public boolean isOrganisationCityEditable() {
        return txtOrganisationCity.isEnabled();
    }


    public boolean isOrganisationProvinceEditable() {
        return txtOrganisationProvince.isEnabled();
    }


    public boolean isOrganisationZipCodeEditable() {
        return txtOrganisationZipCode.isEnabled();
    }


    public boolean isOrganisationCountryEditable() {
        return txtOrganisationCountry.isEnabled();
    }


    public boolean isOrganisationNoteEditable() {
        return txtOrganisationNote.isEnabled();
    }


}
