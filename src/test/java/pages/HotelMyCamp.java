package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCamp {
    public HotelMyCamp(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//*[@class='nav-link'])[7]")
    public WebElement login;

    @FindBy (xpath = "//*[@name='UserName']")
    public WebElement username;

    @FindBy (xpath = "//*[@name='Password']")
    public WebElement password;

    @FindBy (xpath = "//*[@value='Log in']")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisTesti;
}
