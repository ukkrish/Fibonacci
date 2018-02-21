package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "/Users/krish/Documents/Automation/gitclones/fobonacciTestProj/src/test/java/features/fibonacci.feature"
        , glue = {"fibonacci"}
       , format = {"pretty","html:test-output"}
      //    , format = {"pretty", “junit:junit_xml/cucumber.xml“}
       , dryRun = false
       , monochrome = true
      ,  strict = true
)


public class testrunner {


}
