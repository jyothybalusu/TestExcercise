package automation.Pages;

import automation.driver.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import static junit.framework.TestCase.assertTrue;

public class ViewVehiclePage  extends Page {


    public WebElement vehicleMake = driver.findElement(By.xpath("//span[text()='Vehicle make: ']/following-sibling::span"));
    public WebElement yearRegistartion = driver.findElement(By.xpath("//span[text()='Date of first registration: ']/following-sibling::span"));
    public WebElement yearManufactured = driver.findElement(By.xpath("//span[text()='Year of manufacture: ']/following-sibling::span"));
    public WebElement cylindercapacityVal = driver.findElement(By.xpath("//span[text()='Cylinder capacity (cc): ']/following-sibling::span"));
    public WebElement cotwoVal = driver.findElement(By.xpath("//span[text()='CO₂Emissions: ']/following-sibling::span"));
    public WebElement fuelVal = driver.findElement(By.xpath("//span[text()='Fuel type: ']/following-sibling::span"));
    public WebElement exportmakerVal = driver.findElement(By.xpath("//span[text()='Export marker: ']/following-sibling::span"));
    public WebElement statusVal = driver.findElement(By.xpath("//span[text()='Vehicle status: ']/following-sibling::span"));
    public WebElement colourVal = driver.findElement(By.xpath("//span[text()='Vehicle colour: ']/following-sibling::span"));
    public WebElement typeapprovalVal = driver.findElement(By.xpath("//span[text()='Vehicle type approval: ']/following-sibling::span"));
    public WebElement wheelplanVal = driver.findElement(By.xpath("//span[text()='Wheelplan: ']/following-sibling::span"));
    public WebElement revenueweightVal = driver.findElement(By.xpath("//span[text()='Revenue weight: ']/following-sibling::span"));

    public ViewVehiclePage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean isLoaded() throws Throwable {
        try {
            vehicleMake.isDisplayed();
            return true;
        } catch (Throwable e) {
            throw new Exception("View Vehicle Page is not loaded: " + e.getMessage());
        }
    }

    public boolean viewVehicleDetails(String make, String yearOfFirstReg, String yearOfMake,String cylindercapacity, String cotwo, String fuel, String exportmaker, String status, String colour, String typeapproval, String wheelplan, String revenueweight) throws Throwable {
        try {
            assertTrue("Vehicle make retrived is same as the inout",vehicleMake.getText().equalsIgnoreCase(make));
            assertTrue("Vehicle year of registration retrived is same as the input",yearRegistartion.getText().equalsIgnoreCase(yearOfFirstReg));
            assertTrue("Vehicle year of make retrived is same as the input",yearManufactured.getText().equalsIgnoreCase(yearOfMake));
            assertTrue("Vehicle yclinder capacity is same as the input",cylindercapacityVal.getText().equalsIgnoreCase(cylindercapacity));
            assertTrue("Vehicle c02 emissions retrived is same as the input",cotwoVal.getText().equalsIgnoreCase(cotwo));
            assertTrue("Vehicle fuel retrived is same as the input",fuelVal.getText().equalsIgnoreCase(fuel));
            assertTrue("Vehicle export maker retrived is same as the input",exportmakerVal.getText().equalsIgnoreCase(exportmaker));
            assertTrue("Vehicle status retrived is same as the input",statusVal.getText().equalsIgnoreCase(status));
            assertTrue("Vehicle colour retrived is same as the input",colourVal.getText().equalsIgnoreCase(colour));
            assertTrue("Vehicle type approval retrived is same as the input",typeapprovalVal.getText().equalsIgnoreCase(typeapproval));
            assertTrue("Vehicle wheel plan retrived is same as the input",wheelplanVal.getText().equalsIgnoreCase(wheelplan));
            assertTrue("Vehicle revenue weight retrived is same as the input",revenueweightVal.getText().equalsIgnoreCase(revenueweight));
            driver.quit();
            return true;
        } catch (Exception e) {
            throw new Exception("Unable to view vehicle details: " + e.getMessage());
        }
    }
}

