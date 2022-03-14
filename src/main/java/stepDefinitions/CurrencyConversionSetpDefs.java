package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CurrencyConversionPageObjects;
import utils.Context;

public class CurrencyConversionSetpDefs {

    Context context;
    CurrencyConversionPageObjects currencyConversionPageObjects;

    public CurrencyConversionSetpDefs(Context context) {
        this.context = context;
        currencyConversionPageObjects = context.pageObjectManager.getCurrencyConversionPageObjects();
    }

    @Given("user navigates to the website {string}")
    public void user_Navigates_To_The_Website(String websiteName) {
        String url = context.propertyFileReader.getPropertyValueByKeyName(websiteName);
        currencyConversionPageObjects.navigateToHome(url);
    }

    @When("user enter the {string} Amount")
    public void user_Enter_The_Amount(String amount) {
        currencyConversionPageObjects.enterAmount(amount);
    }

    @When("user click on convert button")
    public void userClickOnConvertButton() {
        currencyConversionPageObjects.clickOnBtn();
    }
}
