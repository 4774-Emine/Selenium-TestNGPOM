package clarusway.AmazonTaskPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonProductTwoPage {
    WebDriver driver;

    public AmazonProductTwoPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }
public void verifyTwoPage(){
    Assert.assertTrue(driver.getCurrentUrl().contains("page=2"));
}


@FindBy(xpath = "//*[text()='FECAMOS MSI için fan, dizüstü bilgisayar fanı, MSI GS63VR Serisi GS63VR Serisi GS63VR 6RF GS63VR 7RF için verimli']")

private WebElement txtTwoProduct;
    public void twoProductClick(){
        txtTwoProduct.click();
    }

}
