package steps;

import global_variables.global_pageobjects;
import net.serenitybdd.annotations.Step;
import org.eclipse.sisu.locators.Implicit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Baseclass;

import static org.openqa.selenium.By.xpath;
import static utils.POM_DomainLibrary.*;

public class steps_greyytechnologies extends Baseclass {
    Logger logger = LoggerFactory.getLogger("sampleLogger");
    StringBuffer verifyErrors = new StringBuffer();
    global_pageobjects pageobjects = new global_pageobjects();

    WebDriver driver = new FirefoxDriver();

    @Step
    public static void openUrl(String url)
    {
        webDriver.get(url);
        webDriver.manage().window().maximize();

    }

    public void Navigate_to_the_greyy_technologies_url_TC01v2() throws Exception
    {
        driver.get("https://greyytechnologies.co.za/");
    }

    public void click_on_the_home_tab_TC01v2() throws Exception
    {
        System.out.println("------------------Web browser launched successfully------------------");
        //driver.findElement(xpath(homeTab)).click();
        global_pageobjects.onClickAction(homeTab,"Home");
        //webDriver.findElement(By.xpath("/html/body/div/div/div/nav/div/div/div[2]/div[2]/ul/li[1]/a")).click();
        System.out.println(3);
    }

    public void click_on_the_services_tab_TC01v2() throws Exception
    {
        //global_pageobjects.onClickAction(services,"services tab");
        //webDriver.findElement(By.xpath("    @FindBy(xpath = \"/html/body/div/div/div/nav/div/div/div[2]/div[2]/ul/li[1]/a\")\n")).click();
        System.out.println(4);
    }

    public void click_on_the_contact_us_tab_and_populate_the_required_fields_TC01v2() throws Exception
    {
        global_pageobjects.onClickAction(contactUs,"contac detail screen");
        Thread.sleep(2000);
        global_pageobjects.sendKeys(customerName,"Mothupi","Customer name field");
        global_pageobjects.sendKeys(customerEmailField,"sir.mothupi@greyytechnology.co.za","Customer email field");
        global_pageobjects.sendKeys(mailSubject,"Website Enquiries","mail subject field");
        System.out.println(5);
    }

    public void click_on_the_submit_button_TC01v2() throws Exception
    {
        //global_pageobjects.onClickAction(submitBtn, "submit button");
        webDriver.findElement(xpath("/html/body/div/section[5]/div[2]/div/div/form/div[2]/div/input")).click();
        System.out.println(6);
    }

    public void review_if_form_has_been_successfully_submitted_TC01v2() throws Exception {
        System.out.println(7);


    }
}