package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

  GooglePage google = new GooglePage();

  @Given("^Go throw Google$")
  public void navigateToGoogle() {
    google.navigateToGoogle();
  }

  @When("^Searching for something$")
  public void searchingInGoogle() {
    google.enterSearchCriteria("Lionel Messi");
  }

  @And("^Click on the search button$")
  public void clickOnTheButton() {
    google.clickGoogleSearch();
  }

  @Then("^Getting results$")
  public void getResults() {
//    Assert.assertEquals("Expected text",google.firstResult());

  }


}
