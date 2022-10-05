package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HepsiburadaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C00_Hepsiburada_Sorusu {
    @Test
    public void test01() throws InterruptedException, IOException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada"));
        //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        HepsiburadaPage hepsiburada = new HepsiburadaPage();
        Actions actions = new Actions(Driver.getDriver());
        //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım

        List<String> bilTab = new ArrayList<>(Arrays.asList("Dizüstü Bilgisayar",
                "Notebook", "Oyun Bilgisayarları", "İkisi Bir Arada", "Tablet", "Apple",
                "Samsung", "Lenovo", "Alcatel", "Hometech", "Huawei", "Reeder", "Diğer",
                "Casper", "Masaüstü Bilgisayar", "All-in-One", "Masaüstü", "Mini Masaüstü",
                "Oyuncu Özel", "Klavye", "Mouse", "Kulaklık", "Oyun Bilgisayarı",
                "Monitör", "Oyun Donanımları", "Oyuncu Masası", "Oyuncu Koltuğu",
                "Veri Depolama", "Usb Bellek", "Taşınabilir Disk", "SSD", "Hafıza Kartı",
                "Tüm Kategoriler", "Bilgisayar Bileşenleri", "Anakart", "Ekran Kartları",
                "Bellek (RAM)", "İşlemciler", "Disk", "Kasa", "Yurt Dışından",
                "Ağ - Modem - Akıllı Ev", "Access Point", "Router", "Modemler",
                "Grafik Tablet", "Xiaomi", "Veikk", "10moons", "Wacom", "Xp Pen",
                "Huion", "Çevre Birimleri", "Mouse", "Klavye & Mouse Set", "Klavye",
                "Monitör", "Yazıcı", "Simülasyon Aksesuarları & Sanal Gerçeklik Gözlüğü",
                "Yazılım Ürünleri", "Antivirüs ve Güvenlik", "Office Yazılımları",
                "Aksesuarlar", "Notebook Çantaları", "Tablet ve iPad Aksesuarları",
                "Kablolar/Switch ve Çoklayıcılar", "Kulaklık", "razer", "JBL", "Sony",
                "Philips", "James Donkey", "Rampage", "HyperX", "Steelseries", "HP",
                "Corsair", "Gamepower", "Asus", "Logitech"));


       for (String w : bilTab) {
            actions.moveToElement(hepsiburada.elektronikMenusu).perform();
            Thread.sleep(500);
            actions.moveToElement(hepsiburada.bilgisayarTabletMenusu).perform();
            Driver.getDriver().findElement(By.xpath("//*[text()='" + w + "']")).click();
            Thread.sleep(500);
            ReusableMethods.getScreenshot("hepsiburada");
            Driver.getDriver().navigate().back();
            Thread.sleep(500);
        }
        Driver.closeDriver();
    }
}
