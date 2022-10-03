package tests.automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class iframeDeneme {
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("autoE"));
        WebElement iframe=Driver.getDriver().findElement(By.xpath("//div[@class='grippy-host']"));
        Thread.sleep(2000);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(iframe);
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//div[@class='grippy-host']")).click();
    }
}
