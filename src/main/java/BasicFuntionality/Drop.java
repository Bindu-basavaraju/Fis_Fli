package BasicFuntionality;

import com.mongodb.gridfs.CLI;
import com.thoughtworks.selenium.webdriven.commands.Click;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drop {

        public static void Dropdown(WebElement ele, String value) {
            Select S = new Select( ele );
            S.selectByVisibleText( value );
        }

}

