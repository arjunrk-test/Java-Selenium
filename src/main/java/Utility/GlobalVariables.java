package Utility;

public class GlobalVariables {
    public static String userName = System.getProperty("user.name");
    public static String projectDir = System.getProperty("user.dir");
    public static String chromeDriverpath = projectDir + "\\Drivers\\chromedriver.exe";
    public static String edgeDriverPath = projectDir + "\\Drivers\\msedgedriver.exe";
    public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public static String loginUserName = "Admin";
    public static String loginUserPassword = "admin123";
}
