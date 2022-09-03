package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
    tags = "@Regression",
    features = {"src/test/java/FeatureFiles/"},
    glue = {"StepDefinitions"},
    plugin= {"html:target/site/cucumber-regression-reports.html"}
)
public class _02_TestRunnerRegression extends AbstractTestNGCucumberTests {

}
