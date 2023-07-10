package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinition",
        tags = "@SmokeTest",
        plugin = {"pretty","html:reports/SmokeReport.html","json:reports/SmokeReport.json"})
public class TestRunner_SmokeTest extends AbstractTestNGCucumberTests {

}