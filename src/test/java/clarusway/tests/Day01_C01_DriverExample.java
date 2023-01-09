package clarusway.tests;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day01_C01_DriverExample {
    //driver objesini kullanmak için daha önce extends ederek test yapıyorduk
    //şimdi ise Driver classından driver objesi ile method çağıracağız

    /*Go to URL: https://opensource-demo.orangehrmlive.com/
    Verify title contains OrangeHRM.
    Use Driver Class.*/

    @Test
    public void test01() {
        //driver kullanmak için 1.yol-> Class ismiyle doğrudan çağırabiliriz.

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

        String title=Driver.getDriver().getTitle();

        Assert.assertTrue(title.contains("OrangeHRM"));

        Driver.closeDriver();
    }

    @Test
    public void test02() {
        //driver kullanmak için 2.yol->driver classından obje oluştururuz.

        WebDriver driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
        Driver.closeDriver();

    }
}
