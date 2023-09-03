package org.ait.qa2526;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
            //precondition: user should be logged out
            if(!isElementPresent(By.cssSelector(".ico-login"))){
                driver.findElement(By.xpath(" //a[contains(text(),'Log out')]")).click();
            }
            driver.findElement(By.cssSelector(".ico-login"));


    }

    @Test
    public void LoginTests() {
        driver.findElement(By.cssSelector(".ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("orkhan@mail.ru");
        driver.findElement(By.id("Password")).sendKeys("Orxan111!");
        driver.findElement(By.cssSelector(".button-1.login-button")).click();



    }
}
