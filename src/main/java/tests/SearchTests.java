package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTests extends BaseTest {
    @Test (priority = 0)
    public void positiveTest () {
        HomePage homePage = new HomePage(driver);
        homePage.goToRbs()
                .Search("РОС").verifyResult();
    }

    @Test (priority = 1)
    public void noResultTest () {
        HomePage homePage = new HomePage(driver);
        homePage.goToRbs()
                .Search("йййй").verifyNoResult();
    }
}