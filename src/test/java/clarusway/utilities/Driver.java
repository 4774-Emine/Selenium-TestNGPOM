package clarusway.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private Driver(){//Driver constactorı driver classının 1 defa oluşturulmasını sağlayacak,bundan dolayı
        //tek bir driver objemiz olmuş olacak
    }


    public static WebDriver getDriver() {
        //Burada driverimiz static bir obje olduğundan tek bir driver ile çalışıyor olacağız.
        //Tek bir driver objesi ile çalışmaya Singleton dizayn pattern denir.



        if(driver == null){
            String browser = ConfigReader.getProperty("browser");//config dosyasından browser bilgisi getirildi
            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;
    }



        public static void closeDriver () {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }



}

