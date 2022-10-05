package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarsPage {
    public BlueRentalCarsPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement loginHome;

    @FindBy (xpath = "//*[@name='email']")
    public WebElement email;

    @FindBy (xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement loginGiris;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement basariliGiris;


}
