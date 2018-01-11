package automation.driver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    protected RemoteWebDriver driver;
    protected WebDriverWait wait;

    public Page(RemoteWebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, SeleniumDriver.getTimeout());
    }
    public Page navigateTo(String url) throws Throwable {
        try {
            driver.get(url);
            return new Page(driver);
        } catch (Exception e) {
            throw e;
        }
    }


}
