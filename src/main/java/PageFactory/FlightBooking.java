package PageFactory;

import BasicFuntionality.Drop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking {

//----Flight finder
    @FindBy(xpath = "//a[contains(text(),'Flights')]") private WebElement Flight;
    @FindBy(xpath = "(//input [@type='radio'])[2]") private WebElement Type;
    @FindBy(xpath = "//body//b//input[1]") private WebElement Type1;
    @FindBy(xpath = "//select[@name='passCount']") private WebElement Passengers;
    @FindBy(xpath = "//select[@name='passCount']") private WebElement Passengers1;

    @FindBy(xpath = "//select[@name='fromPort']") private WebElement Departing;
    @FindBy(xpath = "//select[@name='fromMonth']") private WebElement on_month;
    @FindBy(xpath = "//select[@name='fromDay']") private WebElement  on_day;
    @FindBy(xpath = "//select[@name='toPort']") private WebElement Arriving;
    @FindBy(xpath = "//select[@name='toMonth']") private WebElement Re_month;
    @FindBy(xpath = "//select[@name='toDay']") private WebElement Re_day;
    @FindBy(xpath = "(//input [@type='radio'])[4]") private WebElement Service_Class;
    @FindBy(xpath = "//select[@name='airline']") private WebElement Airline;
    @FindBy(xpath = "//input[@name='findFlights']") private WebElement Continue1;

//----select flight

    @FindBy(xpath = "(//input [@type='radio'])[4]") private WebElement DEPART;
    @FindBy(xpath = "(//input [@type='radio'])[6]") private WebElement RETURN;
    @FindBy(xpath = "//input[@name='reserveFlights']") private WebElement Continue2;


    public FlightBooking(WebDriver driver) {
        PageFactory.initElements( driver ,this );
    }

    public void fly() { Flight.click(); }
   // public void Country1(){ Drop.Dropdown( Country,"INDIA "); }

    public void Ty(){Type.click();}
    public void Ty1(){Type1.click();}

    public void pass(){ Drop.Dropdown( Passengers,"2");}
    public void pass1(){ Drop.Dropdown( Passengers1,"1");}

    public void Dep(){ Drop.Dropdown( Departing,"New York"); }
    public void Om(){ Drop.Dropdown( on_month,"January"); }
    public void Od(){ Drop.Dropdown( on_day,"8"); }
    public void Arr(){ Drop.Dropdown( Arriving,"London"); }
    public void Rm(){ Drop.Dropdown( Re_month,"January"); }
    public void Rd(){ Drop.Dropdown( Re_day,"10"); }
    public void Sc(){Service_Class.click();}
    public void Air(){ Drop.Dropdown( Airline,"Pangea Airlines"); }
    public void Con1(){Continue1.click();}
    public void De(){DEPART.click();}
    public void Re(){RETURN.click();}
    public void Con2(){Continue2.click();}





}
