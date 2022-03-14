package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public CurrencyConversionPageObjects getCurrencyConversionPageObjects() {
        return new CurrencyConversionPageObjects(driver);
    }
}
