package hello;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hello1StepDefinition {
    WebDriver driver;

    public Hello1StepDefinition(DriverHolder driverHolder) {
        driver = driverHolder.driver;
    }

    @Given("today is Sunday")
    public void todayIsSunday() {
//        throw new IllegalStateException("");
    }

    @When("I ask whether it's Friday yet {string}")
    public void iAskWhetherItSFridayYet(String message) {
        System.out.println(message);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String arg0) {
        driver.get("https://en.wikipedia.org/wiki/Wiki");
        String text = driver.findElement(By.className("mw-page-title-main")).getText();
        Assertions.assertEquals("Wiki", text);
    }

    @Given("today is Friday")
    public void todayIsFriday() {
    }
}
