package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HepsiburadaPage {
    public HepsiburadaPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "(//*[@class='sf-MenuItems-WulWXvlfIAwNiOUGY7FP'])[1]")
    public WebElement elektronikMenusu;

    @FindBy (xpath = "(//*[@class='sf-ChildMenuItems-a4G0z3YJJWkQs7qKKuuj'])[2]")
    public WebElement bilgisayarTabletMenusu;

    @FindBy (xpath = "//div[1]/ul/li/div/ul/li/ul/li/a")
    public List<WebElement> bilTabListesi;


}
