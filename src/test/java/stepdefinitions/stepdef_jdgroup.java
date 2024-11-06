package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class stepdef_jdgroup
{
    WebDriver driver = new FirefoxDriver();
    @Given("User access the incredible site")
    public void user_access_the_incredible_site() throws Exception
    {

        //Thread.sleep(2000);
        driver.get("https://www.incredible.co.za");
        //throw new io.cucumber.java.PendingException();
    }
    @When("Navigate to My account")
    public void navigate_to_my_account() throws Exception
    {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/div[5]/header/div[2]/div[1]/div[3]/div[1]/span")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@class=\"action tertiary registration\"]")).click();

    }
    @Then("Populate the form and click submit")
    public void populate_the_form_and_click_submit() throws Exception
    {
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Mothupi");
        driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("sir.mothupi@greyytechnologies.co.za");
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Ramalepe");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("JDGroup2024");
        driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("JDGroup2024");
        driver.findElement(By.xpath("//*[@id=\"cellphone_number\"]")).sendKeys("061 508 9808");
        //driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[1]/div/button/span")).click();

    }

}
