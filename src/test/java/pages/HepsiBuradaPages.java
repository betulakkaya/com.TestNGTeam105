package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiBuradaPages {

    public HepsiBuradaPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="onetrust-accept-btn-handler")
    public WebElement cookies;



}
