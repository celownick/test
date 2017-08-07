package src.main.cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\kcabaj\\IdeaProjects\\test\\feature"
        ,glue={"src.stepdefinition"}

)
public class TestRunner {

}