package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforMethodAfterMethod {
    @Test
    public void amazonTesti() {
        driver.get("https://amazon.com");
    }

    @Test (groups = "gp1")
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproeducationTesti() {
        driver.get("https://www.techproeducation.com");
    }
}
