import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyFoodsHomePage extends Base{

    @FindBy(css = "[id=\"js-site-search-input\"]")
    WebElement searchbar;

    @FindBy(css = "[data-role=\"Sign in / Register\"]")
    WebElement signin;

    @FindBy(css = "[rel=\"nofollow\"]")
    WebElement notice;

    @FindBy(css = "[class=\"nav__bottom\"]")
    WebElement header;

    @FindBy(css = "[class=\"footer__top\"]")
    WebElement footer;

    @FindBy(css = "[class=\"header-nav\"]")
    WebElement belowheader;

    void searchbar(String searchKey){
        searchbar.sendKeys(searchKey, Keys.ENTER);

    }

    void clicksignin(){
        signin.click();
    }

    String NoticeText(){
        return notice.getText();

    }
    String HeaderText() {
        return header.getText();
    }
    String FooterText() {
        return footer.getText();
    }
    String belowheaderText() {
        return belowheader.getText();
    }

}
