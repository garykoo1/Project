import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends Base{

    @FindBy(css = "[jscontroller=\"pjICDe\"]")
    WebElement googleiframe;

    @FindBy(css = "[aria-label=\"Stay signed out\"]")
    WebElement staysignedout;

    @FindBy(css = "[aria-label=\"Search\"]")
    WebElement googlesearchbar;

    void testiframe(){
        driver.switchTo().frame("callout");
        staysignedout.click();
    }

    void googlesearchbar(String searchKey) {
        googlesearchbar.sendKeys(searchKey, Keys.ENTER);
    }
}
