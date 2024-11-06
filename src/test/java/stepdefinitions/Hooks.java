package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Baseclass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class Hooks extends Baseclass
{
    private Set<String> failedSteps = new HashSet<>();
    //static ExcelReportWriter reportWriter = new ExcelReportWriter();
    static String sheetName = getProperties().getProperty("sheetName");

    @BeforeAll
    public static void before_or_after_all() throws Exception
    {
       // FeatureOverride.overrideFeatureFiles(System.getProperty("user.dir")+"src/test/resources/features");
    }

    private WebDriver driver;

    @Before
    public void setUp() {
        // Initialize the WebDriver (Chrome in this example)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        // Take screenshot after each step
        if (scenario.isFailed()) {
            takeScreenshot(scenario.getName());
        }
        driver.quit();
    }

    private void takeScreenshot(String scenarioName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            // Create a directory for screenshots if it doesn't exist
            Path destinationPath = Path.of("screenshots", scenarioName + ".png");
            Files.createDirectories(destinationPath.getParent());
            Files.copy(source.toPath(), destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public WebDriver getDriver()
    {
        return driver;
    }


}
