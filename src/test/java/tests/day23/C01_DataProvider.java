package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


public class C01_DataProvider extends TestBaseRapor {
    public AmazonPage amazonPage;
    @DataProvider
    public static Object[][] aranacakkelimeler() {
        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
    }

    @Test(dataProvider = "aranacakkelimeler")
    public void test02(String kelimeler) {
        amazonPage=new AmazonPage();
        extentTest=extentReports.createTest("Coklu urun aratma","Amazon sayfasında sırayla urun aratıldı");
        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));
        extentTest.info("Amazon sayfasına gidildi");
        //java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(kelimeler, Keys.ENTER);
        extentTest.info("Arama cubuguna sırasıyla aranacak olan kelimeler girildi");
        //sonuclarin aradigimiz kelime icerdigini test edelim
        String actualKelime = amazonPage.aramaSonucYazisi.getText();
        Assert.assertTrue(actualKelime.contains(kelimeler));
        extentTest.pass("Arama sonucunun aranan kelimeyi icerdigi test edildi");
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        Driver.closeDriver();
    }
}
