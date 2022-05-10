package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrencyConversionPageObjects {
    WebDriver driver;

    @FindBy(xpath = "//label[text()='Amount']/parent::div/div/span/input") WebElement lblAmount;
    @FindBy(xpath = "//button[text()='Convert']") WebElement btnConvert;

    public CurrencyConversionPageObjects(WebDriver driver){
       this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateToHome(String url){
        driver.get(url);
    }

    public void enterAmount(String amount){
        lblAmount.sendKeys(amount);
    }

    public void clickOnBtn(){
        btnConvert.click();
    }

}
