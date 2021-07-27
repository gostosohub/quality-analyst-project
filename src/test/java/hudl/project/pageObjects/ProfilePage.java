package hudl.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfilePage extends BasePage {

    private By displayName = By.className("hui-globaluseritem__display-name");

    public String getTitle() {
        return getTitleText();
    }

    public boolean isDisplayNameVisible() {
        WebElement webElement = waitForElementToBePresent(displayName);
        return webElement.isDisplayed();
    }
}
