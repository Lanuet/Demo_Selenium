import com.uet.DropDownBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nguye on 6/22/2017.
 */
public class Application {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E:/Setup-Application/geckodriver-v0.17.0-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/"); //launch Firefox and open Url
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']")); //find element by path
        element.sendKeys("abc@gmail.com"); //send text to textbox
        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']")); //find element by xpath - name
        button.click(); //click button to verify email
        driver.navigate().back(); //back to home
        driver.close(); //close firefox

//        Title title = new Title();
//        title.getTitle();

//        DropDownBox dropDownBox = new DropDownBox();
//        dropDownBox.test();

    }
}
