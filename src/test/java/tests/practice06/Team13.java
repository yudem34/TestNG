package tests.practice06;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class Team13 {
    WebDriver driver;

    @Test
    public void testName() {


//1. Amazon sayfasını acalım

        driver.get("https://www.amazon.com/");

//2. sayfanın acıldıgını dogrulayalım

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));

//3.header daki sigin butonuna basalım
        WebElement headerSiginButton = driver.findElement(By.cssSelector("#nav-link-accountList"));
        ReusableMethods.hover(headerSiginButton);
        driver.findElement(By.cssSelector("div[id='nav-flyout-ya-signin'] span[class='nav-action-inner']")).click();


//4. kullanıc adı ve şifre bilgisini girerek login olalım
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("suat_oruc@yahoo.com");
        driver.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("amazonaA115436-");
        driver.findElement(By.xpath("//input[@class=\"a-button-input\" and @type=\"submit\"]")).click();


//5. başarılı bir şekilde login oldugumuzu dogrulayalım.
        String actual = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).getText();
        Assert.assertTrue(actual.contains("Suat"));
        Assert.assertTrue(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).isDisplayed());


//11. kategori bölümünden computers seçilir
        WebElement kategori = driver.findElement(By.cssSelector("[name=\"url\"]"));
        Select select = new Select(kategori);
        select.selectByVisibleText("Computers");


//12. kategori bolumnde computers seçili oldugunu dogrulayım
        String actualKategori = select.getFirstSelectedOption().getText();
        Assert.assertTrue(actualKategori.equals("Computers"));

//13. arama kutusuna msi yazıp aratalım

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("msi" + Keys.ENTER);
//
//14. arama kutusunda msi arandığını dogrulayalım

        String actualSearch = driver.findElement(By.cssSelector("#twotabsearchtextbox")).getAttribute("value");
        System.out.println(actualSearch);
        Assert.assertEquals(actualSearch, "msi");


//15. gelen ürün sayfasında 2. sayfaya gecelim

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.cssSelector("[aria-label=\"Go to page 2\"]")));
        ReusableMethods.waitFor(2);
        driver.findElement(By.cssSelector("[aria-label=\"Go to page 2\"]")).click();


//16. 2. sayfadaki 2. urunu secelim

        urunsec(1);

//18. urunu sepete ekleyelim
        driver.findElement(By.xpath("//input[starts-with(@id,'add-to-cart')]")).click();
// sepete eklendigini dogruladık
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Added to Cart')]")).isDisplayed());

//20. sepetteki urunumuzu silelim
        driver.findElement(By.cssSelector("[href=\"/gp/cart/view.html?ref_=sw_gtc\"]")).click();
        driver.findElement(By.cssSelector("[value=\"Delete\"]")).click();

//21.  urunumuzun silindigi dogrulayaım
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).isDisplayed());

//22. siteden logout olalım

//23. logout dogrulayalım.


    }

    private void urunsec(int urnNo) {
        String path = "(//span[@class=\"a-size-base-plus a-color-base a-text-normal\"])[" + urnNo + "]";

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath(path)));

        ReusableMethods.waitFor(2);
        driver.findElement(By.xpath(path)).click();

    }

    @AfterClass
    public void tearDown() {
        // driver.close();
    }
}


