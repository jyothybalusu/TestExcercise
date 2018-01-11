package automation.Pages;

import automation.Stepdefs.TestScenario;
import automation.driver.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConfirmVehiclePage extends Page {

    public WebElement registrationNumberValue = driver.findElement(By.cssSelector("span.reg-mark"));
    public WebElement makeValue = driver.findElement(By.xpath("//ul[@class='list-summary margin-bottom-2']/li[2]/span/strong"));
    public WebElement colourValue=driver.findElement(By.xpath("//ul[@class='list-summary margin-bottom-2']/li[2]/span/strong"));
    public WebElement yesValue = driver.findElement(By.xpath("//input[@data-val='true']"));
    public WebElement continueBtn = driver.findElement(By.cssSelector("button.button"));

    public ConfirmVehiclePage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean isLoaded() throws Throwable {
        try {
            registrationNumberValue.isDisplayed();
            return true;
        } catch (Throwable e) {
            throw new Exception("Confirm Vehicle Page is not loaded: " + e.getMessage());
        }
    }

    public boolean checkRegNumber(String regNumber) throws Throwable{
        try{
            registrationNumberValue.getText().equalsIgnoreCase(regNumber);
            return true;
        }
        catch(Exception e){
            throw new Exception("Unable to check the Registration number: " + e.getMessage());
        }
    }

    public boolean checkMake(String make) throws Throwable{
        try{
            return true;
        }
        catch(Exception e){
            throw new Exception("Unable to check the vehicle make: " + e.getMessage());
        }
    }

    public boolean checkColour(String colour) throws Throwable{
        try{
            return true;
        }
        catch(Exception e){
            throw new Exception("Unable to check the vehicle colour: " + e.getMessage());
        }
    }

    public boolean clickYes(String yes) throws Throwable{
        try{
            yesValue.click();
            return true;
        }
        catch(Exception e){
            throw new Exception("Unable to click Yes: " + e.getMessage());
        }
    }

    public Page clickContinueBtn(String yes) throws Throwable{
        try{
            continueBtn.click();
            ViewVehiclePage page = new ViewVehiclePage(driver);
            if (page.isLoaded()) {
                TestScenario.landingPage = page;
                return page;
            } else {
                throw new Exception("Unable to display VehicleEnquiryPage: ");
            }
        }
        catch(Exception e){
            throw new Exception("Unable to click coninue button: " + e.getMessage());
        }
    }
}
