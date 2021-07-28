package core.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"})
public class TestRunner extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider( parallel = true)
        public Object[][] scenarios(){
                return super.scenarios();
        }

}
