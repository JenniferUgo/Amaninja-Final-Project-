import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.jenny.selenium"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class CucumberRunner {
}
