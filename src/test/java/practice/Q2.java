package practice;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class Q2 {

    @Test()
    public void test01(){
        //● https://www.amazon.com/ adresine gidin.
        Driver.getDriver().get("https://www.amazon.com/ ");
        //1. Test : Amazon ana sayfaya gittiginizi test edin

        String expectedTitle="https://www.amazon.com/";
        String actualTitle= Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(dependsOnMethods = "test01")
    public void tes02(){
        //2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
        //ve aramanizin gerceklestigini Test edin

        AmazonPage amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


    }

    @Test(dependsOnMethods = "test02")
    public void test03(){

        //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83
        //oldugunu test edin

        AmazonPage amazonPage=new AmazonPage();

        String expected="$16.83" ;
        String actial= amazonPage.ilkUrun.getText();

       Assert.assertTrue(actial.contains(expected));




    }

}
