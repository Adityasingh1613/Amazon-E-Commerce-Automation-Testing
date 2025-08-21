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

public class TC002_SearchProduct extends Base {

    private static final Logger logger = LogManager.getLogger(TC002_SearchProduct.class);

    @Test
    public void SearchTest() throws InterruptedException{
        logger.info(" ** Starting Test TC002_SearchProduct ** ");

        try {
            searchpage sp = new searchpage(driver);

            sp.setCatagoery("Electronics");
            logger.info("Set Category to Electronics");

            sp.setSearchbox("Iphone 16 Pro Max 128 gb");
            logger.info("Searched product Iphone in the search Box");

            sp.setSearchbtn();

            Actions act = new Actions(driver);
            act.moveToElement(sp.setIphone()).perform();
            logger.info("Scrolled to the Product using Action class");

            sp.getIphone();
            logger.info("Clicked on the product");

            sp.setAddtocart();
            logger.info("Product added to the Cart");


            sp.setAmazon();
            logger.info("Clicked Home Page Button");

            sp.setSearchbox("Electric ToothBrush");
            logger.info("Search for electric toothbrush");

            sp.setSearchbtn();
            act.moveToElement(sp.setBrush()).perform();
            logger.info("Scrolled to the Product using Action class");

            sp.getBrush();
            logger.info("Clicked on the product");

            sp.setAddtocart();
            logger.info("Product added to the Cart");

            Thread.sleep(1000);


        } catch (Exception e) {
            logger.error("Test Failed due to exception: ", e);

            try {
                screenshotUtil.takescreenshot(driver, "TC002_SearchProduct_Failure");
                logger.info("Screenshot captured for failure");
            } catch (IOException io) {
                logger.error("Screenshot capture failed: ", io);
            }
            e.printStackTrace();
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }
        logger.info("** Finished TC002_SearchProduct **");
    }
}