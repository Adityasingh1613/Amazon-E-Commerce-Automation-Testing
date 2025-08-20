package product.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import product.POM.loginpage;
import product.Testbase.Base;
import product.utils.ConfigReader;
import product.utils.screenshotUtil;

public class TC001_LoginTest extends Base{
    private static final Logger logger = LogManager.getLogger(TC001_LoginTest.class);

    @Test
    public void logingTest(){
        logger.info(" ** Starting Test TC001_LoginTest ** ");
        try {
            String baseurl = ConfigReader.getConfig("baseUrl");
            driver.get(baseurl);

            loginpage lp = new loginpage(driver);

            lp.setSingup();

            lp.setEmail();
            logger.info("User Email Id Entered");

            lp.setContinuebtn();

            lp.setPassword();
            logger.info("User Password Entered");

            lp.setSignin();


        }
        catch (Exception e) {
            logger.error("Test Failed", e);

            try {
                screenshotUtil.takescreenshot(driver, "TC001_LoginTest_Failure");
                logger.info("Screenshot captured for failure");
            } catch (Exception io) {
                logger.error("Screenshot capture failed: ", io);
            }

            Assert.fail("Test Failed: " + e.getMessage());
        }

        logger.info("** Finished TC001_LoginTest **");
    }

}
