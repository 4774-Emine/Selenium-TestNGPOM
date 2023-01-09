package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SauceDemoHomePage {


    public SauceDemoHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(tagName = "select")
    public WebElement filterDropdown;

    @FindBy(className = "inventory_item")
    public List<WebElement> products;

}



