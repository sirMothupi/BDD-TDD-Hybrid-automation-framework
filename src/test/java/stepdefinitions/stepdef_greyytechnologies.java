package stepdefinitions;


import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import steps.steps_greyytechnologies;
import utils.Baseclass;

public class stepdef_greyytechnologies
{
    @Steps
    steps_greyytechnologies endUser;

    @Then("Navigate to the greyy technologies url TC01v2")
    public void navigate_to_the_greyy_technologies_url_tc01v2() throws Exception
    {
        // Write code here that turns the phrase above into concrete actions
        endUser.Navigate_to_the_greyy_technologies_url_TC01v2();
    }
    @Then("click on the home tab TC01v2")
    public void click_on_the_home_tab_tc01v2() throws Exception
    {
        endUser.click_on_the_home_tab_TC01v2();
    }
    @Then("click on the services tab TC01v2")
    public void click_on_the_services_tab_tc01v2() throws Exception
    {
      endUser.click_on_the_services_tab_TC01v2();
    }
    @Then("click on the contact us tab and populate the required fields TC01v2")
    public void click_on_the_contact_us_tab_and_populate_the_required_fields_tc01v2() throws Exception
    {
        endUser.click_on_the_contact_us_tab_and_populate_the_required_fields_TC01v2();
    }
    @Then("click on the submit button TC01v2")
    public void click_on_the_submit_button_tc01v2() throws Exception
    {
        endUser.click_on_the_submit_button_TC01v2();
    }
    @Then("review if form has been successfully submitted TC01v2")
    public void review_if_form_has_been_successfully_submitted_tc01v2() throws Exception
    {
       endUser.review_if_form_has_been_successfully_submitted_TC01v2();
    }

}
