package hudl.project.pageObjects;

import core.driverManager.DriverFactory;
import core.fileReader.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        this.driver = DriverFactory.getCurrentDriver();
        wait = new WebDriverWait(this.driver, 5);
    }


    public void setPrerequisites() {
        new ConfigReader();
    }

    @Before
    public void setup() {
        DriverFactory.initiateDriver();
        System.out.println("Driver opened on Thread ID::" + Thread.currentThread().getId());
    }

    @After
    public void tearDown() {
        DriverFactory.getCurrentDriver().quit();
    }

    protected void openPage(String url) {
        driver.get(url);
    }

    protected String getText(By by) {
        return driver.findElement(by).getText();
    }

    protected void click(By by) {
        driver.findElement(by).click();
    }

    private WebElement waitForElementToBePresent(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
