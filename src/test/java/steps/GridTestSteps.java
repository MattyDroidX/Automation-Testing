package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GridPage;

public class GridTestSteps {

    GridPage grid = new GridPage();

    @Given("^I navigate to the static table$")
    public void navigatoToGrid(){
        grid.navigateToGrid();
    }

    @Then("^I can return the value i wanted$")
    public void returnValue() {
        String value = grid.getValueFromGrid(3,2);

        Assert.assertEquals("1 a",value);
    }

    @Then("^I can validate the table is displayed$")
    public void theTableIsDisplayed(){
        Assert.assertFalse("Boom", grid.cellStatus());
    }


}
