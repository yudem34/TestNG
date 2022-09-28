package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforMethodAfterMethod;
import utilities.TestBaseBeforeClassAfterClass;

public class C05_DependsOnMethod extends TestBaseBeforeClassAfterClass {

    // testlerden biri hata verdiginde sona erer
    @Test
    public void test1() {
        // Amazona gidelim
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test2() {
        // Nutella aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);
    }

    @Test
    public void test3() {
        // sonuc yazisinin amazon icerdigini test edelim
        assert !(driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")).getText().contains("amazon"));
        //Assert.assertFalse yerine assert ! kullanilabilir.
    }
}
