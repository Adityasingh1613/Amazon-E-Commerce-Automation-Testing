package product.Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import product.Base.base;
import product.PageObject.PO_login;

public class TC001_login extends base {

    @Test
    void test(){
        driver.get("https://practicetestautomation.com/practice-test-login/");

        PO_login p = new PO_login(driver);

        p.setUserid("student");
        p.setPassword("Password123");
        p.btn();
    }
}
