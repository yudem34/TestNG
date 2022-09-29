package tests.practice06;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SaucedemoPage;
import utilities.Driver;

public class P02_Odev {

        // Navigate to  https://www.saucedemo.com/
        // Enter the username  as standard_user
        // Enter the password as   secret_sauce
        // Click on login button
        // Choose price low to high
        // and verify that PRICE (LOW TO HIGH) is visible

        /*
        https://www.saucedemo.com/ adresine gidin
        Kullanıcı adını standart_kullanıcı olarak girin
        Parolayı secret_sauce olarak girin
        Giriş düğmesine tıklayın
        Düşükten yükseğe fiyat seçin
        ve FİYATIN (DÜŞÜKTEN YÜKSEKE) görünür olduğunu doğrulayın
        */

    @Test
    public void test01() {
        //     * Navigate to  https://www.saucedemo.com/
        Driver.getDriver().get("https://www.saucedemo.com/");
        SaucedemoPage saucedemoPage = new SaucedemoPage();
//     * Enter the username  as standard_user
        saucedemoPage.UserName.sendKeys("standard_user");
//     * Enter the password as   secret_sauce
        saucedemoPage.password.sendKeys("secret_sauce");
//     * Click on login button
        saucedemoPage.Login.click();
//     * Choose price low to high
        Select select = new Select( saucedemoPage.ddm);
        select.selectByValue("lohi");
//       and verify that PRICE (LOW TO HIGH) is visible
        Assert.assertEquals(saucedemoPage.price.getText(),"PRICE (LOW TO HIGH)");
    }
}
