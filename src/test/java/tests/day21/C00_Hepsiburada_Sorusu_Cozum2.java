package tests.day21;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HepsiburadaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C00_Hepsiburada_Sorusu_Cozum2 {
    @Test
    public void test01() throws InterruptedException, IOException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada"));
        //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        HepsiburadaPage hepsiburada = new HepsiburadaPage();
        Actions actions = new Actions(Driver.getDriver());
        //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
        for (int i = 0; i < 80; i++) {
            actions.moveToElement(hepsiburada.elektronikMenusu).perform();
            actions.moveToElement(hepsiburada.bilgisayarTabletMenusu).perform();
            Thread.sleep(500);
            hepsiburada.bilTabListesi.get(i).click();
            ReusableMethods.getScreenshot("hb");
            Driver.getDriver().navigate().back();
            Thread.sleep(500);
        }
        Driver.closeDriver();
    }
}
