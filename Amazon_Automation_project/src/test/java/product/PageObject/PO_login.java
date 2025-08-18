package product.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import product.Base.base;

public class PO_login extends base {
    public PO_login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "username")
    private WebElement userid;

    @FindBy(id = "password")
    private WebElement userpass;

    @FindBy (id = "submit")
    private WebElement loginbutton;


    public void setUserid(String uid){
        userid.sendKeys(uid);
    }

    public void setPassword(String pass){
        userpass.sendKeys(pass);
    }

    public void btn(){
        loginbutton.click();
    }


}
