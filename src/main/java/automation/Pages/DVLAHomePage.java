package automation.Pages;

import automation.Stepdefs.TestScenario;
import automation.driver.Page;
import automation.driver.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DVLAHomePage extends Page {



    public DVLAHomePage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean load(String url) throws Throwable {
        try {
            navigateTo(url);
             return true;
        } catch (Throwable e) {
            throw new Exception("Unable to load DVLA Page: " + e.getMessage());
        }
    }

    public boolean isLoaded() throws Throwable {
        try {
            By startBtn = By.xpath("//*[@id='get-started']/a");
           if(driver.findElement(startBtn).isDisplayed())
            return true;
           else
               return false;
        } catch (Throwable e) {
            throw new Exception("Home Page not loaded: " + e.getMessage());
        }
    }

    public boolean navigateTODVLA(String url) {
        TestScenario.landingPage = new DVLAHomePage(SeleniumDriver.getDriver());
        driver.get(url);
        return true;
    }

    public Page clickStartButton() throws Throwable {
        try {
            By startBtn = By.xpath("//*[@id='get-started']/a");
            driver.findElement(startBtn).click();
            VehicleEnquiryPage page = new VehicleEnquiryPage(driver);
            if (page.isLoaded()) {
                TestScenario.landingPage = page;
                return page;
            } else {
                throw new Exception("Unable to display VehicleEnquiryPage: ");
            }
        } catch (Exception e) {
            throw new Exception("Unable to click the start button: " + e.getMessage());
        }
    }
}
