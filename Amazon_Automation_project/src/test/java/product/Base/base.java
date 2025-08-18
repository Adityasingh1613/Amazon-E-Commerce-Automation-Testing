package product.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class base {
    protected WebDriver driver;

    @BeforeClass
    public void setDriver(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\ADITYA SINGH\\OneDrive\\Desktop\\Testing\\automation\\edge driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterClass
   public  void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
