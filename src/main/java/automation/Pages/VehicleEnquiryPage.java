package automation.Pages;

import automation.Stepdefs.TestScenario;
import automation.driver.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class VehicleEnquiryPage extends Page {


    public WebElement regNumberTxtBox = driver.findElement(By.id("Vrm"));
    public WebElement continuebtn = driver.findElement(By.cssSelector("button.button"));

    public VehicleEnquiryPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean isLoaded() throws Throwable {
        try {
            regNumberTxtBox.isDisplayed();
            return true;
        } catch (Throwable e) {
            throw new Exception("Vehicle Enquiry Page is not loaded: " + e.getMessage());
        }
    }

    public boolean enterVehicleRegNumber(String regNumber) throws Throwable{
        try{

            regNumberTxtBox.click();
            regNumberTxtBox.sendKeys(regNumber);
            return true;
        }
        catch (Exception e){
            throw new Exception("Vehicle Enquiry Page is not loaded: " + e.getMessage());
        }
    }
    public Page clickStartButton() throws Throwable{
        try{
            continuebtn.click();
            ConfirmVehiclePage page = new ConfirmVehiclePage(driver);
            if (page.isLoaded()) {
                TestScenario.landingPage = page;
                return page;
            } else {
                throw new Exception("Unable to display VehicleEnquiryPage: ");
            }
        }
        catch (Exception e){
            throw new Exception("Vehicle Enquiry Page is not loaded: " + e.getMessage());
        }

    }

}
