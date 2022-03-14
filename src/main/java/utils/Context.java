package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

public class Context {

    public WebDriver driver;
    public PropertyFileReader propertyFileReader;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;

    public Context() {
        propertyFileReader = new PropertyFileReader();
        testBase = new TestBase();
        driver = testBase.webDriverManager();
        pageObjectManager = new PageObjectManager(driver);
    }
}
