package PageFactory;

import BasicFuntionality.Drop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingReview {
//Passengers
    @FindBy(xpath = "//input[@name='passFirst0']") private WebElement FirstN1;
    @FindBy(xpath = "//input[@name='passLast0']") private WebElement LastN1	;
    @FindBy(xpath = "//select[@name='pass.0.meal']") private WebElement Meal1;

    @FindBy(xpath = "//input[@name='passFirst1']") private WebElement FirstN2;
    @FindBy(xpath = "//input[@name='passLast1']") private WebElement LastN2	;
    @FindBy(xpath = "//select[@name='pass.1.meal']") private WebElement Meal2;
    @FindBy(xpath = "//select[@name='creditCard']") private WebElement Card;
    @FindBy(xpath = "//input[@name='creditnumber']") private WebElement Number;
    @FindBy(xpath = "//select[@name='cc_exp_dt_mn']") private WebElement Exp1;
    @FindBy(xpath = "//select[@name='cc_exp_dt_yr']") private WebElement Exp2;
    @FindBy(xpath = "//input[@name='cc_frst_name']") private WebElement First;
    @FindBy(xpath = "//input[@name='cc_mid_name']") private WebElement Middle;
    @FindBy(xpath = "//input[@name='cc_last_name']") private WebElement Last;
//Billing address
    @FindBy(xpath = "//input[@name='billAddress1']") private WebElement BillAdd1;
    @FindBy(xpath = "//input[@name='billAddress2']") private WebElement BillAdd2;
    @FindBy(xpath = "//input[@name='billCity']") private WebElement Citya;
    @FindBy(xpath = "//input[@name='billState']") private WebElement Statea;
    @FindBy(xpath = "//input[@name='billZip']") private WebElement Postala;
    @FindBy(xpath = "//select[@name='billCountry']") private WebElement Countrya;
//Delivery Address
    @FindBy(xpath = "//input[@name='delAddress1']") private WebElement Addressa1;
    @FindBy(xpath = "//input[@name='delAddress2']") private WebElement Addressa2;
    @FindBy(xpath = "//input[@name='delCity']") private WebElement Cityb;
    @FindBy(xpath = "//input[@name='delState']") private WebElement Stateb;
    @FindBy(xpath = "//input[@name='delZip']") private WebElement Postalb;
    @FindBy(xpath = "//select[@name='delCountry']") private WebElement Countryb;

    @FindBy(xpath = "//input[@name='buyFlights']") private WebElement Purchase;
    @FindBy(xpath = "//td[3]//a[1]//img[1]") private WebElement logout;


    public BookingReview(WebDriver driver) {
        PageFactory.initElements( driver ,this );
    }

    public void FN(String A1) { FirstN1.sendKeys( A1 ); }
    public void LN(String B1) { LastN1.sendKeys( B1 ); }
    public void Mea(){ Drop.Dropdown( Meal1,"Vegetarian"); }
    public void FN1(String A2) { FirstN2.sendKeys( A2 ); }
    public void LN1(String B2) { LastN2.sendKeys( B2 ); }
    public void Mea1(){ Drop.Dropdown( Meal2,"Hindu"); }
    public void Cad(){ Drop.Dropdown( Card,"Visa"); }
    public void Num(String Nu1) { Number.sendKeys( Nu1 ); }
    public void e1(){ Drop.Dropdown( Exp1,"02"); }
    public void e2(){ Drop.Dropdown( Exp2,"2008"); }
    public void fw(String Fs1) { First.sendKeys( Fs1 ); }
    public void mw(String Md1) { Middle.sendKeys( Md1 ); }
    public void Lw(String Ls1) { Last.sendKeys( Ls1 ); }

    public void b1(String ba1) { BillAdd1.sendKeys( ba1); }
    public void b2(String ba2) { BillAdd2.sendKeys( ba2 ); }
    public void c1(String ci1) { Citya.sendKeys( ci1 ); }
    public void s1(String st1) { Statea.sendKeys( st1); }
    public void p1(String po1) { Postala.sendKeys( po1 ); }
    public void Con(){ Drop.Dropdown( Countrya,"PUERTO RICO "); }

    public void a1(String ad1) { Addressa1.sendKeys( ad1); }
    public void a2(String ad2) { Addressa2.sendKeys( ad2 ); }
    public void c2(String ci2) { Cityb.sendKeys( ci2); }
    public void s2(String st2) { Stateb.sendKeys( st2); }
    public void p2(String po2) { Postalb.sendKeys( po2); }
    public void Con1(){ Drop.Dropdown( Countryb,"GUAM "); }
    public void pur() { Purchase.click(); }
    public void log() { logout.click(); }


}
