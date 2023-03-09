package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryPage extends BasePage{

    @CacheLookup
    @FindBy(id="button")
    WebElement button;

    public PageFactoryPage(){
        super(driver);
        driver.get("www.google.com");
    }
}
