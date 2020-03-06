package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;


//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features"
        ,glue = "steps"
        ,plugin = {"json:target/reports/cucumber-json.json","html:target/reports/htmlreport"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
/**
 * Created by Amritansh Diwakar on 29-02-2020
 */
}
