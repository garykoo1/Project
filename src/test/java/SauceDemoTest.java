import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;
import java.sql.SQLOutput;

public class SauceDemoTest extends Base{

    SauceDemoHomePage sauceDemoHomePage;

    @BeforeMethod
    void starting(){
        openBrowser("https://www.saucedemo.com/");
        sauceDemoHomePage = PageFactory.initElements(Base.driver, SauceDemoHomePage.class);
    }

    @AfterMethod
    void finishTest() {
        closeBrowser();
    }

    //Test Case 9 (Test Log in)
    @Test
    void login(){
        sauceDemoHomePage.typeusername();
        sauceDemoHomePage.typepassword();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();


    }
    //Test Case 10 (Test add to cart function)
    @Test
    void addtocart(){
        sauceDemoHomePage.typeusername();
        sauceDemoHomePage.typepassword();
        sauceDemoHomePage.clickaddtocart();
        sauceDemoHomePage.clickcartbutton();
        String expectedText = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        String actualText = sauceDemoHomePage.bagdescription();
        Assert.assertEquals(expectedText,actualText);
        System.out.println(sauceDemoHomePage.bagdescription());


    }
    //Test Case 11 (Check if description appears after clicking an item)
    @Test
    void checkdescription(){
        sauceDemoHomePage.typeusername();
        sauceDemoHomePage.typepassword();
        sauceDemoHomePage.clickredshirt();
        String expectedText = "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.";
        String actualText = sauceDemoHomePage.redshirtdescription();
        Assert.assertEquals(expectedText,actualText);
        System.out.println(sauceDemoHomePage.redshirtdescription());

    }
    //Test Case 12 (Check if fleece is clickable)
    @Test
    void testfleece(){
        sauceDemoHomePage.typeusername();
        sauceDemoHomePage.typepassword();
        sauceDemoHomePage.clickfleece();
        String expectedURL = "https://www.saucedemo.com/inventory-item.html?id=5";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }
}
