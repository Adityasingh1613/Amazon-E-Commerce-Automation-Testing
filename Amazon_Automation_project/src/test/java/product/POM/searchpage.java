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
    WebElement product;


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

    public void getProduct(){
        product.click();
    }

    public WebElement setProduct(){
        return product;
    }

}
