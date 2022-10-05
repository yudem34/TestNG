package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='nav-link'])[7]")
    public WebElement login;

    @FindBy(xpath = "//*[@name='UserName']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='Password']")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement pozitifTest;

    @FindBy(xpath = "//*[text()='Username or password is incorrect, please correct them and try again']")
    public WebElement negatifTest;

    @FindBy(id = "divMessageResult")
    public WebElement wrongPassword;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy(xpath = "//*[@class='actions']")
    public WebElement addRoomReservation;

    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement IDUserddM;

    @FindBy(xpath = "//*[@id='IDHotelRoom']")
    public WebElement IDRoomddM;

    @FindBy(xpath = "//*[@id='Price']")
    public WebElement price;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    public WebElement submit;

    @FindBy(xpath = "//*[@class='bootbox-body']")
    public WebElement roomReservationText;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement okButton;



}
