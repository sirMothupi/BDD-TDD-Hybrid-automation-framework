package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class universities
{
    @Given("set up the endpoint TC02v2")
    public void set_up_the_endpoint_tc02v2()
    {
        RestAssured.baseURI = "http://universities.hipolabs.com/search?country=South+Africa";

        Response response = RestAssured.get();

        response =RestAssured.get();
        response.prettyPrint();

       // Response response = RestAssured.get();

        JsonPath jsonPath = response.jsonPath();
        //x.conversion_rates_TWD
        double double1 = jsonPath.getDouble("country=ZA");
        System.out.println(double1);
        // Write code here that turns the phrase above into concrete actions
    }
    @When("to get get request TC02v2")
    public void to_get_get_request_tc02v2()
    {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("get the university state of wits TC02v2")
    public void get_the_university_state_of_wits_tc02v2()
    {
        // Write code here that turns the phrase above into concrete actions

    }

}
