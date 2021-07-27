package hudl.project.pageObjects;

import core.driverManager.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        this.driver = DriverFactory.getCurrentDriver();
        wait = new WebDriverWait(this.driver, 5);
    }

    protected void openPage(String url) {
        driver.get(url);
    }

    protected String getTitleText() {
        return driver.getTitle();
    }

    protected String getText(By by) {
        return driver.findElement(by).getText();
    }

    protected void click(By by) {
        driver.findElement(by).click();
    }

    protected void input(By by, String keys) {
        driver.findElement(by).sendKeys(keys);
    }

    protected boolean disabled(By by) {
        return !(driver.findElement(by).isEnabled());
    }

    protected WebElement waitForElementToBePresent(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
