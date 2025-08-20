package product.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class searchpage extends basepage{

    public searchpage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "")
    WebElement searchbox;

    @FindBy(xpath = "")
    WebElement searchbtn;

    @FindBy(xpath = "")
    WebElement catagoery;


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

}
