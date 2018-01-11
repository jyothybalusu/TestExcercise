package automation.driver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDriver {

    private static RemoteWebDriver driver;
    private static long TIMEOUT = 60;


        public static RemoteWebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "//Users/Aram/Downloads/chromedriver");
            RemoteWebDriver driver= new ChromeDriver();
        return driver;
    }

    public synchronized static void closeDriver() {
        driver.quit();
        driver = null;
    }
    public static long getTimeout() {
        return SeleniumDriver.TIMEOUT;
    }
}