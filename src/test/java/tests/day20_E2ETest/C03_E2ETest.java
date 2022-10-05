package tests.day20_E2ETest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_E2ETest {
    @Test
    public void E2ETest() throws InterruptedException {
        //https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hotelmycamp"));
        HotelMyCampPage hotelMyCamp = new HotelMyCampPage();
        hotelMyCamp.login.click();
        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //Username : manager
        //Password  : Manager1!
        hotelMyCamp.username.sendKeys(ConfigReader.getProperty("hmcUserName"));
        hotelMyCamp.password.sendKeys(ConfigReader.getProperty("hmcPassword"));
        //Login butonuna tıklayın.
        hotelMyCamp.loginButton.click();
        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hotelMyCamp.hotelManagement.click();
        hotelMyCamp.roomReservation.click();
        hotelMyCamp.addRoomReservation.click();
        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        /*Select select=new Select(hotelMyCamp.IDUserddM);
        select.selectByIndex(1);
        select=new Select(hotelMyCamp.IDRoomddM);
        select.selectByIndex(5);*/
        hotelMyCamp.IDUserddM.sendKeys("manager");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys("gamze").sendKeys(Keys.TAB).sendKeys("1500").sendKeys(Keys.TAB).
                sendKeys("10/10/2022",Keys.ENTER).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("15/10/2022",Keys.ENTER).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("2").sendKeys(Keys.TAB).sendKeys("1").sendKeys(Keys.TAB).
                sendKeys("Kemal Kanmaz").sendKeys(Keys.TAB).sendKeys("1235412532").
                sendKeys(Keys.TAB).sendKeys("kmlkml01_dd@gmail.comss").sendKeys(Keys.TAB).
                sendKeys("mrb").sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
        //Save butonuna tıklayın.
        //“RoomReservation was inserted successfully” textinin göründüğünü test edin
        Assert.assertTrue(hotelMyCamp.roomReservationText.isDisplayed());
        //OK butonuna tıklayın.
        hotelMyCamp.okButton.click();

    }


}
