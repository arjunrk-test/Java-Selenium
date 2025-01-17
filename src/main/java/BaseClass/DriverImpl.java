package BaseClass;

import Utility.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverImpl {
    public static WebDriver driver;

    @SuppressWarnings("deprecation")
    public DriverImpl(int flag){
        if(flag == 1){
            System.setProperty("webdriver.chrome.driver", GlobalVariables.chromeDriverpath);
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        }
        else{
            System.setProperty("webdriver.edge.driver", GlobalVariables.edgeDriverPath);
            driver = new EdgeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        }
    }
}
