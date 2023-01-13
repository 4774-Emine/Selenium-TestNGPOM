package clarusway.AmazonTaskPom;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonTaskPOMPage {
    private WebDriver driver;

    public AmazonTaskPOMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "accept")
    private WebElement cerez;

    public void CerezKabul() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cerez)).click();
    }

    @FindBy(id = "nav-link-accountList")
    private WebElement hesapButton;

    @FindBy(linkText = "Giriş yap")
    private WebElement girisButton;

    public void girisYap() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(hesapButton).perform();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(girisButton)).click();




    }
}
