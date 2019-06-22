package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    /**
     * Page Variables
     */
    private String baseURL = "https://www.rbc.ru/";

    /**
     * Web Elements
     */
    private By loupeButtonBy = By.cssSelector("span.topline__search__menu__link");
    private By searchPopupInputBy = By.cssSelector("input.topline__search__input");
    private By searchPopupButtonBy = By.cssSelector(("input.topline__search__button"));

    /**
     * Constructor
     * @param driver
     */
    public HomePage (WebDriver driver) {
        super(driver);
    }

    /**
     * Go to Homepage
     */
    public HomePage goToRbs (){
        driver.get(baseURL);
        return this;
    }

    /**
     * Search
     * @param request
     * @return
     */
    public SearchResultPage Search (String request){
        click(loupeButtonBy);
        waitVisibility(searchPopupInputBy);
        waitVisibility(searchPopupButtonBy);
        writeText(searchPopupInputBy, request);
        click(searchPopupButtonBy);
        return new SearchResultPage(driver);
    }
}