package Utility;

import BaseClass.DriverImpl;

public class LoginUtil extends DriverImpl {

    public LoginUtil(int flag){
        super(flag);
    }

    public static void Driver(String browser) throws Exception{
        if(browser.equalsIgnoreCase("Chrome")){
            DriverImpl d = new DriverImpl(1);
        }
        else if(browser.equalsIgnoreCase("Edge")){
            DriverImpl d = new DriverImpl(2);
        }
        else{
            System.out.println("Browser is not correct");
            throw new Exception("Browser is not correct");
        }
    }

    public static void login(String browser) throws Exception{
        LoginUtil.Driver(browser);
        driver.get(GlobalVariables.url);
    }

    public static void close(){
        driver.quit();
    }
}
