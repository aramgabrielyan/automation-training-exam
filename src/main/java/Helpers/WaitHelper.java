package Helpers;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Setup.DriverSetup.getDriver;

public class WaitHelper {

    private final static int DEFAULT_TIMEOUT = 60;

    public void waitForPageReady() {
        new WebDriverWait(getDriver(), DEFAULT_TIMEOUT).until((ExpectedConditions.jsReturnsValue("return document.readyState=='complete';")));
    }

    public WaitHelper waitForElementDisplayed(WebElement element) {
        try {
            new WebDriverWait(getDriver(), DEFAULT_TIMEOUT).until(ExpectedConditions.visibilityOf((element)));
            return this;
        } catch (WebDriverException e) {
            throw new Error("Element with provided locator was not displayed: " + element.toString());
        }
    }
}
