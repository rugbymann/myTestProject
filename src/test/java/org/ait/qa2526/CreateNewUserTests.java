package org.ait.qa2526;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewUserTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        //precondition: user should be logged out
        if(!isElementPresent(By.cssSelector(".ico-register"))){
            driver.findElement(By.xpath(" //a[contains(text(),'Log out')]")).click();
        }
        driver.findElement(By.cssSelector(".ico-login"));

    }

    @Test
    public void createUserPositiveTest() {
       driver.findElement(By.cssSelector(".ico-register")).click();
       driver.findElement(By.id("FirstName")).sendKeys("Ali");
       driver.findElement(By.id("LastName")).sendKeys("Ali");
       driver.findElement(By.id("Email")).sendKeys("orkhan@mail.ru");
       driver.findElement(By.id("Password")).sendKeys("Orxan111!");
       driver.findElement(By.id("ConfirmPassword")).sendKeys("Orxan111!");
       driver.findElement(By.id("register-button")).click();
    }
}
