package stepDefinitions;

import hudl.project.pageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps {
    private HomePage homePage;

    public HomeSteps() {
        homePage = new HomePage();
    }

    @Given("I am on the Home page")
    public void iAmOnTheHomePage() {
        homePage.open();
    }

    @When("I click on the Log In button")
    public void iClickOnTheButton() {
        homePage.clickLoginButton();
    }
}
