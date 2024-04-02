import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class KeyFoodsTest extends Base{

    KeyFoodsHomePage keyFoodsHomePage;

    @BeforeMethod
    void starting() {
        openBrowser("https://www.keyfood.com/store/");
        keyFoodsHomePage = PageFactory.initElements(Base.driver, KeyFoodsHomePage.class);
    }

    @AfterMethod
    void finishTest() {
        closeBrowser();
    }

    //Test Case 13 (Test if search bar works)

    @Test
    void searchbox() {
        String key = "Apples";
        keyFoodsHomePage.searchbar(key);
        String expectedURL = "https://keyfoodstores.keyfood.com/store/keyFood/en/search/?text=Apples";
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(key));


    }

    //Test Case 14 (See if Sign in works)
    @Test
    void signin(){
        keyFoodsHomePage.clicksignin();
        String expectedURL = "https://www.keyfood.com/store/keyFood/en/login";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
    }
    //Test Case 15 (Notice Text)
    @Test
    void testNoticeText(){
        String actualText = keyFoodsHomePage.NoticeText();
        Assert.assertEquals(actualText,"Notice of New Online Shopping Feature");
        System.out.println(keyFoodsHomePage.NoticeText());
    }
    //Test Case 16 (Print out top bar)
    @Test
    void testHeaderText() {
        String actualText = keyFoodsHomePage.HeaderText();
        Assert.assertEquals(actualText, "Weekly Circular\n" +
                "Departments\n" +
                "Shop by Aisle\n" +
                "Urban Meadow\n" +
                "Recipes\n" +
                "Digital Coupons\n" +
                "Loyalty Card");
        System.out.println(keyFoodsHomePage.HeaderText());
    }
    //Test Case 17 (Words displayed on footer)
    @Test
    void footertext(){
        String actualText = keyFoodsHomePage.FooterText();
        Assert.assertEquals(actualText,"ABOUT KEY FOOD CO-OP\n" +
                "About Us\n" +
                "Urban Meadow\n" +
                "Customer Service\n" +
                "Careers\n" +
                "News\n" +
                "Contact Us\n" +
                "GETTING STARTED\n" +
                "Store Locator\n" +
                "Product Recalls\n" +
                "Weekly Circular\n" +
                "Recipes\n" +
                "SHOPPING\n" +
                "Shopping Lists\n" +
                "Gift Cards\n" +
                "Learn More About Pricing\n" +
                "Shop With Instacart\n" +
                "Shop With Key Food\n" +
                "Refund & Cancellation Policy\n" +
                "Digital Coupons");
        System.out.println(keyFoodsHomePage.FooterText());
    }
    //Test Case 18 (below header text are valid)
    @Test
    void belowheadtexttest() {
        String actualText = keyFoodsHomePage.belowheaderText();
        Assert.assertEquals(actualText, "Reserve a Time Slot\n" +
                "Cart:\n" +
                "0\n" +
                "Welcome to Key Food!\n" +
                "How are you shopping this week?\n" +
                "In-Store\n" +
                "Pick Up\n" +
                "Delivery");
        System.out.println(keyFoodsHomePage.belowheaderText());
    }

}
