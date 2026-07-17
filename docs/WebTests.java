package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/02_WebTests.feature",
    glue = {"steps", "hooks"},
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    plugin = {
        "pretty",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", 
        "html:evidence/cucumber-reports.html", 
        "json:evidence/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
        "json:target/cucumber-reports/cucumber.json"
    },
    tags = "@001_Login_StandardUser",
    monochrome = true
)
public class WebTests {
}