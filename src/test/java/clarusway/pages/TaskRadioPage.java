package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TaskRadioPage {

    public TaskRadioPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
   @FindBy(linkText="Yeni Hesap Oluştur")
    public WebElement hesapOlustur;

 @FindBy(name="firstname")
 public WebElement name;

@FindBy(name="lastname")
    public WebElement lastname;

@FindBy(name="reg_email__")
public WebElement email;


@FindBy(name="reg_passwd__")
    public WebElement password;


//Select sc=new Select(Driver.getDriver().findElement(By.name("birthday_day")));
 @FindBy(name="birthday_day")
    public List<WebElement> options;



}
