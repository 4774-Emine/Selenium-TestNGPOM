package clarusway.tests;

import clarusway.pages.TaskRadioPage;
import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class taskRadioButton {
    // Go to URL:  https://www.facebook.com/
// Click on Create an Account button.
//  Then click on the radio buttons.
// Click 'Kadın'
// Click 'Erkek'

    @Test
    public void test() {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");
        TaskRadioPage taskRadioPage = new TaskRadioPage();

        taskRadioPage.hesapOlustur.click();
        taskRadioPage.name.sendKeys("Emine");
        taskRadioPage.lastname.sendKeys("disceken");
        String email = "emine.123qgmail.com";
        taskRadioPage.email.sendKeys(email);


    }
}