package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.annotations.Steps;
import steps.steps_login;
import utils.Baseclass;

public class stepdef_login extends Baseclass
{
    @Steps
    steps_login endUser;

    @Given("^Navigate to url TC01v2$")
    public void Navigate_to_url_TC01v2() throws Exception
    {
        endUser.Navigate_to_url_TC01v2();
    }

    @When("^Login using username as standarduser and password as secretsauce TC01v2$")
    public void Login_using_username_as_standarduser_and_password_as_secretsauce_TC01v2() throws Exception
    {
        endUser.Login_using_username_as_standarduser_and_password_as_secretsauce_TC01v2();
    }

    @And("^Add Sauce Labs Onesie to the cart TC01v2$")
    public void Add_Sauce_Labs_Onesie_to_the_cart_TC01v2() throws Exception
    {
        endUser.Add_Sauce_Labs_Onesie_to_the_cart_TC01v2();
    }

    @And("^Navigate to Cart and checkout the product TC01v2$")
    public void Navigate_to_Cart_and_checkout_the_product_TC01v2() throws Exception
    {
        endUser.Navigate_to_Cart_and_checkout_the_product_TC01v2();
    }

    @And("^Enter first name last name postal code and click Continue TC01v2$")
    public void Enter_first_name_last_name_postal_code_and_click_Continue_TC01v2() throws Exception
    {
        endUser.Enter_first_name_last_name_postal_code_and_click_Continue_TC01v2();
    }

    @Then("^Read SauceCard number under Payment Information and print it in console TC01v2$")
    public void Read_SauceCard_number_under_Payment_Information_and_print_it_in_console_TC01v2() throws Exception
    {
        endUser.Read_SauceCard_number_under_Payment_Information_and_print_it_in_console_TC01v2();
    }
}
