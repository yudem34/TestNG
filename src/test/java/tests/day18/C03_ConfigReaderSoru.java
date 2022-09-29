package tests.day18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReaderSoru {
    @Test
    public void test01() {
        // https://www.hotelmycamp.com adresine git
        String hotelmycamp= ConfigReader.getProperty("hotelmycamp");
        Driver.getDriver().get(hotelmycamp);
        HotelMyCamp hotelMyCamp=new HotelMyCamp();
        // login butonuna bas
        hotelMyCamp.login.click();
        // test data username: manager ,
        // test data password : Manager1!
        hotelMyCamp.username.sendKeys(ConfigReader.getProperty("hmcUserName"));
        hotelMyCamp.password.sendKeys(ConfigReader.getProperty("hmcPassword"));
        hotelMyCamp.loginButton.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCamp.girisTesti.isDisplayed());
        Driver.closeDriver();

    }
}
