package automation.Stepdefs;

import automation.Pages.ViewVehiclePage;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;

public class ViewVehicle {

    @Then("^I check the make \"([^\"]*)\", date of first registration \"([^\"]*)\", year of make \"([^\"]*)\", cylinder capacity \"([^\"]*)\",cotwo \"([^\"]*)\",fuel \"([^\"]*)\",exportmaker \"([^\"]*)\", status \"([^\"]*)\",colour \"([^\"]*)\",typeapproval \"([^\"]*)\",wheelplan \"([^\"]*)\" and revenue weight \"([^\"]*)\"$")
    public void iCheckTheMakeDateOfFirstRegistrationYearOfMakeCylinderCapacityCotwoFuelExportmakerStatusColourTypeapprovalWheelplanAndRevenueWeight(String make, String yearOfFirstReg, String yearOfMake, String cylindercapacity, String cotwo, String fuel,String exportmaker, String status, String colour, String typeapproval, String wheelplan, String revenueweight) throws Throwable {
           //Views the displayed Vehicle details
            assertTrue("Verify that the View Vehicle details are right: ", ((ViewVehiclePage) TestScenario.landingPage).viewVehicleDetails(make, yearOfFirstReg, yearOfMake, cylindercapacity, cotwo, fuel, exportmaker, status, colour, typeapproval, wheelplan, revenueweight));

    }
}
