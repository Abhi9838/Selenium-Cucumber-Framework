package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public GreenCartPageObjects grtGreenCartPageObjects() {
        return new GreenCartPageObjects(driver);
    }
}
