import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HMCUrlPages {
    public HMCUrlPages(){
        PageFactory.initElements(Driver.getDriver(),this);{
Driver.getDriver().get(ConfigReader.getProperties("HMCUrl"));
        }
    }
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginButonu;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameKutusu;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement login2Butonu;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addButtonu;


}
