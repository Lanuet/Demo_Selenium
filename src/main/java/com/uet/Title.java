package com.uet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nguye on 6/22/2017.
 */
public class Title {
    public void getTitle() {
        System.setProperty("webdriver.gecko.driver", "E:/Setup-Application/geckodriver-v0.17.0-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://github.com";
        String expectedTitel = "GitHub";
        String actualTitle = "";
        //launch Firefox and open URl
        driver.get(baseUrl);
        //get actualTitle
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        //compare actualTitle with expected Title
        if (actualTitle.contentEquals(expectedTitel)) {
            System.out.println("Passed");
        } else System.out.println("Fail");
        driver.close();
    }
}
