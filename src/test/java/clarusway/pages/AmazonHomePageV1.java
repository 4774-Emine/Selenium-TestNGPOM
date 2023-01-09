package clarusway.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonHomePageV1 {


    private WebDriver ldriver;

    public AmazonHomePageV1(WebDriver driver) {
        this.ldriver = driver;

        PageFactory.initElements(ldriver, this);
    }


    @FindBy(id = "twotabsearchtextbox")
    WebElement txtSearch;

    @FindBy(id = "nav-link-accountList")
    WebElement accountAndList;

    @FindBy(id = "nav_prefetch_yourorders")
    WebElement orders;


    public void searchFor(String key) {
        txtSearch.sendKeys(key + Keys.ENTER);
    }

    public void navigateToOrders() {
        Actions actions = new Actions(ldriver);
        actions.moveToElement(accountAndList)
                .perform();

        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(orders)).click();

    }

}

