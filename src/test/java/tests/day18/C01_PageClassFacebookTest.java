package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C01_PageClassFacebookTest {

    @Test
    public void test01() {
        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.cookieButonu.click();
        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        //Faker class’ini kullanarak email ve sifre degerlerini
        Faker faker=new Faker();
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        //yazdirip, giris butonuna basin
        facebookPage.girisYap.click();
        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.hataliGiris.isDisplayed());
        Driver.closeDriver();
    }
}
