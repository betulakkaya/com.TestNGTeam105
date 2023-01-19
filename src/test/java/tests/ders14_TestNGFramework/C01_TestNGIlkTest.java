package tests.ders14_TestNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {

    /*
    TestNG test methodlarini isim sirasina gore calistirir
    priority degeri verilen methodlar priority degeri kucukten buyuge dogru calisir
    esit olan priority degerlerinde harf sirasina gore calisir
        eger priority degeri yazmazsak priority=0 kabul edilir
     */

    @Test (priority = 6)
    public void ilkTest (){

        System.out.println("ilk test calisti");
    }

    @Test (priority = 9)
    public void ikinciTest (){

        System.out.println("ikinci test calisti");
    }

    @Test (priority = -44)
    public void ucuncuTest (){

        System.out.println("ucuncu test calisti");
    }
}
