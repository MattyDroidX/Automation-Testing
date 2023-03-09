package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

  protected static WebDriver driver;
  private static WebDriverWait wait;

  private static Actions actions;

  static {
    ChromeOptions chromeOptions = new ChromeOptions();
    driver = new ChromeDriver(chromeOptions);
    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
  }

  public BasePage(WebDriver driver) {
    BasePage.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    PageFactory.initElements(driver,this);
  }

  public static void navigateTo(String url) {
    driver.get(url);
  }

  private WebElement find(String locator){
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
  }

  public void goToLinkText(String linkText){
    driver.findElement(By.linkText(linkText)).click();
  }

  public void clickElement(String locator){
    find(locator).click();
  }

  public void write(String locator, String textToWrite){
    find(locator).clear();
    find(locator).sendKeys(textToWrite);
  }

  public void selectFromDropdownByValue(String locator, String valueToSelect){
    Select dropdown = new Select(find(locator));

    dropdown.selectByValue(valueToSelect);
  }


  public void selectFromDropdownByIndex(String locator, int valueToSelect){
    Select dropdown = new Select(find(locator));
    dropdown.selectByIndex(valueToSelect);
  }


  public void selectFromDropdownByText(String locator, String valueToSelect){
    Select dropdown = new Select(find(locator));
    dropdown.selectByVisibleText(valueToSelect);
  }

  public void hoverOverElement(String locator){
    actions.moveToElement(find(locator));
  }

  public void doubleClick(String locator){
    actions.doubleClick(find(locator));
  }

  public void rightClick(String locator){
    actions.contextClick(find(locator));
  }

  public String getValueFromTable(String locator,int row, int column){
    String cellINeed = locator + "table/tbody/tr["+row+"]/td["+column+"]";
    return find(cellINeed).getText();
  }

  public void setValueOnTable(String locator, int row, int column, String stringToSend){
    String cellToFill = locator + "table/tbody/tr["+row+"]/td["+column+"]";
    find(cellToFill).sendKeys(stringToSend);
  }

  public void seeTypeFile(){
    String change_visibility = "$(\"#fileField\").css(\"visibility\",\"visible\");";
    String change_display = "$(\"#fileField\").css(\"display\",\"block\");";
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript(change_visibility);
    js.executeScript(change_display);
//    ("#fileField").style.visibility="visible";
//    ("#fileField").style.display="block";
//    ("#fileField").style.width="200px";
//    ("#fileField").style.height="200px";
//    ("#fileField").style.position="fixed";
//    ("#fileField").style.overflow="visible";
//    ("#fileField").style.zIndex="999999";
//    ("#fileField").style.top="500px";
//    ("#fileField").style.bottom="500px";
//    ("#fileField").style.left="500px";
//    ("#fileField").style.right="500px";
//    ("#fileField").style.marginBottom="100px";

  }

  public void switchToIframe(int iFrameIndex){
    driver.switchTo().frame(iFrameIndex);
  }

  public void switchToParentFrame(){
    driver.switchTo().parentFrame();
  }

  public void dismissAlert(){
    try {
      driver.switchTo().alert().dismiss();
    }catch (NoAlertPresentException e){
      e.printStackTrace();
    }
  }

  public String textFromElement(String locator){
    return find(locator).getText();
  }

  public void validateText(String locator, String textToValidate){
    Assert.assertEquals(textToValidate, find(locator).getText());
  }

  public boolean elementEnable(String locator){
    return find(locator).isEnabled();
  }
  public boolean elementISDisplayed(String locator){
    return find(locator).isDisplayed();
  }

  public boolean elementIsSelected(String locator){
    return find(locator).isSelected();
  }

  public List<WebElement> bringMeAllElements(String locator){
    return driver.findElements(By.className(locator));
  }

  public void selectNElements(String locator, int index){
    List<WebElement> results = driver.findElements(By.xpath(locator));
    results.get(index).click();
  }

  public static void closeBrowser(){
    driver.quit();
  }
}











