package Flights_Scripts;

import BasicFuntionality.GenericFunctions;
import PageFactory.Registration_Tab;
import PageFactory.Signin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registration_Signin_Signoff_a extends GenericFunctions {

    @BeforeClass
    public void initialize() throws Exception {
        initialization();
    }

// Register>>Sigin>>Close

    @Test(priority = 1)
    public void  Regis() throws InterruptedException {
        // WebDriver driver = new ChromeDriver();
        Registration_Tab Re= new Registration_Tab(driver);
        Re.Regis();
        Thread.sleep( 3000 );
        Re.First( "Bindu" );
        Re.Last("Basavaraju"  );
        Re.Ph( "9141000000" );
        Re.Em( "test@gmail.com" );
        Re.Add1( "Girinagar" );
        Re.Add2( "Banglore " );
        Re.City( "Bengaluru" );
        Re.State( "Karnataka" );
        Re.Code( "561203" );
        Re.Country1( );
        Re.UN( "Test" );
        Re.Reg("Test123"  );
        Re.Reg_c( "Test123" );
        Re.Sub();
        Thread.sleep( 3000 );
        Re.Sign();
        Thread.sleep( 3000 );
    }


    @Test(priority = 2)
    public void  Sign() {
        Signin sn = new Signin( driver );

        sn.Un1( "Test" );
        sn.pss1( "Test123" );
        sn.sub1();

    }

    @AfterClass
    public void signoff() throws Exception{
        Logout();
    }



}
//Assert.assertEquals(ActualTitle, ExpectedTitle);
//System.out.println(“Assert passed”);
