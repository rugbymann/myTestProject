package org.ait.qa2526;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddToCardTests extends TestBase{

    @Test
    public void addNewItemTests(){
        driver.findElement(By.xpath("//a[contains(text(),'Build your own cheap computer')]")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button-72")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
    }
}
