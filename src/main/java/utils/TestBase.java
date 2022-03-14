package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class TestBase {

    public WebDriver driver;
    public PropertyFileReader propertyFileReader;

    public TestBase(){
        propertyFileReader = new PropertyFileReader();
    }

    public WebDriver webDriverManager() {
        if (driver == null) {
            String browser = propertyFileReader.getPropertyValueByKeyName("browser");
            switch (browser.toUpperCase()){
                case "CHROME":{
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                }
//                case "FIREFOX":{
//                    WebDriverManager.firefoxdriver().setup();
//                    driver = new geckoDriver();
//                    break;
//                }
            }

            driver.manage().window().maximize();
        }
        return driver;
    }
}
