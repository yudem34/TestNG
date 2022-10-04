package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforMethodAfterMethod;

public class C03_Priority extends TestBaseBeforMethodAfterMethod {

    /*
    - @Test notasyonunun yanına (priority = sayı) yazarsak testlerin çalışma sırasını belirlemiş oluruz.
    - Önce en küçük olan çalışır
    - priority olarak herhangi bir sayı yazılmamışsa 0 olarak kabul edilir.
    */

    @Test (priority = 1)
    public void youtubeTest() {
        driver.get("https://youtube.com");
    }

    @Test(priority = 3)
    public void bestbuyTest() {

        driver.get("https://www.bestbuy.com");
    }

    @Test(priority = 2,groups = "gp1")
    public void testAmazon() {
        driver.get("https://amazon.com");
    }
}

