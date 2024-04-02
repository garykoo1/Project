import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class EbayHomePage extends Base{


    @FindBy(xpath = "/html/body/div[4]/div/header/table/tbody/tr/td/h1/a")
    WebElement ebayhomelogo;

    @FindBy(xpath = "//li[@data-hover-track=\"p4375194.m1386.l6435\"]")
    WebElement businesstab;

    @FindBy(css = "[aria-label=\"Search for anything\"]")
    WebElement searchbar;

    @FindBy(xpath = "//a")
    List<WebElement> links;

    @FindBy(css = "[data-hover-track=\"p4375194.m1382.l6435\"]")
    WebElement homeandgarden;

    @FindBy(css = "[_sp=\"p4375194.m1382.l3257\"]")
    WebElement furniture;

   @FindBy(css = "[aria-label=\"Advanced Search\"]")
   WebElement advanced;

   @FindBy(xpath = "//div[@class=\"field adv-keywords__btn-help\"]/button")
   WebElement search;

   @FindBy(css = "[class=\"gh-sb \"]")
   WebElement dropdown;

   @FindBy(css = "[class=\"btn btn-prim gh-spr\"]")
   WebElement searchbutton;




    void clickLogo(){
        ebayhomelogo.click();
    }
    void clickbusinesstab(){
        businesstab.click();
    }
    void searchbar(String searchKey){
        searchbar.sendKeys(searchKey, Keys.ENTER);
    }
    int allLinks() {
        return links.size();

    }
    void movetoHomeandGarden(){
        Actions action = new Actions(driver);
        action.moveToElement(homeandgarden).perform();
    }
    void clickfurniture(){
        furniture.click();
    }

    void clickadvanced(){
        advanced.click();
    }
    void clicksearch1(){
        search.click();
    }

    void dropdownbooks(){
        Select select = new Select((WebElement) dropdown);
        select.selectByVisibleText("Books");

    }
    void clicksearchbutton(){
        searchbutton.click();
    }




}
