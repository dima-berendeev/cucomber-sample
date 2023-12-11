package hello;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hello1StepDefinition {


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
    }

    @Given("today is Friday")
    public void todayIsFriday() {
    }
}
