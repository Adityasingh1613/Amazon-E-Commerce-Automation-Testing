package product.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import product.utils.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class loginpage extends basepage{

    private static final Logger logger = LogManager.getLogger(loginpage.class);

    public loginpage(WebDriver driver){
        super(driver);
    };


@FindBy (xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    WebElement singup;

@FindBy(xpath = "//input[@id='ap_email_login']")
    WebElement email;

@FindBy (xpath = "//input[@type='submit']")
    WebElement Continuebtn;

@FindBy(xpath = "//input[@id='ap_password']")
    WebElement password;

@FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement signin;

public void setSingup(){
    singup.click();
}

public void setEmail(){
    String mail = ConfigReader.getCredential("email");
    email.sendKeys(mail);
}

public void setContinuebtn(){
    Continuebtn.click();
}

public void setPassword(){
    String pwd = ConfigReader.getCredential("password");
    password.sendKeys(pwd);
}

public void setSignin(){
    signin.click();
}

}
