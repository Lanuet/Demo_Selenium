import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by nguye on 6/22/2017.
 */
public class Application {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E:/Setup-Application/geckodriver-v0.17.0-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }
}
