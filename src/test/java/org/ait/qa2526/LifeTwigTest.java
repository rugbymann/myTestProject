package org.ait.qa2526;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LifeTwigTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.lifetwig.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
    @Test
    public void LifeTwigTest(){
        System.out.println("Site opened");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
