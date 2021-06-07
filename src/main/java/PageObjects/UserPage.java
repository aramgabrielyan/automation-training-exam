package PageObjects;

import Helpers.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage{

    @FindBy(css = "[class='user-avatar']")
    private WebElement avatar;
    @FindBy(css = "class='userpilot-builder-block userpilot-h1']")
    private WebElement welcome;

    public boolean isAvatarDisplayed(){
        new WaitHelper().waitForElementDisplayed(avatar);
        return avatar.isDisplayed();
    }

    public boolean isWelcomeDisplayed(){
        new WaitHelper().waitForElementDisplayed(welcome);
        return welcome.isDisplayed();
    }



}
