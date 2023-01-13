package clarusway.AmazonTaskPom;

import clarusway.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTaskPOM {
/*

Amazon Senaryosu
o https://www.amazon.com.tr/ sitesi açılır.
o Ana sayfanın açıldığı kontrol edilir.
o  Çerez tercihlerinden Çerezleri kabul et seçilir.
o  Siteye login olunur.
o Login işlemi kontrol edilir.
o Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
o Bilgisayar kategorisi seçildiği kontrol edilir.
o Arama alanına MSI yazılır ve arama yapılır.
o Arama yapıldığı kontrol edilir.
o Arama sonuçları sayfasından 2. sayfa açılır.
o 2. sayfanın açıldığı kontrol edilir.
o Sayfadaki 2. ürün favorilere eklenir.
o 2. Ürünün favorilere eklendiği kontrol edilir.
o Hesabım > Favori Listem sayfasına gidilir.
o “Favori Listem” sayfası açıldığı kontrol edilir.
o Eklenen ürün favorilerden silinir.
o Silme işleminin gerçekleştiği kontrol edilir.
o Üye çıkış işlemi yapılır.
o Çıkış işleminin yapıldığı kontrol edilir.

 */

    @Test
    public void test() {
        Driver.getDriver().get(" https://www.amazon.com.tr/ ");
        String homePageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.amazon.com.tr/", homePageUrl);


        AmazonTaskPOMPage atp = new AmazonTaskPOMPage(Driver.getDriver());
        atp.CerezKabul();

        atp.girisYap();

        AmazonTaskLoginPage lp = new AmazonTaskLoginPage(Driver.getDriver());
        lp.login();

        AmazonHomePage hp = new AmazonHomePage(Driver.getDriver());
        hp.verfyHesapLoginControl();
        hp.drpDownSecim();
        hp.txtSendKeysMSI();

        AmazonProductOnePage op = new AmazonProductOnePage(Driver.getDriver());
        op.verifyMSI();
        op.jseTwoGo();
        AmazonProductTwoPage tp = new AmazonProductTwoPage(Driver.getDriver());
       tp.verifyTwoPage();
      //  tp.twoProductClick();
//
      //  AmazonTaskTwoProduct top = new AmazonTaskTwoProduct(Driver.getDriver());
      //  top.twoProductAddFavorite();
      //  top.favoriLİstemeGit();
    }
}