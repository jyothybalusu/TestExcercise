package automation.Stepdefs;


import automation.Pages.ConfirmVehiclePage;
import cucumber.api.java.en.And;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ConfirmVehicle {

    @And("^I confirm that the make \"([^\"]*)\" and colour \"([^\"]*)\" details match to the Vehicle registration \"([^\"]*)\" I am looking for$")
    public void iConfirmThatTheMakeAndColourDetailsMatchToTheVehicleRegistrationIAmLookingFor(String make, String colour, String regNumber) throws Throwable {
        //Checks that the Vehicle details displayed are the right details
        assertTrue("verifies the vehicle Registration details: ", ((ConfirmVehiclePage) TestScenario.landingPage).checkRegNumber(regNumber));
        assertTrue("verifies the vehicle make: ", ((ConfirmVehiclePage) TestScenario.landingPage).checkMake(make));
        assertTrue("verifies the vehicle colour: ", ((ConfirmVehiclePage) TestScenario.landingPage).checkColour(colour));
        assertTrue("verifies the confirmation: ", ((ConfirmVehiclePage) TestScenario.landingPage).clickYes(colour));
        assertNotNull("verifies that continue button is clicked: ", ((ConfirmVehiclePage) TestScenario.landingPage).clickContinueBtn(colour));
        TestScenario.pageType = "ViewVehiclePage";
    }
}