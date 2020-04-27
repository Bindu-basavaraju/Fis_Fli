package PageFactory;

import BasicFuntionality.Drop;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Tab {

    //Register tab
    @FindBy(xpath = ".//a[contains(text(),'REGISTER')]") private WebElement Register;
    //Register link in home page
    @FindBy(xpath = ".//a[contains(text(),'Register')]") private WebElement Registerlink;
    //Register link on signin page
    @FindBy(xpath = ".//a[contains(text(),'registration')]") private WebElement Registerform;

    @FindBy(xpath = "//input[@name='firstName']") private WebElement First_name;
    @FindBy(xpath = "//input[@name='lastName']") private WebElement Last_name;
    @FindBy(xpath = "//input[@name='phone']") private WebElement Phone;
    @FindBy(xpath = "//input[@id='userName']") private WebElement Email;
    @FindBy(xpath = "//input[@name='address1']") private WebElement Address1;
    @FindBy(xpath = "//input[@name='address2']") private WebElement Address2;
    @FindBy(xpath = "//input[@name='city']") private WebElement city;
    @FindBy(xpath = "//input[@name='state']") private WebElement State_Province;
    @FindBy(xpath = "//input[@name='postalCode']") private WebElement Postal_Code;
    @FindBy(xpath = "//select[option[text()='INDIA ']]") private WebElement Country;
    @FindBy(xpath = "//input[@id='email']") private WebElement User_Name;
    @FindBy(xpath = "//input[@name='password']") private WebElement Reg_Password;
    @FindBy(xpath = "//input[@name='confirmPassword']") private WebElement Reg_Confirm;
    @FindBy(xpath = "//input[@name='register']") private WebElement Submit;
    @FindBy(xpath = "//a[contains(text(),'sign-in')]") private WebElement Sign_in;


    public Registration_Tab(ChromeDriver driver) {
        PageFactory.initElements( driver ,this );
        //pagefactory--modulatedriven framewrk

    }

    public void Regis() { Register.click(); }
    public void Regisl() { Registerlink.click(); }
    public void Regisf() { Registerform.click(); }

    public void First(String F1) { First_name.sendKeys( F1 ); }
    public void Last(String L1) { Last_name.sendKeys( L1 ); }
    public void Ph(String ph1) { Phone.sendKeys( ph1 ); }
    public void Em(String Em1) { Email.sendKeys( Em1 ); }
    public void Add1(String Ad1) { Address1.sendKeys( Ad1 ); }
    public void Add2(String Ad2) { Address2.sendKeys( Ad2 ); }
    public void City(String C1) { city.sendKeys( C1 ); }
    public void State(String S1) { State_Province.sendKeys( S1 ); }
    public void Code(String Co1) { Postal_Code.sendKeys( Co1 ); }
    public void Country1(){ Drop.Dropdown( Country,"INDIA "); }
    public void UN(String Un1) { User_Name.sendKeys( Un1 ); }
    public void Reg(String Reg1) { Reg_Password.sendKeys( Reg1 ); }
    public void Reg_c(String Reg_c1) { Reg_Confirm.sendKeys( Reg_c1 ); }
    public void Sub() { Submit.click(); }
    public void Sign() { Sign_in.click(); }


}
