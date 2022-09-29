package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoPage {
    public SaucedemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement UserName;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "login-button")
    public WebElement Login;
    @FindBy(xpath = "//*[@class='product_sort_container']")
    public WebElement ddm;
    @FindBy(xpath = "//*[@class='active_option']")
    public WebElement price;

}

