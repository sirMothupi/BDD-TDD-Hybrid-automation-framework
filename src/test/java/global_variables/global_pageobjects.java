package global_variables;

import net.serenitybdd.screenplay.ui.Select;
import org.htmlunit.javascript.background.JavaScriptExecutor;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Baseclass;
import utils.DriverManager;

import java.time.Duration;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import static org.openqa.selenium.By.xpath;


public class global_pageobjects extends Baseclass {
    global_pageobjects gbPageObject;
    DriverManager driverManager;

    //DriverManager driverManager = new DriverManager();

    //wait until an element is visible function
    public static void waitUntilElementIsVisible(WebElement webElement)
    {
        Wait<WebDriver> wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));
        /*public static WebElement waitForElementClickable(By by)
        {
            try
            {        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.WAIT_EXPLICIT), Duration.ofMillis(500));
                return wait.until(ExpectedConditions.elementToBeClickable(by));
            }
            catch (Throwable error)
            {        LogUtils.error("❌ Timeout waiting for the element ready to click. " + by.toString());
                Assert.fail("❌ Timeout waiting for the element ready to click. " + by.toString());
            }
            return null;
        }*/
        //wait.until(ExpectedCondition.visibilityOf(webElement));
    }

    public global_pageobjects()
    {
    }
    public static void onClickAction (WebElement webElement, String fieldName) throws Exception
    {
        try
        {
            waitUntilElementIsVisible(webElement);
            webElement.click();
            Thread.sleep(2000);
            System.out.println("Action clicked successfully" + fieldName);
        }
        catch (Exception exception)
        {
            throw new Exception(fieldName + "action button not found or not clickable");
        }
    }
    //populate fields, text box or text areas action key
    public static void sendKeys(WebElement webElement, String inputText, String fieldName) throws Exception {
        System.out.println("input keys:" + inputText);
        try {
            if (!inputText.trim().isEmpty()) {
                waitUntilElementIsVisible(webElement);
                webElement.clear();
                webElement.sendKeys(inputText);
            }
        } catch (Exception exc) {
            System.out.println("Input Error:" + exc.getMessage());
            throw exc;
        }
        Thread.sleep(2000);
    }

    public static void onClickAction () throws Exception
    {
        try
        {
            //waitUntilElementIsVisible();
            Thread.sleep(2000);
            System.out.println("-------------------element clicked successfully-------------------" );
        }
        catch (Exception exception)
        {
            throw new Exception("Item not found or not clickable");
        }
    }

    //select text keys or values in a drop-down box
    public static void selectTextKeys(WebElement webElement, String textToSelect, String fieldName) throws Exception {
        if (textToSelect.length() > 0) {
            waitUntilElementIsVisible(webElement);
            if (webElement.isEnabled()) {
                webElement.clear();
                Thread.sleep(2000);
                webElement.sendKeys(textToSelect);
                Thread.sleep(2000);
                webElement.click();
                if (webElement.getAttribute("title").contains("Didn't match any item")) {
                    throw new Exception(textToSelect + "is not on the drop down list for" + fieldName);
                }

                List<WebElement> rows = webElement.findElements(xpath("//*[contains(text(),'" + textToSelect + "')]"));
                for (WebElement row : rows) {
                    if (row.getText().contains(textToSelect)) {
                        row.click();
                        Thread.sleep(2000);
                        break;
                    }
                }
            } else {
                throw new Exception(webElement + "is NOT enabled for editing");
            }
        }
    }

    //select text keys in a drop-down box
    public static void selectKeys(WebElement webElement, String inputText, String fieldName) {
        System.out.println("input Keys :  " + inputText);
        try {
            waitUntilElementIsVisible(webElement);
            if (!inputText.isEmpty()) {
                Select drop = new Select();
                drop.equals(inputText);
                System.out.println("Text selected : " + inputText);
            }
        } catch (Exception exc) {
            throw exc;
        }
    }

    //On Click method and action item
    public static void clickElement(String xpathElements, String fieldName) throws Exception {
        System.out.println("----------------On click function for site web elemments----------------|" + xpathElements + " | " + fieldName + "------------");
        System.out.println(xpathElements);

        WebElement item = getWebDriver().findElement(xpath(xpathElements));
        //WebElement item = xpath(xpathElements).findElements(getWebDriver());

        System.out.println("Item name :" + fieldName);
        int Counter = 0;
        do {
            try {
                item.click();
                break;
            } catch (Exception exc) {
                System.out.println("Count :" + Counter + "::");
                System.out.println("Click element error:" + exc.getMessage());
                Counter = Counter + 1;
            }
        }
        while (Counter <= 5);
    }

    //Switch frame method (pop up windows on top of a container
    public static int switchFrameByNumber(String frameHeaderName) {
        System.out.println("Frame data by text :" + frameHeaderName);
        int size = 30;
        System.out.println("Frame count :" + size);
        int currentFrame = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("frame count:" + i);
            try {
                System.out.println("frame number to view :" + frameHeaderName);
                getWebDriver().switchTo().frame(i);
                if (getWebDriver().findElement(xpath("//*contains(text()'" + frameHeaderName + "')]")).getText().equalsIgnoreCase(frameHeaderName)) {
                    System.out.println("Opened frame number:" + i);
                    System.out.println("Frame found :" + frameHeaderName);
                    currentFrame = i;
                    break;
                }
                //else
                {
                    SwitchToDefault();
                }
            } catch (Exception exc) {
                System.err.println("Frame Error :" + exc.getMessage());
                SwitchToDefault();
            }

        }
        return currentFrame;
    }

    //Scroll up function
   /* public static void scrollUp() throws Exception
    {
        JavaScriptExecutor js = (JavaScriptExecutor) getWebDriver();
        js.executeScript("window.scrollTo(document.body.scrollHieght,0)");
        Thread.sleep(2000);
    }*/

   /* public static void scrollUp() throws Exception
    {
        JavaScriptExecutor js = (JavaScriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,-250)","");
        Thread.sleep(2000);
    }*/

    /*public static void scrollDownTo(String yCoordinates) throws Exception
    {
        JavaScriptExecutor js = (JavaScriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0," + yCoordinates + ")","");
        Thread.sleep(2000);
    }*/

    //Switching frame back to the normal windoe
    private static void SwitchToDefault() {
        getWebDriver().switchTo().defaultContent();
        System.out.println("--Switched to default content");
    }

    //Swithing back to an active window
    public static void switchToActiveElement() {
        getWebDriver().switchTo().activeElement();
        System.out.println("--Switched to default content");
    }

    //closing browser
    public static void closeBrowserWindow() {
        try {
            getWebDriver().close();
        } catch (Exception exc) {
            System.out.println("Browser closed successfully" + exc.getMessage());
        }
    }

    //select year on the calendar box
    public static void selectYear(String Xpath, String fieldName) throws Exception {
        System.out.println("Item name" + fieldName);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        System.out.println("get instance" + calendar);
        int yearInt = calendar.get(Calendar.YEAR);
        System.out.println("Year :" + yearInt);
        global_pageobjects.clickElement(Xpath, "Calendar Icon");
        global_pageobjects.clickElement("//span[text()=\"" + yearInt + "\"]", "select year");
    }

    public static void switchFrameToAny(String frameHeader)
    {
        System.out.println("----------------witness the magic of switching to multiple frames----------------" + frameHeader + "Test i frame");
        System.out.println("iFrame data  :" + frameHeader);
        int size = getWebDriver().findElements(net.serenitybdd.core.annotations.findby.By.tagName("iframe")).size();
        System.out.println("Frame Count :" + size);
        int currentFrame = 0;
        for (int i = 0; i < size; i++) ;

        int i = 0;

        System.out.println("---------" + i);
        try {
            System.out.println("iFrame to view  :" + i);
            if (getWebDriver().findElement(xpath("//*[contains(text(),'" + frameHeader + "')]")).getText().equalsIgnoreCase(frameHeader)) {
                System.out.println("----------------iFrame is found...---------------- " + i);
                System.out.println("----------------ans iFrame found is:----------------" + frameHeader);
                currentFrame = i;
                //break;
            } else
                SwitchToDefault();
        } catch (Exception exc) {
            System.err.println("Frame Error : " + exc.getMessage());
        }

    }

    public static WebDriver getWebDriver() {
        WebDriver webdriver;
        webdriver = webDriver;
        return webdriver;
    }

    public static String getText(WebElement webElement, String fieldname) throws Exception
    {
        String elementText = null;
        waitUntilElementIsVisible(webElement);
        System.out.println("---------get text from---------" + fieldname);
        try {
            if(!webElement.getText().equals(" ") && webElement.getText() != null)
            {
                elementText = webElement.getText();
            }
            else if (webElement.getText().equals(" ") || webElement.getText() == null)
            {
                throw new Exception("Text Retrieved : is..." + webElement.getText() + "for.." + fieldname);
            }
        }catch (Exception exception)
        {
            throw new Exception("Text Retrieved :" + webElement.getText());
        }
        return elementText;
    }

    //Scroll up to a certain degree on the screen
    public static void scrollUpTo() throws InterruptedException {
        JavaScriptExecutor js = (JavaScriptExecutor) getWebDriver();
        js.toString();
        System.out.println("[scroll up -250 height]");
        Thread.sleep(2000);
    }

}
