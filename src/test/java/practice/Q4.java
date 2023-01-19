package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HepsiBuradaPages;
import utilities.Driver;

public class Q4 {

    @Test
    public void test01(){

        //hepsiburada.com a git
        Driver.getDriver().get("https://www.hepsiburada.com/");
        //sayfada cikan cookiesleri yok et
        HepsiBuradaPages hepsiBuradaPages= new HepsiBuradaPages();
        hepsiBuradaPages.cookies.click();
        //sayfaya gittigini test et
        SoftAssert softAssert=new SoftAssert();
        System.out.println(Driver.getDriver().getTitle());
        String expected="Hepsiburada.com";
        String actiol= Driver.getDriver().getTitle();
        softAssert.assertEquals(actiol,expected);
        //seçeneklerden moda kısmına tıklayın
        //Kadın bölümünden kaban kısmını seciniz
        //Sol paneldeki filtreleme bolumunden beden olarak small renk olarak ise siyahı seciniz
        //secim yapildiktan sonra sag kösede yer alan sıralama secenegine basiniz ve cok satanlar kismina tıklayiniz
        //listelenen urun sayisinin 100'den fazla oldugunu dogrulayiniz
        //ilk sirada cikan urune tiklayiniz ve sepete ekleyiniz
        //sepetinize gidip alisverisi tamamla butonuna basiniz
        //siteye uye girisi yapmadan girdiginizi dogrulayiniz




    }
}
