package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.opensite.stepdefs",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true,
        publish = true
)
public class testRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    public Object[][] scenario(){
        return super.scenarios();
    }
}

