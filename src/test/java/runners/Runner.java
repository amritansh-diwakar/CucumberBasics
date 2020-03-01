package runners;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/LoginTests.feature",
        glue = "steps"
)
public class Runner {
/**
 * Created by Amritansh Diwakar on 29-02-2020
 */
}
