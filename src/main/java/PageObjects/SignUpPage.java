package PageObjects;

import Helpers.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Setup.DriverSetup.getDriver;

public class SignUpPage extends BasePage {

    @FindBy(css = "[name='username']")
    private WebElement userName;
    @FindBy(css = "[name='full_name']")
    private WebElement fullName;
    @FindBy(css = "[name='email']")
    private WebElement email;
    @FindBy(css = "[name='password']")
    private WebElement password;
    @FindBy(css= "[name= 'accepted_terms']")
    private WebElement checkBox;
    @FindBy(css = "[class='btn-small full']")
    private WebElement signUpButton;


    public SignUpPage(WebDriver driver) {
        open("https://tree.taiga.io/register");
        PageFactory.initElements(getDriver(), this);
    }

    public SignUpPage init() {
        PageFactory.initElements(getDriver(), this);
        return this;
    }

    public void typeUsername(String usernameInput) {
        new WaitHelper().waitForElementDisplayed(userName);
        type(userName, usernameInput);
    }

    public void typePassword(String passwordInput) {
        new WaitHelper().waitForElementDisplayed(password);
        type(password, passwordInput);
    }

    public void typeFullName(String fullNameInput) {
        new WaitHelper().waitForElementDisplayed(fullName);
        type(fullName, fullNameInput);
    }

    public void typeEmail(String emailInput) {
        new WaitHelper().waitForElementDisplayed(email);
        type(email, emailInput);
    }


    public void click(WebElement element) {
        element.click();
    }

    public void clickSignUpButton() {
        init();
        click(signUpButton);
    }

    public void checkBoxClick() {
        init();
        click(checkBox);
    }
}
