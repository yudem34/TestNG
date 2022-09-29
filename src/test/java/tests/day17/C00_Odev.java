package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseBeforMethodAfterMethod;
import utilities.TestBaseBeforeClassAfterClass;

public class C00_Odev extends TestBaseBeforeClassAfterClass {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test01() {
        // https://www.amazon.com/ adresine gidin.
        driver.get("https://amazon.com");
        // Test : Amazon ana sayfaya gittiginizi test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"), "eslesme olmadi");
        softAssert.assertAll();
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        // Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
        // arama yapin ve aramanizin gerceklestigini Test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        WebElement sonucElementi = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucElementi.getText().contains("Nutella"), "eslesme olmadi");
        softAssert.assertAll();
    }

    @Test (dependsOnMethods = "test02")
    public void test03() {
        // Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
        // $16.83 oldugunu test edin
        WebElement ilk=driver.findElement(By.xpath("(//*[@class='a-section aok-relative s-image-square-aspect'])[1]"));
        ilk.click();
        String actual = driver.findElement(By.xpath("(//*[@class='a-size-medium a-text-bold'])[2]")).getText();
        softAssert.assertEquals(actual, "200");
        softAssert.assertAll();
    }
}
