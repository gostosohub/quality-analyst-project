package stepDefinitions;

import hudl.project.pageObjects.LoginPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {

    private LoginPage login;
    public LoginSteps(){
        login = new LoginPage();
    }

    @Then("I expect to see the login page")
    public void iShouldBeSeeTheLoginPage() {
        Assert.assertEquals("Log In - Hudl", login.getTitle());
    }
}
