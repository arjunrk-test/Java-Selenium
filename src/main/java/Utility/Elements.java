package Utility;

import BaseClass.DriverImpl;
import org.openqa.selenium.By;

public class Elements extends DriverImpl {

    public Elements(int flag){
        super(flag);
    }

    public static By username = By.cssSelector("input[name = 'username']");

}
