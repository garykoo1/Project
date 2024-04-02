import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CostcoHomePage extends Base {


    @FindBy(css = "[src=\"/wcsstore/CostcoGLOBALSAS/images/Costco_Logo-1.png\"]")
    WebElement costcohomelogo;

    @FindBy(css = "[class=\"hidden-lg hidden-md hidden-sm hidden-xs\"]")
    WebElement toolbar;

    @FindBy(css = "[class=\"footer-items row gutter\"]")
    WebElement footer;

    @FindBy(css = "[id=\"search-field\"]")
    WebElement costcosearchbar;

    void testcostcolog(){
        costcohomelogo.click();
    }

    String toolbarText() {
        return toolbar.getText();
    }
    String footerText() {
        return footer.getText();
    }
    void testcostcosearchbar(String searchKey) {
        costcosearchbar.sendKeys(searchKey, Keys.ENTER);
    }

}
