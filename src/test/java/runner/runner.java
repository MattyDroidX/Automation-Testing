package runner;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
//        plugin = {"html:target/cucumber-reports.html"},
//        plugin = { "html:target/json-report/cucumber.html"},
        monochrome = true,
        tags = "@Cart"
)

public class runner {
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }

}