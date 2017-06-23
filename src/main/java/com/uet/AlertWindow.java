package com.uet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nguye on 6/23/2017.
 */
public class AlertWindow {
    /*
    Show alert message
     */
   public void testAlertWindow() throws InterruptedException {
       System.setProperty("webdriver.gecko.driver", "E:/Setup-Application/geckodriver-v0.17.0-win64/geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       driver.get("http://www.seleniumpoint.com/testwebsite.php");

       //maximize the window
       driver.manage().window().maximize();

       //login to test web site
       driver.findElement(By.id("remail")).sendKeys("test@seleniumpoint.com ");
       driver.findElement(By.id("rpassword")).sendKeys("test@123");
       driver.findElement(By.id("rsubmit")).click();

       Thread.sleep(3000);

       //click on View link of third product to open window: Car Seat
       driver.findElement(By.xpath("//div[@class='product4View']/a")).click();

       Thread.sleep(3000);

       //get alert text
       String alertText=driver.switchTo().alert().getText();
       System.out.println("Alert Text is :" + alertText);

       //Send value to alert
       driver.switchTo().alert().sendKeys("abc@gmail.com");

       //accept alert
       driver.switchTo().alert().accept();

       //close Firefox
       driver.close();
       //dismiss alert
       //driver.switchTo().alert().dismiss();

   }
}
