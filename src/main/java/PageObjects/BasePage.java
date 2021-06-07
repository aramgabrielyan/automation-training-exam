package PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Setup.DriverSetup.getDriver;

public abstract class BasePage {

    private static final Logger LOGGER = Logger.getLogger(BasePage.class);
    protected WebDriver driver;
    public static final String BASE_URL = "https://tree.taiga.io";

    public BasePage() {
        this.driver = getDriver();
    }

    public void open(String url) {
        LOGGER.info("Opening url ->" + url);
        driver.get(url);
    }

    public WebElement find(By location) {
        return driver.findElement(location);
    }


    public void type(By location, String text) {
        find(location).sendKeys(text);
    }

    public void type(WebElement element, String text) {
        element.sendKeys(text);
    }
}
