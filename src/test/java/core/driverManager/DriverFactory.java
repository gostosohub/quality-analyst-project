package core.driverManager;


import core.browserTypes.ChromeIDriverManager;
import core.browserTypes.FirefoxIDriverManager;
import core.fileReader.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    public static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<WebDriver>();

    public static void initiateDriver() {

        WebDriver driver = null;

        String browserType = ConfigReader.getProperty("browser");

        switch (BrowserType.valueOf(browserType.toUpperCase())) {
            case CHROME:
                driver = new ChromeIDriverManager().getDriver();
                break;
            case FIREFOX:
                driver = new FirefoxIDriverManager().getDriver();
                break;
            default:
                throw new IllegalStateException("UnSupported Browser Type provided");
        }
        driverThreadLocal.set(driver);
    }

    public static WebDriver getCurrentDriver() {
        return driverThreadLocal.get();
    }
}
