package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

abstract class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    /**
     * Constructor
     * @param driver
     */
    BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }

    /**
     * Wait Method
     * @param elementBy
     */
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    /**
     * Click Method
     * @param elementBy
     */
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    /**
     * Write Text
     * @param elementBy
     * @param text
     */
    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    /**
     * Assert element is here
     * @param elementBy
     */
    public void isPresent(By elementBy) {
        waitVisibility(elementBy);
        Assert.assertTrue(driver.findElements(elementBy).size() > 0, "ERR: element is not here");
    }
}