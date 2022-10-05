package tests.day22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("Pozitif Test","Gecerli kullanici adi ve password ile giris yapildi");
        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RenteaCar sitesine gidildi");
        // -login butonuna bas
        BlueRentalCarsPage bRC = new BlueRentalCarsPage();
        bRC.loginHome.click();
        extentTest.info("Login butonuna basildi");
        // -test data user email: customer@bluerentalcars.com ,
        bRC.email.sendKeys(ConfigReader.getProperty("userEmail"));
        Thread.sleep(1000);
        extentTest.info("Mail adresi girildi");
        // -test data password : 12345 dataları girip login e basın
        bRC.password.sendKeys(ConfigReader.getProperty("pass"));
        Thread.sleep(1000);
        extentTest.info("Password girildi");
        // -login butonuna tiklayin
        bRC.loginGiris.click();
        extentTest.info("Login butonuna basıldı");
        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(bRC.basariliGiris.isDisplayed());
        extentTest.pass("Basarili giris yapıldigi test edildi");

    }
}
