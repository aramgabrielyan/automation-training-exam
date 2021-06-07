package PageObjects;

import Helpers.WaitHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Setup.DriverSetup.getDriver;


public class LoginPage extends BasePage {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    @FindBy(css = "[name='username']")
    private WebElement usernameField;
    @FindBy(css = "[name='password']")
    private WebElement passwordField;
    @FindBy(css = "[class='btn-small full']")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        open("https://tree.taiga.io/login?next=%252Fdiscover");
        PageFactory.initElements(getDriver(), this);
    }

    public LoginPage init() {
        PageFactory.initElements(getDriver(), this);
        return this;
    }

    public void typeUsername(String username) {
        new WaitHelper().waitForElementDisplayed(usernameField);
        type(usernameField, username);
    }

    public void typePassword(String password) {
        new WaitHelper().waitForElementDisplayed(passwordField);
        type(passwordField, password);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void clickLoginButton() {
        init();
        click(loginButton);
    }

}

