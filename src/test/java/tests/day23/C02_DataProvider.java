package tests.day23;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_DataProvider extends TestBaseRapor {
    public Faker faker;

    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"yusufddd34@gmail.com", "13551351"}, {"yusufydydy@gmail.com", "wwdwd13551351"}, {"yusufdddasdd34@gmail.com", "ddd13551351"}};
    }

    @Test(dataProvider = "kullanicilar")
    public void test01(String userEmail, String password) throws InterruptedException {
        //https://www.bluerentalcars.com/ adresine git
        extentTest = extentReports.createTest("Pozitif Test", "Gecerli kullanici adi ve password ile giris yapildi");
        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RenteaCar sitesine gidildi");
        // -login butonuna bas
        BlueRentalCarsPage bRC = new BlueRentalCarsPage();
        bRC.loginHome.click();
        extentTest.info("Login butonuna basildi");
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        bRC.email.sendKeys(userEmail);
        Thread.sleep(1000);
        extentTest.info("Mail adresi girildi");
        bRC.password.sendKeys(password);
        Thread.sleep(1000);
        extentTest.info("Password girildi");
        // -login butonuna tiklayin
        bRC.loginGiris.click();
        Thread.sleep(1000);
        extentTest.info("Login butonuna basıldı");
        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        // Assert.assertTrue(bRC.loginHome.isDisplayed());
        // extentTest.pass("Basarili giris yapılmadigi test edildi");
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(bRC.hataliGiris).perform();
        Assert.assertTrue(bRC.hataliGiris.isDisplayed());
        extentTest.pass("Basarili giris yapılmadigi test edildi");
    }
}
