package product.Test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import product.POM.searchpage;
import product.Testbase.Base;

public class TC002_SearchIteam extends Base{

    private static final Logger logger = LogManager.getLogger(TC002_SearchIteam.class);

    @Test
    public void SearchTest(){
        logger.info(" ** Starting Test TC002_SearchItem ** ");

        searchpage sp = new searchpage(driver);


    }
}
