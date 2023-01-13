package clarusway.AmazonTaskPom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AmazonHomePage {
    private WebDriver driver;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement txtHesAdi;


    public void verfyHesapLoginControl(){
        Assert.assertTrue(txtHesAdi.getText().contains("Emine"));
    }

    @FindBy(id="searchDropdownBox")
    private WebElement slctKategori;

     public void drpDownSecim(){
         Select sc=new Select(slctKategori);
         sc.selectByValue("search-alias=computers");
}
@FindBy(id="twotabsearchtextbox")
    private WebElement searcBox;

     public void txtSendKeysMSI(){
      searcBox.sendKeys("MSI"+ Keys.ENTER);

     }
}
