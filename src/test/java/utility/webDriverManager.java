package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class webDriverManager {

    public static WebDriver driver;

    public static void launchDriver(String browser){
        if (browser.toUpperCase().equals("CHROME")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.toUpperCase().equals("FIREFOX")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }
}
