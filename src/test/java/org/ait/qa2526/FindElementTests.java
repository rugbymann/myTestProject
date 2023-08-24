package org.ait.qa2526;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementTests {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        //maximize browser window
        driver.manage().window().maximize();
        //set implicit timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public  void findElementTest(){
        //find element by tag name
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());
        //find list of elements
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
        //find element by ID
        driver.findElement(By.id("city"));
        //find element by class name
        driver.findElement(By.className("search-container"));
        //find element by name
        driver.findElement(By.name("viewport"));
        //find element by link text
        driver.findElement(By.linkText("Let the car work"));
        //find element by link partialLinkText
        driver.findElement(By.partialLinkText("work"));
        //css - contains(*)
        driver.findElement(By.cssSelector("[class*='pristine']"));


    }
    @Test
    public void findElementByCssTest() {
        //css = tag
        driver.findElement(By.cssSelector("h1"));
        //id -> css(#)
        driver.findElement(By.cssSelector("#city"));
        //class name -> css(.)
        driver.findElement(By.cssSelector(".search-container"));
        //attr+parameter -> css([attr = 'par'])}
        driver.findElement(By.cssSelector("[name='viewport']"));
        //css - start(^)
        driver.findElement(By.cssSelector("[class^='ng']"));
        //css - end on()
        driver.findElement(By.cssSelector("[class$='input']"));
    }
    @Test
    public void findElementXpathTest () {
        //   how create Xpath  //*[@attr='par']
        //tag ->
        //driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("//h1"));
        //id -> xpath
        driver.findElement(By.xpath("//input[@id='city']"));
        //id -> classname
        driver.findElement(By.xpath("//body/app-root[1]/app-navigator[1]/app-search[1]/div[1]/div[1]"));
        //text - > xpath
        driver.findElement(By.xpath("//h2[contains(text(),'Type your data and hit Yalla!')]"));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
