package pages;

public class GooglePage extends BasePage {
  private String searchButton = "//input[@value='Pesquisa Google']";

  public GooglePage() {
    super(driver);
  }

  public void navigateToGoogle() {
    navigateTo("https://www.google.com");
  }

  public void clickGoogleSearch(){
    clickElement(searchButton);
  }

  public void enterSearchCriteria(String criteria){
    String searchTextField = "//input[@title='Pesquisar']";
    write(searchTextField, criteria);
  }

//  public String firstResult(){
//    String textResult = "";
//    return textFromElement(textResult);
//  }
//
//  public void validateSearch(){
//    validateText("","");
//  }

}
