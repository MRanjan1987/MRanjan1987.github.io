package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features = ".//src/test/resources/features/ApiTest.feature",
glue = "stepdefinitions",
dryRun=false,
plugin = { "pretty","html:target/cucumber-reports.html" })
public class TestRunner extends AbstractTestNGCucumberTests {
}
