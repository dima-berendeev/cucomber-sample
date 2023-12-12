package hello;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class HelloStepDefinitions {
    WebDriver driver;

    public HelloStepDefinitions(DriverHolder driverHolder) {
        driver = driverHolder.driver;
    }

    @Given("Page is wiki")
    public void pageIsWiki() {
        driver.get("https://en.wikipedia.org/wiki/Wiki");
    }

    @Then("the page header is {string}")
    public void thePageHeaderIs(String titleText) {
        String actualHeader = driver.findElement(By.className("mw-page-title-main")).getText();
        assertEquals(titleText, actualHeader);
    }
}
