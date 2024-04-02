import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CostcoTest extends Base{

    CostcoHomePage costcoHomepage;

    @BeforeMethod
    void starting() {
        openBrowser("https://www.costco.com");
        costcoHomepage  = PageFactory.initElements(Base.driver, CostcoHomePage.class);
    }

    @AfterMethod
    void finishTest() {
        closeBrowser();
    }

    //Test Case 25 (Test if clicking Costco Logo will bring you back home page)
    @Test
    void testcostcoLogo() {
        costcoHomepage.testcostcolog();
        String expectedURL = "https://www.costco.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
    //Test Case 26 (Top Bar Display)
    @Test
    void testtoolbarText(){
        String actualText = costcoHomepage.toolbarText();
        Assert.assertEquals(actualText," Shop Grocery\n"+
                "Same-Day\n"+
                "Deals\n"+
                "Business Delivery\n"+
                "Optical\n"+
                "Pharmacy\n"+
                "Services\n"+
                "Photo\n"+
                "Travel\n"+
                "Membership\n"+
                "Locations");
        System.out.println(costcoHomepage.toolbarText());
    }
    //Test Case 27
    @Test
    void testfooterText(){
        String actualText = costcoHomepage.toolbarText();
        System.out.println(costcoHomepage.footerText());
     }
    //Test Case 28
    @Test
    void testsearchbar() {
        String key = "Boots";
        costcoHomepage.testcostcosearchbar(key);
        String expectedURL = "https://www.costco.com/CatalogSearch?dept=All&keyword=Boots";
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(key));
    }
}
