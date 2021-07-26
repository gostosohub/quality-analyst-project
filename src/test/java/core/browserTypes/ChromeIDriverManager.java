package core.browserTypes;

import core.driverManager.IDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeIDriverManager implements IDriverManager {

    @Override
    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("window-size=1400,600");
        return new ChromeDriver(chromeOptions);
    }
}
