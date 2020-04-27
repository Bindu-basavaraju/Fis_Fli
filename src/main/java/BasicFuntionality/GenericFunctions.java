package BasicFuntionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class GenericFunctions {


    public static  ChromeDriver driver;


    public static void initialization() throws IOException, InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/Users/B/Downloads/chromedriver" );
        Thread.sleep( 3000 );
        driver = new ChromeDriver();
        driver.get( "http://newtours.demoaut.com" );
        // driver.get( "http://newtours.demoaut.com/create_account_success.php" );
        driver.manage().window().maximize();
        Thread.sleep( 3000 );
    }


    public static void Logout() throws IOException, InterruptedException {
        driver.close();
        driver.quit();
    }
    private static Date d1=null;

    public static void fullScreenCapture(WebDriver driver) throws IOException
    {

        //ru.yandex.qatools.ashot.Screenshot sc = new AShot().shootingStrategy( ShootingStrategies.viewportPasting(1000)).takeScreenshot(dr);

        //ImageIO.write(sc.getImage(), "png", new File("./Screenshots/Booking_"+d1.toGMTString().replace(" ","_").replace(":","_")+".png"));
        Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(15000)).takeScreenshot(driver);
        ImageIO.write(fpScreenshot.getImage(),"PNG",new File("./Screenshots/FullPageScreenshot.png"));
    }


    public static void assertss(String driver, String s){
        String ActaulTiltle=driver;
        String ExpectedTitle = s;

        }


    }






