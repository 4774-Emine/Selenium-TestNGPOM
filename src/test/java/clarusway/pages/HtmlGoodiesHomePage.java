package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HtmlGoodiesHomePage {


    public HtmlGoodiesHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //PageFactory classı nedir ne işe yarar?->Page class i initialize etmek adina kullanilir

    @FindBy(id = "box3")
    public WebElement washington;

    @FindBy(id = "box4")
    public WebElement copenhag;

    @FindBy(id = "box5")
    public WebElement seoul;

    @FindBy(id = "box6")
    public WebElement rome;

    @FindBy(id = "box7")
    public WebElement madrid;

    @FindBy(id = "box1")
    public WebElement oslo;

    @FindBy(id = "box2")
    public WebElement stockholm;


    @FindBy(id = "box106")
    public WebElement italy;

    @FindBy(id = "box107")
    public WebElement spain;

    @FindBy(id = "box101")
    public WebElement norway;

    @FindBy(id = "box104")
    public WebElement denmark;

    @FindBy(id = "box105")
    public WebElement sKorea;

    @FindBy(id = "box102")
    public WebElement sweden;

    @FindBy(id = "box103")
    public WebElement us;

}
