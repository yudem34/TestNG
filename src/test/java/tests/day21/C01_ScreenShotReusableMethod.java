package tests.day21;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    PearlyMarketPage pearlyMarket = new PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test02() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket"));
        pearlyMarket.signIn.click();
        pearlyMarket.signUserNameOrEmail.sendKeys(ConfigReader.getProperty("email"));
        pearlyMarket.signPassword.sendKeys(ConfigReader.getProperty("parola"));
        pearlyMarket.singInButonu.click();
        Thread.sleep(4000);
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(1000);
        actions.moveToElement(pearlyMarket.enAltaInme).perform();
        Thread.sleep(1000);
        pearlyMarket.myAccount.click();
        Thread.sleep(1000);
        Driver.closeDriver();
    }

    @Test
    public void test03() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket"));
        pearlyMarket.signIn.click();
        pearlyMarket.signUserNameOrEmail.sendKeys(ConfigReader.getProperty("email"));
        pearlyMarket.signPassword.sendKeys(ConfigReader.getProperty("parola"));
        pearlyMarket.singInButonu.click();
        Thread.sleep(4000);
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(1000);
        actions.moveToElement(pearlyMarket.enAltaInme).perform();
        Thread.sleep(1000);
        pearlyMarket.myAccount.click();
        Thread.sleep(1000);
        Driver.closeDriver();
    }

    @Test
    public void test04() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket"));
        pearlyMarket.signIn.click();
        pearlyMarket.signUserNameOrEmail.sendKeys(ConfigReader.getProperty("email"));
        pearlyMarket.signPassword.sendKeys(ConfigReader.getProperty("parola"));
        pearlyMarket.singInButonu.click();
        Thread.sleep(4000);
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(1000);
        actions.moveToElement(pearlyMarket.enAltaInme).perform();
        Thread.sleep(1000);
        pearlyMarket.myAccount.click();
        Thread.sleep(1000);
        Driver.closeDriver();
    }


}
