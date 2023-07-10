package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinition",
        tags = "@RegressionTest",
        plugin = {"pretty","html:reports/RegressionReport.html","json:reports/RegressionReport.json"})
public class TestRunner_RegressionTest extends AbstractTestNGCucumberTests {

}