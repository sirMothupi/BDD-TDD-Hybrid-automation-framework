package steps;

import global_variables.global_pageobjects;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Baseclass;

import java.util.concurrent.TimeUnit;

public class steps_login extends Baseclass
{
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
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[7]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/button")
    public static WebElement signUpBtn;


    @Step
    public static void openUrl(String url)
    {
        webDriver.get(url);
        webDriver.manage().window().maximize();

    }
    public void Navigate_to_url_TC01v2() throws Exception
    {
        /*webDriver = new ChromeDriver();
        webDriver.get("testurl");
        webDriver.manage().window().maximize();*/

        //Hardcoding url launch method
        System.setProperty("webdriver.chrome.driver","src/test/resources/webdriver/chromedriver.app");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins","ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(chromeOptions);
        String url = "https://www.investec.com/en_za/focus/money/understanding-interest-rates.html";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeOptions.addArguments("--start-maximized","--incognito","--disable-notifications");
        String strUrl = driver.getCurrentUrl();
        System.out.println("Current url is:" + strUrl);

        /*openUrl(getProperties().getProperty("testurl").replace("#", getProperties().getProperty("username"))
                .replace("", getProperties().getProperty("password")));*/
        System.out.println(2);
    }

    public void Login_using_username_as_standarduser_and_password_as_secretsauce_TC01v2() throws Exception
    {

        global_pageobjects.sendKeys(usernameField,"standard_user", "Username text field");
        Thread.sleep(1000);
        global_pageobjects.sendKeys(passwordField,"standard_user", "Password text field");
        Thread.sleep(2000);

        System.out.println(3);
    }

    public void Add_Sauce_Labs_Onesie_to_the_cart_TC01v2() throws Exception
    {
        global_pageobjects.clickElement(String.valueOf(btnAddsauceLabsOnesie),"Add to cart button");
        System.out.println(4);
    }

    public void Navigate_to_Cart_and_checkout_the_product_TC01v2() throws Exception
    {
        global_pageobjects.clickElement(String.valueOf(cartImagIcon),"Cart Image Icon");
        System.out.println("----------------Able to view and validate items in cart----------------");
        global_pageobjects.clickElement(String.valueOf(buttonCheckout),"checkout button");
        System.out.println(5);
    }

    public void Enter_first_name_last_name_postal_code_and_click_Continue_TC01v2() throws Exception
    {
        global_pageobjects.sendKeys(customerName,"Mothupi","customer name field");
        Thread.sleep(1000);
        global_pageobjects.sendKeys(customerSurname,"Ramalepe","customer surname field");
        Thread.sleep(1000);
        global_pageobjects.sendKeys(customerAddress,"83 Colleen Rd, Honeypark","customer address field");
        Thread.sleep(2000);
        global_pageobjects.clickElement(String.valueOf(buttonContinue),"continue to check out button");
        Thread.sleep(2000);
        global_pageobjects.clickElement(String.valueOf(buttonFinish),"Complete transaction");
        System.out.println(6);
    }

    public void Read_SauceCard_number_under_Payment_Information_and_print_it_in_console_TC01v2() throws Exception
    {
        //get order number
        String text = webDriver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
        System.out.println("Your order number is:" + text);
        System.out.println(7);
    }
}
