package clarusway.AmazonTaskPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AmazonTaskTwoProduct {

    private WebDriver driver;

    public AmazonTaskTwoProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-wishlist-button-submit")
    private WebElement listeyeEkle;

    @FindBy(xpath = "//*[text()='1 ürün şuraya eklendi:']")
    private WebElement eklenditxt;
    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement closeBttn;

    public void twoProductAddFavorite() {
        listeyeEkle.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(eklenditxt));
        Assert.assertTrue(eklenditxt.isDisplayed());
        closeBttn.click();
    }


    @FindBy(id = "nav-link-accountList")//hesap ve listelere git
    private WebElement hesapButton;

    @FindBy(linkText = "Alışveriş Listesi")//alisveris listesine git
    private WebElement favoriList;

    public void favoriLİstemeGit() {
        hesapButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(favoriList));
        favoriList.click();

    }
}