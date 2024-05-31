package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = { "src/test/resources/FeaturesWithTags" }, glue = {
		"StepDefinitions" }, plugin = { "pretty", "html:target/HtmlReport.html" })
public class CucumberTestRunner extends AbstractTestNGCucumberTests{

}
