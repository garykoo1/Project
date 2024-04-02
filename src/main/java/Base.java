import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    static WebDriver driver;

    void openBrowser(String url){
        driver = new ChromeDriver();
        driver.get(url);
    }

    void closeBrowser(){
        driver.quit();
    }
}
