package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {


    @FindBy(xpath = "//input[@name='userName']") private WebElement UN;
    @FindBy(xpath = "//input[@name='password']") private WebElement Pss;
    @FindBy(xpath = "//input[@name='login']") private WebElement Sub;

    public Signin(WebDriver driver) {
        PageFactory.initElements( driver ,this );
        //pagefactory--modulatedriven framewrk

    }

    public void Un1(String u1) { UN.sendKeys( u1 ); }
    public void pss1(String p1) { Pss.sendKeys( p1 ); }
    public void sub1() { Sub.click(); }

}
