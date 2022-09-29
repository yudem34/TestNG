package tests.day18;

import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {

        // Amazona gidelim
        String amzUrl=ConfigReader.getProperty("amzUrl");
        Driver.getDriver().get(amzUrl);

        // Facebook'a  gidelim
        String faceUrl=ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(faceUrl);
        // Yanlis email ve sifre ile giris yapalım
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.cookieButonu.click();
        String wrongEmail=ConfigReader.getProperty("fbWrongEmail");
        facebookPage.email.sendKeys(wrongEmail);
        String wrongPassword=ConfigReader.getProperty("fbWrongPassword");
        facebookPage.password.sendKeys(wrongPassword);
        facebookPage.girisYap.click();
        Driver.closeDriver();


    }
}
