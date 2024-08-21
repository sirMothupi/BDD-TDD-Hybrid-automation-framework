package stepdefinitions;

import global_variables.global_pageobjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Baseclass;

import java.util.concurrent.TimeUnit;

public class stepdef_cart extends Baseclass
{
        Logger logger = LoggerFactory.getLogger("sampleLogger");
        WebDriver driver;
        global_pageobjects globalPageobjects = new global_pageobjects(driver);

    @FindBy(xpath = "//*[@id=\"menu-item-57\"]/a/span")
    public static WebElement myAccountLink;
    @FindBy(xpath = "//*[@id=\"menu-item-51\"]/a/span")
    public static WebElement shopMenuTab;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[3]/a/img")
    public static WebElement wineTab;
    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[2]/a[1]/img")
    public static WebElement pinotageWine;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[2]")
    public static WebElement addToCart;

    @FindBy(xpath = "//*[@i//*[@id=\"post-52\"]/div/div/div[2]/div/div/a")
    public static WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id=\"place_order\"]")
    public static WebElement placeOrder;
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
    @Given("Navigate to the  TC02v2")
    public void navigate_to_the_tc02v2() throws  Exception
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins","ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://eqaroloflow.co.za/wp/ ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeOptions.addArguments("--start-maximized","--incognito","--disable-notifications");
        //String url = "www.eqaroloflow.co.za/wp/";
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"menu-item-57\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("TestUser");
        //global_pageobjects.sendKeys(usernameField,"standard_user", "Username text field");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tester5027#");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
        //global_pageobjects.sendKeys(passwordField,"standard_user", "Password text field");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"menu-item-51\"]/a/span")).click();

        driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[3]/a/img")).click();

        driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[2]/a[1]/img")).click();

        driver.findElement(By.xpath("//*[@id=\"product-125\"]/div[2]/form/button")).click();

        driver.findElement(By.xpath("//*[@id=\"post-52\"]/div/div/div[2]/div/div/a")).click();

        ///driver.findElement(By.xpath("//*[@i//*[@id=\"post-52\"]/div/div/div[2]/div/div/a")).click();

        Thread.sleep(3000);
    }


    @When("Login using username and password TC02v2")
    public void login_using_username_and_password_tc02v2() throws Exception
    {


    }


    @Then("Add sauce labs onesie TC02v2")
    public void add_sauce_labs_onesie_tc02v2() throws Exception
    {


    }


    @Then("Navigate to cart and check out the product TC02v2")
    public void navigate_to_cart_and_check_out_the_product_tc02v2() throws  Exception
    {

    }

    @Then("Populate the required fields TC02v2")
    public void populate_the_required_fields_tc02v2() throws Exception
    {

    }
}
