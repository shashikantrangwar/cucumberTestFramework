package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/Login.feature",
        glue = {"StepDefinitions"} ,
        plugin = {"pretty","json:target/cucumber-reports/Cucumber.json"},
        monochrome = true

)
public class Run extends AbstractTestNGCucumberTests {
  /*  @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }*/
}
