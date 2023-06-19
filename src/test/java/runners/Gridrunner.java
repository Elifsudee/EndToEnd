package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features="src/test/resources", //resorsunun altindakilerin hepsini calistri
        glue= {"stepDefinitions","hooks"},
        tags="@grid_feature",
        dryRun= false
)
public class Gridrunner {

}
