package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YoutubePage;
import utilities.Driver;

public class Q1 {

    @Test
    public void Test01(){
        // 1) https://www.youtube.com adresine gidin
        Driver.getDriver().get("https://www.youtube.com");

        //2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin

        String expectedTitle= "Youtube";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Test
    public void Test02(){
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin

        YoutubePage youtubePage= new YoutubePage();
        youtubePage.YoutubeLogo.isDisplayed();


    }

    @Test
    public void Test03 (){
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())

        YoutubePage youtubePage=new YoutubePage();
        youtubePage.search.isEnabled();


    }


    @Test
    public void Test04(){
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

        String expected="youtube";
        String actual= Driver.getDriver().getTitle();

        Assert.assertFalse(actual.contains(expected));
    }

}
