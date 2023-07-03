package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", //raporların daha okunaklı olması için
                "html:src/test/resources/htmlReport/deneme1.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = false, //raporları consolda daha okunaklı olması için
        features = "src/test/resources",
        glue = {"stepDefinitions", "hooks"},
        tags = "@elif",
        dryRun = false

)

public class RunnerUI {
}
