package product.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import product.POM.searchpage;
import product.Testbase.Base;
import product.utils.screenshotUtil;

import java.io.IOException;

public class TC003_ElectricToothbrush extends Base {
    private static final Logger logger = LogManager.getLogger(TC003_ElectricToothbrush.class);

    @Test
    public void burshsearch() throws InterruptedException{
        logger.info("** Strating Test TC003_ElectricToothbrush **");

        try{
            searchpage sp = new searchpage(driver);

            sp.setSearchbox("Electric ToothBrush");
            logger.info("Search for electric toothbrush");

            sp.setSearchbtn();

            Actions act = new Actions(driver);
            act.moveToElement(sp.setBrush()).perform();
            logger.info("Scrolled to the Product using Action class");

            sp.getBrush();
            logger.info("Clicked on the product");

            sp.setAddtocart();
            logger.info("Product added to the Cart");

            Thread.sleep(5000);


        }catch (Exception e){
            logger.error("Test Failed due to exception: ", e);

            try {
                screenshotUtil.takescreenshot(driver, "TC003_ElectricToothbrush_Failure");
                logger.info("Screenshot captured for failure");
            } catch (IOException io) {
                logger.error("Screenshot capture failed: ", io);
            }
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }

        logger.info("Finished TC003_ElectricToothbrush ");
    }
}
