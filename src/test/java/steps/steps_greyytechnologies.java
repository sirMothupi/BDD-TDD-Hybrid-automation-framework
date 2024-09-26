package steps;

import global_variables.global_pageobjects;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Baseclass;

import static global_variables.global_pageobjects.clickElement;

public class steps_greyytechnologies extends Baseclass {
    Logger logger = LoggerFactory.getLogger("sampleLogger");
    StringBuffer verifyErrors = new StringBuffer();
    global_pageobjects pageobjects = new global_pageobjects();
    @FindBy(xpath = "/html/body/div/div/div/nav/div/div/div[2]/div[2]/ul/li[1]/a")
    public static String homeTab;
    @FindBy(xpath = "/html/body/div/div/div/nav/div/div/div[2]/div[2]/ul/li[2]/a")
    public static String aboutUsTab;
    @FindBy(xpath = "//*[@id=\"login-button\"]")
    public static WebElement buttonLogin;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
    public static WebElement btnAddsauceLabsOnesie;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    public static WebElement cartImagIcon;
    @FindBy(xpath = "//*[@id=\"checkout\"]")
    public static WebElement buttonCheckout;
    @FindBy(xpath = "//*[@id=\"first-name\"]")
    public static WebElement customerName;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    public static WebElement customerSurname;
    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    public static WebElement customerAddress;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    public static WebElement buttonContinue;
    @FindBy(xpath = "//*[@id=\"finish\"]")
    public static WebElement buttonFinish;
    @FindBy(xpath = "//*[@id=\"back-to-products\"]")
    public static WebElement buttonBack;

    @Step
    public static void openUrl(String url)
    {
        webDriver.get(url);
        webDriver.manage().window().maximize();

    }

    public void Navigate_to_the_greyy_technologies_url_TC01v2() throws Exception
    {
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(2000);
        driver.get("https://greyytechnologies.co.za/");
    }

    public void click_on_the_home_tab_TC01v2() throws Exception
    {
        Thread.sleep(2000);
        global_pageobjects.clickElement(homeTab, "home tab");
        System.out.println(3);
    }

    public void click_on_the_services_tab_TC01v2() throws Exception
    {

        System.out.println(4);
    }

    public void click_on_the_contact_us_tab_and_populate_the_required_fields_TC01v2() throws Exception {
        System.out.println(5);
    }

    public void click_on_the_submit_button_TC01v2() throws Exception {
        System.out.println(6);
    }

    public void review_if_form_has_been_successfully_submitted_TC01v2() throws Exception {
        System.out.println(7);
    }

}
