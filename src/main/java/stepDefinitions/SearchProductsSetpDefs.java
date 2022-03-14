package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.GreenCartPageObjects;
import utils.Context;

public class SearchProductsSetpDefs {

    Context context;
    GreenCartPageObjects greenCartPageObjects;

    public SearchProductsSetpDefs(Context context) {
        this.context = context;
        greenCartPageObjects = context.pageObjectManager.grtGreenCartPageObjects();
    }

    @When("user searched a product with shortname {string} and extracted the actual product")
    public void user_searched_a_product_with_shortname_and_extracted_the_actual_product(String homePageName) {
        String url = context.propertyFileReader.getPropertyValueByKeyName(homePageName);
        greenCartPageObjects.navigateToHome(url);
//        Assert.assertEquals();

    }

    @Then("user searched a product with the same shortname in offers page to check if product exist")
    public void user_searched_a_product_with_the_same_shortname_in_offers_page_to_check_if_product_exist() {

    }

}
