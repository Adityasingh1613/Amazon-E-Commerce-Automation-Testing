package product.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import product.POM.cartpage;
import product.Testbase.Base;
import product.utils.screenshotUtil;

public class TC003_CartTest extends Base {
    private static final Logger logger = LogManager.getLogger(TC003_CartTest.class);

    public void carttest(){
        logger.info(" ** Starting Test TC003_CartTest ** ");

        try{
            cartpage cp = new cartpage(driver);


        }
        catch (Exception e) {
            logger.error("Test Failed", e);

            try {
                screenshotUtil.takescreenshot(driver, "TC003_CartTest_Failure");
                logger.info("Screenshot captured for failure");
            } catch (Exception io) {
                logger.error("Screenshot capture failed: ", io);
            }

            Assert.fail("Test Failed: " + e.getMessage());
        }

        logger.info("** Finished TC003_CartTest **");

    }


}
