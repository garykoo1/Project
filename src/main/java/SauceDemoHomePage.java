import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoHomePage extends Base{

    @FindBy(css = "[id=\"user-name\"]")
    WebElement username;

    @FindBy(css = "[data-test=\"password\"]")
    WebElement password;

    @FindBy(css = "[name=\"login-button\"]")
    WebElement loginbutton;

    @FindBy(css = "[id=\"add-to-cart-sauce-labs-backpack\"]")
    WebElement bagaddtocart;

    @FindBy(css = "[data-test=\"shopping-cart-link\"]")
    WebElement cartbutton;

    @FindBy(css = "[class=\"inventory_item_desc\"]")
    WebElement bagdescription;

    @FindBy(css = "[id=\"item_3_title_link\"]")
    WebElement redshirt;

    @FindBy(css = "[class=\"inventory_details_desc large_size\"]")
    WebElement redshirtdescription;

    @FindBy(css = "[id=\"item_5_title_link\"]")
    WebElement fleece;



    void typeusername(){
        username.sendKeys("standard_user");
    }

    void typepassword(){
         password.sendKeys("secret_sauce", Keys.ENTER);
    }

    void clickloginbutton(){
         loginbutton.click();
    }

    void clickaddtocart(){
        bagaddtocart.click();
    }

    void clickcartbutton(){
        cartbutton.click();
    }

    String bagdescription() {
        String cart = bagdescription.getText();
        return cart;

    }
    void clickredshirt(){
        redshirt.click();
    }

    String redshirtdescription(){
        String cart = redshirtdescription.getText();
        return cart;
    }
    void clickfleece(){
        fleece.click();
    }
}


