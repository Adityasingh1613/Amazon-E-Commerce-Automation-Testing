package product.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class searchpage extends basepage{

    public searchpage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchbox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement searchbtn;

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    WebElement catagoery;

    @FindBy(xpath = "//h2[@aria-label='iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Natural Titanium']")
    WebElement Iphone;

    @FindBy(xpath = "//div[@class='puis-card-container s-card-container s-overflow-hidden aok-relative puis-expand-height puis-include-content-margin puis puis-v2dedio7i062j12oa38qtc8evog s-latency-cf-section puis-card-border']//h2[@aria-label='Sponsored Ad - Oral-B iO3 Ultimate Electric Toothbrush, 3 Smart Modes, Pressure Sensor,2 Year Warranty by Oral B, IPX7 Waterproof, Round Brush Head (Ice Blue)']")
    WebElement brush;

    @FindBy(xpath = "//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")
    WebElement addtocart;

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    WebElement Amazon;


    public void setSearchbox(String product) {
        searchbox.sendKeys(product);
    }

    public void setSearchbtn(){
        searchbtn.click();
    }

    public void setCatagoery(String catog){
        Select s = new Select(catagoery);
        s.selectByVisibleText(catog);
    }

    public void getIphone(){
        Iphone.click();
    }

    public WebElement setIphone(){
        return Iphone;
    }

    public void setAddtocart(){
        addtocart.click();
    }

    public WebElement setBrush(){
        return brush;
    }

    public void getBrush(){
        brush.click();
    }

    public void setAmazon(){
        Amazon.click();
    }

}
