package pageObjects;

import org.openqa.selenium.WebDriver;

public class GreenCartPageObjects {
    WebDriver driver;

    public GreenCartPageObjects(WebDriver driver){
       this.driver = driver;
    }

    public void navigateToHome(String url){
        driver.get(url);
    }

}
