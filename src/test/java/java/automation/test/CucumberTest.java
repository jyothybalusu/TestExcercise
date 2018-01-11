package java.automation.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" },
        features = {"src/main/resources/Features"},
        glue = {"src/main/java/automation/Stepdefs"},
        tags={"@bb-dvla"})

public class CucumberTest {

}
