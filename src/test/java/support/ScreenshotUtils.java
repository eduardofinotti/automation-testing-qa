package support;


import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import runner.RunTest;

public class ScreenshotUtils extends RunTest {

    public static void addScreenshotOnScenario(Scenario scenario) {
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }
}
