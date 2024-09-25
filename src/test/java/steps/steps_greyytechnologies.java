package steps;

import net.serenitybdd.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Baseclass;

import java.util.concurrent.TimeUnit;

import static utils.Baseclass.getWebDriver;

public class steps_greyytechnologies extends Baseclass {
    Logger logger = LoggerFactory.getLogger("sampleLogger");

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    public static WebElement usernameField;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public static WebElement passwordField;
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
        System.setProperty("webdriver.chrome.driver","src/test/resources/webdriver/chromedriver.app");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins","ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(chromeOptions);
        String url = "www.greyytechnologies.co.za";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeOptions.addArguments("--start-maximized","--incognito","--disable-notifications");
        String strUrl = driver.getCurrentUrl();
        System.out.println("Current url is:" + strUrl);
        System.out.println(2);
    }

    public void click_on_the_home_tab_TC01v2() throws Exception {
        System.out.println(3);
    }

    public void click_on_the_services_tab_TC01v2() throws Exception {
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
