package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.JsonFormat;
import org.junit.runner.RunWith;

import java.awt.*;

@RunWith (Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/Features/ccOR3.feature",
        glue ="stepDefinations.java",
        tags="",
        dryRun = false )

public class Runner {

}
