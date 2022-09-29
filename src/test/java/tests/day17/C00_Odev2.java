package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforMethodAfterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C00_Odev2 extends TestBaseBeforMethodAfterMethod {
    @Test
    public void test01() throws InterruptedException {

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();
        //3. Login alanine “username” yazdirin
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");
        //4. Password alanine “password” yazdirin
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");
        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath(" //*[@class='btn btn-primary']")).click();
        driver.navigate().back();
        //6. Online Banking sekmesine tıklayın ve sonra Pay Bills sayfasina gidin
        driver.findElement(By.xpath("(//*[text()='Online Banking'])[1]")).click();
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();
        // "Purchase Foreign Currency" tusuna basin
        driver.findElement(By.xpath("(//*[@class='ui-state-default ui-corner-top'])[2]")).click();
        // "Currency" drop down menusunden Eurozone'u secin
        WebElement dDM = driver.findElement(By.xpath("//*[@id='pc_currency']"));
        Select select = new Select(dDM);
        select.selectByValue("EUR");
        // soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        SoftAssert softAssert=new SoftAssert();
        String actualDropDownTitle=select.getFirstSelectedOption().getText();
        softAssert.assertEquals(actualDropDownTitle,"Eurozone (euro)","Yanlis secim yapilmis");
        // soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        // "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China  (yuan)",
        // "Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong  (dollar)",
        // "Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand  (dollar)",
        // "Sweden (krona)","Singapore (dollar)","Thailand (baht)"
        List<String> soruList = new ArrayList<>(Arrays.asList(
                "Select One", "Australia (dollar)", "Canada (dollar)", "Switzerland (franc)",
                "China (yuan)", "Denmark (krone)", "Eurozone (euro)", "Great Britain (pound)",
                "Hong Kong (dollar)", "Japan (yen)", "Mexico (peso)", "Norway (krone)",
                "New Zealand (dollar)", "Sweden (krona)", "Singapore (dollar)", "Thailand (baht)"));
        List<WebElement> dDMList = select.getOptions();
        for (int i = 0; i < soruList.size(); i++) {
            softAssert.assertEquals(dDMList.get(i).getText(), soruList.get(i),"Listeler aynı degil");
        }
        softAssert.assertAll();
    }
}

