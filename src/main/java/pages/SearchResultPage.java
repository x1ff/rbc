package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage{

    //*********Web Elements*********
    private    By notfoundBy = By.cssSelector("div.g-nofound");
    private    By searchItemTitle = By.cssSelector("span.search-item__title");
    private    By searchItemText = By.cssSelector("span.search-item__text");
    private    By getSearchItemCategory = By.cssSelector("span.search-item__category");

    //*********Constructor*********
    SearchResultPage(WebDriver driver) {
        super(driver);
    }

    //*********Page Methods*********

    //Verify no result
    public void verifyNoResult(){
        isPresent(notfoundBy);
    }

    //Verify result
    public void verifyResult() {
        isPresent(searchItemTitle);
        isPresent(searchItemText);
        isPresent(getSearchItemCategory);
    }
}