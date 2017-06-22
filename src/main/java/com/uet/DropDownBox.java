package com.uet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by nguye on 6/22/2017.
 */
public class DropDownBox {
    public void test(){
        System.setProperty("webdriver.gecko.driver", "E:/Setup-Application/geckodriver-v0.17.0-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://only-testing-blog.blogspot.in/2013/09/test.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Select select = new Select(driver.findElement(By.xpath("//*[@name=combo_box]/../select")));
//        select.selectByVisibleText("Saab");
//        select.selectByIndex(2);
        select.selectByValue("UK");
    }
}
