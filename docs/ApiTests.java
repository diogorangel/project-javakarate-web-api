package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/03_APITests.feature",
    glue = {"steps", "hooks"},
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    plugin = {
        "pretty", 
        "html:evidence/cucumber-reports.html", 
        "json:evidence/cucumber.json",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        // "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
        "json:target/cucumber-reports/cucumber.json" 
    },
    tags = "@API_AllTests",
    monochrome = true
)
public class ApiTests {
}