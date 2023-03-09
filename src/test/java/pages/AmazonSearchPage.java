package pages;

public class AmazonSearchPage extends BasePage{
        String searchTextField = "//input[@id='twotabsearchtextbox']";
        String searchButton = "//input[@id='nav-search-submit-button']";
        String thirdResult = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]";
        String addToCartButton = "//input[@id='add-to-cart-button']";
        String addedMessageText = "//span[contains(text(),'Added to Cart')]";

    public AmazonSearchPage(){
        super(driver);
    }

    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com");
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }


    public void clickSearch(){
        clickElement(searchButton);
    }


    public void goToPage(String pageNumber){
        goToLinkText(pageNumber);
    }

    public void pick3rdItem(){
        clickElement(thirdResult);
    }

    public void addToCart(){
        clickElement(addToCartButton);
    }

    public String addedToCartMessage(){
        return textFromElement(addedMessageText);
    }

}
