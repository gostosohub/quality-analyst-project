package stepDefinitions;

import core.driverManager.DriverFactory;
import core.fileReader.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenario() {
        new ConfigReader();
        DriverFactory.initiateDriver();
        System.out.println("Driver opened on Thread ID:" + Thread.currentThread().getId());
    }

    @After
    public void afterScenario() {
        DriverFactory.getCurrentDriver().quit();
    }
}
