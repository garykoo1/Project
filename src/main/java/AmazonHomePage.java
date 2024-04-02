import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonHomePage extends Base{

    @FindBy(css = "[id=\"nav-logo-sprites\"]")
    WebElement amazonhomelogo;

    @FindBy(css = "[id=\"nav-main\"]")
    WebElement topbar;

    @FindBy(css = "[data-csa-c-content-id=\"nav_cs_bestsellers\"]")
    WebElement bestsellers;

    @FindBy(css = "[placeholder=\"Search Amazon\"]")
    WebElement amazonsearchbar;

    @FindBy(css = "[data-csa-c-slot-id=\"nav-link-amazonprime\"]")
    WebElement prime;

    @FindBy(css = "[href=\"/gp/prime/?ref=nav_menu_greenbg_rocketman_unrec_cta\"]")
    WebElement tryprime;

    @FindBy(xpath = "//a")
    List<WebElement> links;

    void clickamazonlogo(){
        amazonhomelogo.click();
    }
    String topbarText() {
        return topbar.getText();
    }
    void clickbestsellers(){
        bestsellers.click();
    }
    void amazonsearchbar(String searchKey) {
        amazonsearchbar.sendKeys(searchKey, Keys.ENTER);
    }
    void testprimelink(){
        Actions action = new Actions(driver);
        action.moveToElement(prime).perform();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        tryprime.click();

    }
    int allLinkss() {
        return links.size();
    }
}
