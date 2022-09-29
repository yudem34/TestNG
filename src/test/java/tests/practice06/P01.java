package tests.practice06;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.Driver;

public class P01 {

    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.


    @Test
    public void test01() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        DhtmlgoodiesPage dhtml=new DhtmlgoodiesPage();
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(dhtml.Oslo,dhtml.Norway).
        dragAndDrop(dhtml.Stockholm,dhtml.Sweden).
        dragAndDrop(dhtml.Washington,dhtml.UnitedStates).
        dragAndDrop(dhtml.Copenhagen,dhtml.Denmark).
        dragAndDrop(dhtml.Seoul,dhtml.SoutKorea).
        dragAndDrop(dhtml.Rome,dhtml.Italy).
        dragAndDrop(dhtml.Madrid,dhtml.Spain).perform();
        Driver.closeDriver();
        String gun="Pazar";
        if (gun.equalsIgnoreCase("Pazar")|| gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("mrb");
        }

        /*
        -Frameworkler buyudukce yeni classlar yeni test methodlari yeni webelementler olusturdukca
        icinden cikilmaz, anlasilmaz, tekrar bakimi yapilamaz, guncellemesi cok zor hatta imkansiz bir hal alir.
        -Uzmanlar reusable, maintainable, rahat manipule edilebilir bir framework icin bir design pattern olarak
        POM (page object model)'de karar vermisler.
        -Olmazsa olmazlar
                1) Driver class
                2) Page class
                3) Test class
                   Utilities
        -Aradigimiz bir web elementi ya da bir methodu kolaylikla bulabilmek ve guncelleyebilmek icin javadan
        ogrenmis oldugumuz OOP Concept Selenium ile page object modelde birlestirilmis oluyor.
        */
    }
}
