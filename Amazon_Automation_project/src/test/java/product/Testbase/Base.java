package product.Testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import product.utils.ConfigReader;
import product.utils.screenshotUtil;

import java.io.IOException;
import java.time.Duration;

public class Base {
    protected static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        String browser = ConfigReader.getConfig("browser");
        String baseUrl = ConfigReader.getConfig("baseUrl");

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\ADITYA SINGH\\OneDrive\\Desktop\\Testing\\automation\\chrome driver\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver",
                    "C:\\Users\\ADITYA SINGH\\OneDrive\\Desktop\\Testing\\automation\\edge driver\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Invalid browser in config.properties: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get(baseUrl);
    }

    @AfterMethod
    public void captureFailureScreenshot(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            try {
                screenshotUtil.takescreenshot(driver, result.getName() + "_Failure");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
