package com.e2e.runners;
import io.cucumber.junit.Cucumber;
//import net.thucydides.core.environment.SystemEnvironmentVariables;
//import net.thucydides.core.util.EnvironmentVariables;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@Slf4j
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue="com.e2e.glue",
        tags= "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class    WebRunnerTest {
    //private static final EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    private WebRunnerTest() {
    }
}