package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Features",
        glue= {"stepdefinitions"},
        monochrome = true,
        plugin = {"json:target/cucumber-report/cucumber.json"},
        tags = {"@End2End"},
        dryRun = false,
        snippets = SnippetType.CAMELCASE
)

public class RunnerTest {

}