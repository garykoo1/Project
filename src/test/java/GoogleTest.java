import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest extends Base{

    GoogleHomePage googleHomePage;

    @BeforeMethod
    void starting() {
        openBrowser("https://www.google.com");
        googleHomePage = PageFactory.initElements(Base.driver, GoogleHomePage.class);
    }

    @AfterMethod
    void finishTest() {
        closeBrowser();
    }
    //Test Case 29 (iFrame)
    @Test
    void iframeText(){
        googleHomePage.testiframe();

    }

    //Test Case 30 (Test search bar on google if functional)
    @Test
    void testgooglesearch(){
        String key = "mountains";
        googleHomePage.googlesearchbar(key);
        String expectedURL = "https://www.google.com/search?q=moutains&sca_esv=e57395570566e342&source=hp&ei=SAIMZuKzK8-jptQPgrmpkAI&iflsig=ANes7DEAAAAAZgwQWCOopuHB0kkiY0lQ_XWJtpx8TR8J&ved=0ahUKEwji9-fuy6OFAxXPkYkEHYJcCiIQ4dUDCA8&uact=5&oq=moutains&gs_lp=Egdnd3Mtd2l6Ightb3V0YWluczIWEC4YgAQYigUYDRixAxjHARivARiOBTINEC4YgAQYigUYDRixAzINEAAYgAQYigUYDRixAzIWEC4YgAQYigUYDRixAxiDARjHARjRAzIGEAAYAxgNMg0QABiABBiKBRgNGLEDMgIQJjIJEAAYHhgNGMkDMgsQABiABBiKBRiSAzILEAAYgAQYigUYkgNI9DtQwjVY6jpwAHgAkAEAmAGJAaAB2QWqAQM3LjK4AQPIAQD4AQGYAgmgAv4FqAIKwgIQEAAYAxiPARjlAhjqAhiMA8ICDhAuGIAEGIoFGLEDGIMBwgIOEAAYgAQYigUYsQMYgwHCAhQQLhiABBiKBRixAxiDARjHARjRA8ICERAuGIAEGIoFGLEDGIMBGNQCwgILEAAYgAQYigUYsQPCAgsQLhiABBiKBRixA8ICERAuGIAEGIoFGLEDGMcBGK8BwgILEC4YsQMYgAQYigXCAgQQABgDwgILEAAYgAQYigUYhgPCAgYQABgeGArCAgYQLhgeGArCAgwQLhgeGMcBGNEDGArCAhAQLhiABBiKBRgNGLEDGMkDwgIQEAAYgAQYigUYDRixAxiDAcICEBAuGIAEGIoFGA0YsQMYgwHCAhMQLhiABBiKBRgNGLEDGMcBGK8BmAOLAZIHAzcuMqAH0nc&sclient=gws-wiz";
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(key));
    }




}
