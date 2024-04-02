import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EbayTest extends Base {

    EbayHomePage ebayHomePage;

    @BeforeMethod
    void starting() {
        openBrowser("https://www.ebay.com");
        ebayHomePage = PageFactory.initElements(Base.driver, EbayHomePage.class);
    }

    @AfterMethod
    void finishTest() {
        closeBrowser();
    }

    //Test Case 1 ( Test if by clicking the Ebay home logo will return you to homepage )

    @Test
    void testeBayhomeLogo() {
        ebayHomePage.clickLogo();
        String expectedURL = "https://www.ebay.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }

    //Test Case 2 (Test if clicking Business & Industrial tab will work)

    @Test
    void testBusinessTab() {
        ebayHomePage.clickbusinesstab();
        String expectedURL = "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }

    //Test Case 3 (Test if the URL of typing in iPhone on searchbar)

    @Test
    void searchbox() {
        String key = "iPhone";
        ebayHomePage.searchbar(key);
        String expectedURL = "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2334524.m570.l1313&_nkw=iphone&_sacat=0&_odkw=boots&_osacat=0";
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(key));


    }

    //Test Case 4 (Are there more than 300 links on Ebay?)

    @Test
    void testLinks() {
        Assert.assertTrue(ebayHomePage.allLinks() > 300);


    }

    //Test Case 5 (How many links on the home page of Ebay?)

    @Test
    void howManyLinks(){
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        System.out.println(links.size());

    }

    // Test Case 6 (Does the additional options of Furniture tab open up?)

    @Test
    void testFurniture(){
        ebayHomePage.movetoHomeandGarden();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ebayHomePage.clickfurniture();
        String expectedURL = "https://www.ebay.com/b/Home-Furniture/3197/bn_1642075";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);

    }
    // Test Case 7 (Test if the category dropdown works.)
    @Test
    void advancedpage(){
        ebayHomePage.clickadvanced();
        ebayHomePage.clicksearch1();
        String expectedTitle = "Shop by Category | eBay";
        String actualTitle = driver.getTitle();
    }
    //Test Case 8 (Test Dropdown with Books)
    @Test
    void booksdropdown(){
        ebayHomePage.dropdownbooks();
        ebayHomePage.clicksearchbutton();
        String expectedURL = "https://www.ebay.com/b/Books-Magazines/267/bn_1854946";
        String actualURL = driver.getCurrentUrl();
    }






}

