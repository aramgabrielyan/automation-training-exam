package PageObjects;

import Helpers.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage{

    @FindBy(css = "[class='user-avatar']")
    private WebElement avatar;

    public boolean isAvatarDisplayed(){
        new WaitHelper().waitForElementDisplayed(avatar);
        return avatar.isDisplayed();
    }
}
