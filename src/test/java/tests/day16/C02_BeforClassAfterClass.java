package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforClassAfterClass extends TestBaseBeforeClassAfterClass {
    @Test
    public void testAmazon() {
        driver.get("https://amazon.com");
    }

    @Test
    public void testBestbuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void testTechproeducation() {
        driver.get("https://www.techproeducation.com");
    }
}
