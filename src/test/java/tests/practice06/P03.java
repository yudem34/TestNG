package tests.practice06;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuappPage;
import utilities.Driver;

public class P03 {
    HerokuappPage herokuTestPage;

    @Test
    public void test01() {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        //Click all the buttons and verify they are all clicked
        herokuTestPage = new HerokuappPage();
        //kodlarımız yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
        //ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        //test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir
        Actions actions = new Actions(Driver.getDriver());
        //Click all the buttons and verify they are all clicked
        herokuTestPage.onblur.click();
        herokuTestPage.onclick.click();
        herokuTestPage.onclick.click();
        actions.contextClick(herokuTestPage.contextmenu).
                doubleClick(herokuTestPage.doubleClick).
                click(herokuTestPage.onfocus).
                click(herokuTestPage.keydown)
                .sendKeys(Keys.ENTER).
                click(herokuTestPage.keyup).
                sendKeys(Keys.ENTER).
                click(herokuTestPage.keypress).
                sendKeys(Keys.ENTER).
                moveToElement(herokuTestPage.mouseOver).
                moveToElement(herokuTestPage.mouseLeave).
                moveToElement(herokuTestPage.mouseOver).
                click(herokuTestPage.mouseDown).perform();
    }
    @Test(dependsOnMethods = "test01")
    public void test02() {
        Assert.assertEquals(herokuTestPage.eventTriggered.size(), 11);
        Driver.closeDriver();
    }
}
