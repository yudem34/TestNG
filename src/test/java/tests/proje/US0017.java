package tests.proje;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseBeforMethodAfterMethod;

import java.io.IOException;

public class US0017 {
    PearlyMarketPage pearlyMarket = new PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Test
    public void TC001() throws IOException, InterruptedException {
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
    public void TC002() throws IOException,InterruptedException {
        PearlyMarketPage pearlyMarket = new PearlyMarketPage();
        Actions actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket2"));
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
    public void TC003() throws IOException,InterruptedException {
        PearlyMarketPage pearlyMarket = new PearlyMarketPage();
        Actions actions = new Actions(Driver.getDriver());
        // Veya yeniden yukarıdaki tum adres bilgilerini farklı olarak ekleyebilirler
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

