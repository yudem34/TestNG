package tests.day19;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegatifTest {
    @Test
    public void test01() {
        // https://www.hotelmycamp.com adresine git
        /*String hotelmycamp= ConfigReader.getProperty("hotelmycamp");*/
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycamp"));
        HotelMyCamp hotelMyCamp=new HotelMyCamp();
        // login butonuna bas
        hotelMyCamp.login.click();

        // test data yanlis username: manager55,
        // test data yanlis password : Manageer1.
        hotelMyCamp.username.sendKeys(ConfigReader.getProperty("wrongHcmUserName"));
        hotelMyCamp.password.sendKeys(ConfigReader.getProperty("wrongHcmPassword"));
        hotelMyCamp.loginButton.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCamp.negatifTest.isDisplayed());
        Driver.closeDriver();

    }
}
