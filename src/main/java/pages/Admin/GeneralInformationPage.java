package pages.Admin;

import init.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    public GeneralInformationPage openGenerationInformationTab() {
        actions.moveToElement(menuAdmin).moveToElement(menuOrganisation).moveToElement(menuGeneralInformation)
                .build().perform();
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


}
