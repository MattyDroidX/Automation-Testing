package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AmazonSearchPage;

public class AmazonSearchSteps {

    AmazonSearchPage amazon = new AmazonSearchPage();

    @Given("^the user navigate to www.amazon.com$")
    public void navigatoToAmazon(){
        amazon.navigateToAmazon();
    }
    @And("^Searches for (.+)$")
    public void enterSearchCriteria(String locator){
        amazon.enterSearchCriteria(locator);
        amazon.clickSearch();
    }
    @And("^Navigate to the page number (.+)$")
    public void navigatoToSecondPage(String pageNumber){
        amazon.goToPage(pageNumber);
    }
    @And("^Selects the third item$")
    public void selectThirdItem(){
        amazon.pick3rdItem();
    }

    @Then("^the user would be able to add it to the cart$")
    public void itemCanBeAddedToTheCart(){
        amazon.addToCart();
        Assert.assertEquals("Added to Cart", amazon.addedToCartMessage());
    }

}
