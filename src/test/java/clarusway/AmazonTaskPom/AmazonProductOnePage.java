package clarusway.AmazonTaskPom;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonProductOnePage {
    private WebDriver driver;

    public AmazonProductOnePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='MSI']")
    private WebElement txtMSI;

    public void verifyMSI() {
        Assert.assertTrue(txtMSI.getText().contains("MSI"));
    }

    @FindBy(linkText = "2")
    private WebElement txtSayfaTwo;

    public void jseTwoGo() {
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();" ,txtSayfaTwo);
        txtSayfaTwo.click();

    }
}
