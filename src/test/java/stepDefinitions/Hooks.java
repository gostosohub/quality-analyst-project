package stepDefinitions;

import core.driverManager.DriverFactory;
import core.fileReader.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void beforeScenario() {
        new ConfigReader();
        DriverFactory.initiateDriver();
        System.out.println("Driver opened on Thread ID:" + Thread.currentThread().getId());
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Record failure");
            var camera = (TakesScreenshot) DriverFactory.getCurrentDriver();
            final byte[] screenshot = camera.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println("Tear down");
        DriverFactory.getCurrentDriver().quit();
    }
}
