package org.ait.qa2526;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;



    public class DemoWebShop {

        WebDriver driver;
        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.get("https://demowebshop.tricentis.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }



        @Test
        public void findElementsTest() {
            WebElement element = driver.findElement(By.cssSelector("#dialog-notifications-success"));
            WebElement element1 = driver.findElement(By.cssSelector("#dialog-notifications-error"));
            WebElement element2 = driver.findElement(By.cssSelector("#bar-notification"));
            WebElement element3 = driver.findElement(By.cssSelector("#ui-id-1"));
            WebElement element4 = driver.findElement(By.cssSelector(".footer"));
            WebElement element5 = driver.findElement(By.cssSelector("div.column.my-account:nth-child(3)"));
            WebElement element6 = driver.findElement(By.cssSelector(".search-box"));
            WebElement element7 = driver.findElement(By.cssSelector(".header-logo"));
            WebElement element8 = driver.findElement(By.cssSelector(".master-wrapper-main:nth-child(5)"));
            WebElement element9 = driver.findElement(By.cssSelector(".top-menu:nth-child(1)"));


        }
        @Test
        public void DemoChroPathTest(){

            WebElement element = driver.findElement(By.xpath("//div[@id='dialog-notifications-success']"));
            WebElement element1 = driver.findElement(By.xpath("//div[@id='dialog-notifications-error']"));
            WebElement element2 = driver.findElement(By.xpath("//div[@id='bar-notification']"));
            WebElement element3 = driver.findElement(By.xpath("//ul[@id='ui-id-1']"));
            WebElement element4 = driver.findElement(By.xpath("//body/div[4]/div[2]"));
            WebElement element5 = driver.findElement(By.xpath("//body/div[4]/div[2]/div[1]/div[3]"));
            WebElement element6 = driver.findElement(By.xpath("//body/div[4]/div[2]"));
            WebElement element7 = driver.findElement(By.xpath("//body/div[4]"));
            WebElement element8 = driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]"));
            WebElement element9 = driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]"));


        }
        @Test
        public void findOneEl(){
            WebElement el = driver.findElement(By.cssSelector(".active"));
            System.out.println(el + "element is found");
        }

        @Test
        public void registrationTest(){
            WebElement register = driver.findElement(By.cssSelector(".ico-register"));
            driver.findElement(By.id("FirstName")).sendKeys("Orkhan");
            driver.findElement(By.id("LastName")).sendKeys("Aliyev");
            driver.findElement(By.id("Email")).sendKeys("ori@mail.ru");
            driver.findElement(By.id("Password")).sendKeys("Orxan111!");
            driver.findElement(By.id("ConfirmPassword")).sendKeys("Orxan111!");
            driver.findElement(By.id("register-button")).click();

        }
        @AfterMethod
        public void tearDown() {
            driver.quit();

        }
    }