package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.steps_currency;

public class stepdef_currency
{
    @Steps
    steps_currency endUser;

    @Given("^set up the endpoint TC01v2$")
    public void set_up_the_endpoint_TC01v2() throws Exception
    {
        endUser.set_up_the_endpoint_TC01v2();
    }

    @When("^to get get request TC01v2$")
    public void to_get_get_request_TC01v2() throws Exception
    {
        endUser.to_get_get_request_TC01v2();
    }

    @Then("^get the conversion rate for a given currency and verify it TC01v2$")
    public void get_the_conversion_rate_for_a_given_currency_and_verify_it_TC01v2() throws Exception
    {
        endUser.get_the_conversion_rate_for_a_given_currency_and_verify_it_TC01v2();
    }
}
