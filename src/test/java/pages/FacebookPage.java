package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")
    public WebElement cookieButonu;

    @FindBy (xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy (xpath = "//*[@id='pass']")
    public WebElement password;

    @FindBy (xpath = "//*[@name='login']")
    public WebElement girisYap;

    @FindBy (xpath = "//*[@class='_9ay7']")
    public WebElement hataliGiris;





}

