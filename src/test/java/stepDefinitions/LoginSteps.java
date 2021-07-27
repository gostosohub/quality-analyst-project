package stepDefinitions;

import core.driverManager.DriverFactory;
import hudl.project.pageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    private LoginPage login;

    public LoginSteps() {
        login = new LoginPage();
    }

    @Given("I am on the Login page")
    public void iAmOnTheLoginPage() {
        login.open();
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        login.setEmailInput(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        login.setPasswordInput(password);
    }

    @Then("I expect to be on the login page")
    public void iShouldBeSeeTheLoginPage() {
        Assert.assertEquals(login.getTitle(), "Log In - Hudl");
    }

    @Then("I expect to see an error message as {string}")
    public void iExpectToSeeAnErrorMessageAs(String errorMessage) {
        Assert.assertEquals(login.getErrorMessage(), errorMessage);
    }

    @And("The Log In button is disabled")
    public void loginButtonIsDisabled() {
        Assert.assertEquals(login.isLoginButtonDisabled(), true);
    }

    @When("I click on the Log In submit button")
    public void iClickOnTheButton() {
        login.clickOnSubmitButton();
    }

    @When("I click on the Need help? link")
    public void iClickOnTheNeedHelpLink() {
        login.clickForgotPasswordLink();
    }

    @Then("I expect to be see Login Help form")
    public void iExpectToBeSeeLoginHelpForm() {
        Assert.assertTrue(login.isLoginHelpFormVisible());
    }
}
