package automation.Stepdefs;

import automation.Pages.DVLAHomePage;
import automation.driver.SeleniumDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class DVLAStepdefs {

    @Given("^I navigate to the DVLA \"([^\"]*)\"$")
    public void iNavigateToTheDVLA(String url) throws Throwable {
        // Navigates to DVLA site
        TestScenario.landingPage = new DVLAHomePage(SeleniumDriver.getDriver());
        ((DVLAHomePage) TestScenario.landingPage).load(url);
        assertTrue("verify DVLA Home Page is Loaded: ", ((DVLAHomePage) TestScenario.landingPage).isLoaded());
    }

    @When("^I press the Start Now button$")
    public void iPressTheStartNowButton() throws Throwable {
        assertNotNull("verify start button is clicked: ", ((DVLAHomePage) TestScenario.landingPage).clickStartButton());
        TestScenario.pageType = "VehicleEnquiryPage";
    }
}
