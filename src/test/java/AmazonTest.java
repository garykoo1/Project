import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest extends Base{

    AmazonHomePage amazonHomePage;

    @BeforeMethod
    void starting() {
        openBrowser("https://www.amazon.com");
        amazonHomePage = PageFactory.initElements(Base.driver, AmazonHomePage.class);
    }

    @AfterMethod
    void finishTest() {
        closeBrowser();
    }

    //Test Case 19 (Test if the Amazon Logo properly returns you to homepage)
    @Test
    void testingAmazonLogo() {
        amazonHomePage.clickamazonlogo();
        String expectedURL = "https://www.amazon.com/ref=nav_logo";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
    //Test Case 20 (If the text applies to nav bar)
    @Test
    void testnavbarText(){
        String actualText = amazonHomePage.topbarText();
        Assert.assertEquals(actualText,"All\n" +
                "Medical Care\n" +
                "Groceries\n" +
                "Best Sellers\n" +
                "Amazon Basics\n" +
                "New Releases\n" +
                "Prime\n" +
                "Music\n" +
                "Today's Deals\n" +
                "Customer Service\n" +
                "Amazon Home\n" +
                "Registry\n" +
                "Books");
        System.out.println(amazonHomePage.topbarText());
    }
    //Test Case 21 (See if the best seller function works)
    @Test
    void testbestseller() {
        amazonHomePage.clickbestsellers();
        String expectedURL = "https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
    //Test Case 22 (See if search bar is functional)
    @Test
    void testsearchbox() {
        String key = "Boots";
        amazonHomePage.amazonsearchbar(key);
        String expectedURL = "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2334524.m570.l1313&_nkw=iphone&_sacat=0&_odkw=boots&_osacat=0";
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(key));
    }
    //Test Case 23 (Test if  prime works )
    @Test
    void testprime(){
        amazonHomePage.testprimelink();
        String expectURL = "https://www.amazon.com/amazonprime?ref=nav_menu_greenbg_rocketman_unrec_cta";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectURL,actualURL);

    }
    //Test Case 24 (More thank 300 links?)
    @Test
    void testLinks() {
        Assert.assertTrue(amazonHomePage.allLinkss() < 300);
    }
}
