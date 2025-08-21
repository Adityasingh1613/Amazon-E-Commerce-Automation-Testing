package product.POM;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartpage extends basepage{

    private static final Logger logger = LogManager.getLogger(cartpage.class);

    public cartpage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[@class='nav-cart-icon nav-sprite']")
    WebElement cart;

    @FindBy(xpath = "//span[@class='a-icon a-icon-small-add']")
    WebElement quantitybrush;

    public void setCart(){
        cart.click();
    }

    public void setQuantitybrush(){
        quantitybrush.click();
    }
}
