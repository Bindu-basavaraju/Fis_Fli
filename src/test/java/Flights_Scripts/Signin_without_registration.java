package Flights_Scripts;

import BasicFuntionality.GenericFunctions;
import PageFactory.FlightBooking;
import PageFactory.Signin;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Signin_without_registration extends GenericFunctions {

//not Registerd and trying to login

    @BeforeClass
    public void initialize() throws Exception {
        initialization();
    }

    @Test(priority = 1)
    public void sign() throws InterruptedException, IOException {
        // WebDriver driver = new ChromeDriver();
        Signin si = new Signin( driver );
       si.Un1( "testy" );
       si.pss1( "123456" );
       si.sub1();
        //File scrFile = ((TakesScreenshot)driver).getScreenshotAs( OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File(".Fis_Fli\\Screenshots\\screenshot.png"));
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs( OutputType.FILE );
        FileUtils.copyFile( source, new File( "./Screenshots" ) );
        System.out.println( "the Screenshot is taken" );
        Thread.sleep( 2000 );

    }
    @Test(priority = 2)
    public void  Flight()  throws InterruptedException {
        FlightBooking fb = new FlightBooking( driver );

        fb.fly();
         assertss( driver.getTitle(), "Welcome: Mercury Tourss" );

            System.out.println( "Assert passed: Home page title" );
        }






    @AfterClass
    public void signoff() throws Exception {
        Logout();
    }

}