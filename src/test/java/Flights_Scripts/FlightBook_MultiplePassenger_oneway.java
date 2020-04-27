package Flights_Scripts;

import BasicFuntionality.GenericFunctions;
import PageFactory.BookingReview;
import PageFactory.FlightBooking;
import PageFactory.Registration_Tab;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class FlightBook_MultiplePassenger_oneway extends GenericFunctions {

    @BeforeClass
    public void initialize() throws Exception {
        initialization();
    }

    //Resgister tab >>flights.>booking>>logout
    @Test(priority = 1)
    public void  Regis1() throws InterruptedException {
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
        Thread.sleep( 5000 );
        //Re.Sign();
    }
    @Test(priority = 2)
    public void  Flight()  throws InterruptedException  {
        FlightBooking fb=new FlightBooking(driver)   ;

        fb.fly();
        Thread.sleep( 3000 );
        fb.Ty1();
        fb.pass( );
        fb.Dep( );
        fb.Om( );
        fb.Od( );
        fb.Arr( );
        fb.Rm( );
        fb.Rd( );
        fb.Sc( );
        fb.Air( );
        fb.Con1( );
        Thread.sleep( 3000 );
        fb.De( );
        fb.Re( );
        fb.Con2( );
        Thread.sleep( 3000 );
    }
    @Test(priority = 3)
    public void Book() throws InterruptedException, IOException {

        BookingReview Br = new BookingReview( driver );
        Thread.sleep( 2000 );
        Br.FN( "Test1" );
        Br.LN( "Test1" );
        Br.Mea();
        Thread.sleep( 2000 );
        Br.FN1( "Test2" );
        Br.LN1( "Test2" );
        Br.Mea1();
        Br.Cad();
        Br.Num( "1234567890" );
        Br.e1();
        Br.e2();
        Br.fw( "Bindu" );
        Br.mw( "Basavaraju" );
        Br.Lw( "Dhumbi" );
        Br.b1( "banglore" );
        Br.b2( "Bengaluru" );
        Br.c1( "Banglore city" );
        Br.s1( "Karnataka" );
        Br.p1( "561203" );
        Br.Con();
        Br.a1( "banglore" );
        Br.a2( "Bengaluru" );
        Br.c2( "Banglore city" );
        Br.s2( "Karnataka" );
        Br.p2( "561203" );
        Br.Con1();
        Br.pur();
        Thread.sleep( 2000 );
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs( OutputType.FILE);
        FileUtils.copyFile(source, new File("./Screenshots/ss.png"));
        System.out.println("the Screenshot is taken");
        Thread.sleep( 2000 );
        Thread.sleep( 2000 );
        Br.log();
    }

    @AfterClass
    public void signoff() throws Exception{
        Logout();
    }




}
