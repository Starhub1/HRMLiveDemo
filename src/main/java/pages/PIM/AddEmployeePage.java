package pages.PIM;

import init.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Admin.GeneralInformationPage;

import java.io.File;
import java.util.List;

public class AddEmployeePage {
    WebDriver driver = Base.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);
    Actions actions = new Actions(driver);

    public AddEmployeePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement menuPIM;

    @FindBy(id = "menu_pim_addEmployee")
    private WebElement menuAddEmployee;

    @FindBy(id = "firstName")
    private WebElement txtFirstName;

    @FindBy(id = "lastName")
    private WebElement txtLastName;

    @FindBy(id = "employeeId")
    private WebElement txtEmployeeId;

    @FindBy(id = "btnSave")
    private WebElement btnSave;

    @FindBy(css = "#profile-pic>h1")
    private WebElement lblProfileHeader;

    @FindBy(css = ".imageHolder>a>img")
    private WebElement imgPic;

    @FindBy(id = "photofile")
    private WebElement txtChooseFile;

    @FindBy(css = ".message success fadable")
    private List<WebElement> msgSuccess;


    public AddEmployeePage openAddEmployeeTab() {
        actions.moveToElement(menuPIM).moveToElement(menuAddEmployee)
                .click().build().perform();
        wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        return this;
    }

    public AddEmployeePage typeFirstName(String firstName) {
        txtFirstName.sendKeys(firstName);
        return this;
    }

    public AddEmployeePage typeLastName(String lastName) {
        txtLastName.sendKeys(lastName);
        return this;
    }

    public AddEmployeePage typeEmployeeId() {
        txtEmployeeId.clear();
        txtEmployeeId.sendKeys(String.valueOf(System.currentTimeMillis()));
        return this;
    }

    public AddEmployeePage clickSave() {
        btnSave.click();
        return this;
    }

    public String getProfileHeader() {
        wait.until(ExpectedConditions.visibilityOf(lblProfileHeader));
        return lblProfileHeader.getText();

    }

    public AddEmployeePage uploadProfilePicture(String path) {
        imgPic.click();
        wait.until(ExpectedConditions.visibilityOf(txtChooseFile));
        txtChooseFile.sendKeys(new File(path).getAbsolutePath());
        btnSave.click();
        return this;
    }

    public boolean isUploadSuccessful() {
        System.out.println(msgSuccess.get(0).getText());
        return msgSuccess.size() > 0;
    }
}
