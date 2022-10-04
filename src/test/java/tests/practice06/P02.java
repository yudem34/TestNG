package tests.practice06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P02 {
    @Test
    public void test01() throws InterruptedException {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebUniversityPage wUP = new WebUniversityPage();
        List<String> list = new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla","Bulaşıkları yıka",
                "Bebekle ilgilen","Çocuğunun ödevine yardım et","Selenyum çalış","Uyu"));
        for (String w : list) {
            wUP.addNewToDo.sendKeys(w, Keys.ENTER);
        }
        //Tüm yapılacakların üzerini çiz.
        for (WebElement w : wUP.todos) {
            w.click();
        }
        //Tüm yapılacakları sil.
        for (WebElement w : wUP.delete) {
            w.click();
        }
        //Tüm yapılacakların silindiğini doğrulayın.
        Assert.assertFalse(wUP.delete.get(0).isDisplayed());
    }
}
