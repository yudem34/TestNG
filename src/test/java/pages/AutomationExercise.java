package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercise {
    public AutomationExercise() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@style='font-size: 16px;']")
    public WebElement product;

    @FindBy (xpath = "//*[text()='All Products']")
    public WebElement allProduct;

    @FindBy (xpath = "(//*[@class='fa fa-plus-square'])[1]")
    public WebElement firstviewProduct;

    @FindBy (xpath = "//*[text()='Write Your Review']")
    public WebElement writeYourReview;

    @FindBy (xpath = "//*[@type='text']")
    public WebElement productYourName;

    @FindBy (xpath = "(//*[@type='email'])[1]")
    public WebElement productEmail;

    @FindBy (xpath = "//*[@name='review']")
    public WebElement addReview;

    @FindBy (id = "button-review")
    public WebElement Submit;

    @FindBy (xpath = "//*[@style='font-size: 20px;']")
    public WebElement thankYou;

    @FindBy (xpath = "//*[@name='aswift_4']")
    public WebElement frame;





}
