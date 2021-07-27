package hudl.project.pageObjects;

import core.fileReader.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private String pageUrl = ConfigReader.getProperty("baseUrl").replace("en_gb/", "").concat("login");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By logInSubmitButton = By.id("logIn");
    private By errorDiv = By.className("login-error-container");
    private By forgotPasswordLink = By.id("forgot-password-link");
    private By resetForm = By.className("reset-info");

    public String getTitle() {
        return getTitleText();
    }

    public void open() {
        System.out.println("Navigating to " + pageUrl);
        openPage(pageUrl);
    }

    public void setEmailInput(String keys) {
        input(emailInput, keys);
    }

    public void setPasswordInput(String keys) {
        input(passwordInput, keys);
    }

    public String getErrorMessage() {
        return waitForElementToBePresent(errorDiv).getText();
    }

    public boolean isLoginButtonDisabled() {
        return disabled(logInSubmitButton);
    }

    public void clickOnSubmitButton() {
        click(logInSubmitButton);
    }

    public void clickForgotPasswordLink() {
        click(forgotPasswordLink);
    }

    public boolean isLoginHelpFormVisible() {
        WebElement webElement = waitForElementToBePresent(resetForm);
        return webElement.isDisplayed();
    }
}
