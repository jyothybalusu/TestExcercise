package automation.Stepdefs;

import automation.Pages.VehicleEnquiryPage;
import cucumber.api.java.en.And;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class VehicleEnquiry {

    @And("^I enter the Vehicle Registration Number \"([^\"]*)\" and continue$")
    public void iEnterTheVehicleRegistrationNumberAndContinue(String regNumber) throws Throwable {
        //Enters Vehicle Registration Number and Continues

        assertTrue("verify vehicle Registration number is entered: ", ((VehicleEnquiryPage) TestScenario.landingPage).enterVehicleRegNumber(regNumber));
        assertNotNull("verify conitnue button is clicked: ", ((VehicleEnquiryPage) TestScenario.landingPage).clickStartButton());
        TestScenario.pageType = "ConfirmVehiclePage";

    }

}
